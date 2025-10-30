package Graphs_HW;

import java.util.HashSet;

public class GraphClient {
    public static void main(String[] args) {
        Graph g1 = new Graph(5);

        g1.addEdge(1,5,10);
        g1.addEdge(1,3,10);
        g1.addEdge(3,2,10);
        g1.addEdge(3,5,10);
        

        g1.Display();

        // System.out.println(g1.containsV(6));
        // System.out.println(g1.containsEdge(6, 7));
        // g1.removeEdge(6, 7);
        // System.out.println(g1.containsEdge(6, 7));
        // g1.removeV(6);
        // System.out.println(g1.containsV(6));
        // System.out.println(g1.countEdges());

        // System.out.println(g1.hasPath(1, 4, new HashSet<>()));
        // System.out.println(g1.hasPath(1, 3, new HashSet<>()));
        // System.out.println(g1.hasPath(3, 4, new HashSet<>()));

       System.out.println(g1.DFS(3,4));
       

    }
}
