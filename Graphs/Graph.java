package Graphs;
import java.util.HashMap;
public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>> graph;

    public Graph(int v){
        graph = new HashMap<>();

        for(int i=0;i<=v;i++){
            graph.put(i,new HashMap<>());
        }
    }

}
