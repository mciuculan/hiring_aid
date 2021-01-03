import java.util.*;

public class Graph {

    class Node {
        Consumer name;
        int value;
    }

    private int V;   // No. of vertices
    private LinkedList<Node> adj[]; //Adjacency Lists

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<Node>();
    }

    // Function to add an edge into the graph
    void addEdge(Node v, Node w) {
        adj[v.value].add(w);
    }

    // prints BFS traversal from a given source s
    int BFS(Node s, Node d) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Node> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s.value] = true;
        queue.add(s);
        int degree = 0;

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            degree += 1;
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Node> i = adj[s.value].listIterator();
            while (i.hasNext()) {
                Node n = i.next();
                if (n.name.getResume().getInformation().getName().compareTo(d.name.getResume().getInformation().getName()) == 0)
                    return  degree;
                if (!visited[n.value]) {
                    visited[n.value] = true;
                    queue.add(n);
                }
            }
        }
        return degree;
    }
}
