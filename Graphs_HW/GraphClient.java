package Graphs_HW;

import java.util.HashSet;

public class GraphClient {
    public static void main(String[] args) {
        Graph g1 = new Graph(3);

        g1.addEdge(1,3,10);
        g1.addEdge(3,2,10);
        g1.Display();
       System.out.println(g1.DFS(1,2));
       

    }
}
