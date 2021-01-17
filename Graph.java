import java.util.*;

public class Graph {

    // We use Hashmap to store the edges in the graph
    private Map<Consumer, List<Consumer> > consumers = new HashMap<>();

    // This function adds a new vertex to the graph
    public void addVertex(Consumer s)
    {
        consumers.put(s, new LinkedList<Consumer>());
    }

    // This function adds the edge
    // between source to destination
    public void addEdge(Consumer source,
                        Consumer destination)
    {

        if (!consumers.containsKey(source))
            addVertex(source);

        if (!consumers.containsKey(destination))
            addVertex(destination);

        consumers.get(source).add(destination);
            consumers.get(destination).add(source);
    }

    // This function gives whether
    // a vertex is present or not.
    public boolean hasVertex(Consumer s)
    {
        if (consumers.containsKey(s)) {
            return true;
        }
        else {
            return false;
        }
    }

    // This function gives whether an edge is present or not.
    public boolean hasEdge(Consumer s, Consumer d)
    {
        if (consumers.get(s).contains(d)) {
            return true;
        }
        else {
            return false;
        }
    }
    public void bfs(Consumer s, Consumer d) {

    }
}
