import java.util.*;

public class Graph {
    private static Graph single_instance = null;

    private Graph() { }

    public static Graph getInstance() {
        if (single_instance == null)
            single_instance = new Graph();
        return single_instance;
    }
    // We use Hashmap to store the edges in the graph
    private Map<Consumer, List<Consumer> > consumers = new HashMap<>();

    // This function adds a new vertex to the graph
    public void addConsumer(Consumer s)
    {
        consumers.put(s, new LinkedList<Consumer>());
    }

    // This function adds the edge
    // between source to destination
    public void addRelation(Consumer source, Consumer destination)
    {
        if (!consumers.containsKey(source))
            addConsumer(source);

        if (!consumers.containsKey(destination))
            addConsumer(destination);

        consumers.get(source).add(destination);
        consumers.get(destination).add(source);
    }

    // This function gives whether
    // a vertex is present or not.
    public boolean hasVertex(Consumer s)
    {
        return consumers.containsKey(s);
    }

    // This function gives whether an edge is present or not.
    public boolean hasEdge(Consumer s, Consumer d)
    {
        return consumers.get(s).contains(d);
    }
    public Recruiter getSuitableRecruiter(Consumer s) {
        boolean[] visited = new boolean[consumers.size()];
        LinkedList<Consumer> queue = new LinkedList<>();
        Recruiter furthest = null;
        visited[s.getUnique_id()] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.poll();
            for (Company c : Application.getInstance().getCompanies()) {
                for (Recruiter r : c.getRecruiters()) {
                    if (r.compareTo(s) > 0)
                        furthest = r;
                }
            }
            for (Consumer c : s.getConsumerList()) {
                if (!visited[c.getUnique_id()]) {
                    visited[c.getUnique_id()] = true;
                    queue.add(c);
                }
            }
        }
        return furthest;
    }
    public Integer getDistance(Consumer s, Consumer d) {
        boolean[] visited = new boolean[consumers.size()];
        LinkedList<Consumer> queue = new LinkedList<>();
        visited[s.getUnique_id()] = true;
        queue.add(s);
        int level = 0;
        while (queue.size() != 0) {
            s = queue.poll();
            if (s.compareTo(d) == 0)
                return level;
            for (Consumer c : s.getConsumerList()) {
                if (!visited[c.getUnique_id()]) {
                    level += 1;
                    visited[c.getUnique_id()] = true;
                    queue.add(c);
                }
            }
        }
        return 0;
    }
}
