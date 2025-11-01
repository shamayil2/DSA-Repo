package Graphs_HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Graph {

    private HashMap<Integer, HashMap<Integer, Integer>> graph;

    public Graph(int v) {

        graph = new HashMap<>();

        for (int i = 1; i <= v; i++) {
            graph.put(i, new HashMap<>());
        }

    }

    public void addVertice(int v) {
        graph.put(v, new HashMap<>());
    }

    public void addEdge(int v1, int v2, int w) {

        graph.get(v1).put(v2, w);
        graph.get(v2).put(v1, w);

    }

    public boolean containsV(int v1) {
        return graph.containsKey(v1);
    }

    public boolean containsEdge(int v1, int v2) {
        return graph.get(v1).containsKey(v2);
    }

    public void removeEdge(int v1, int v2) {

        graph.get(v1).remove(v2);
        graph.get(v2).remove(v1);
    }

    public void removeV(int v1) {

        for (Integer nbr : graph.get(v1).keySet()) {
            graph.get(nbr).remove(v1);
        }

        graph.remove(v1);

    }

    public int countEdges() {
        int count = 0;
        for (Integer nbr : graph.keySet()) {

            count += graph.get(nbr).size();

        }
        return count / 2;
    }

    public void Display() {

        for (Integer v : graph.keySet()) {
            System.out.println(v + " --> " + graph.get(v));
        }

    }

    public boolean hasPath(int src, int dest, HashSet<Integer> vis) {
        if (src == dest) {
            return true;
        }

        vis.add(src);
        for (Integer nbr : graph.get(src).keySet()) {
            if (vis.contains(nbr)) {
                continue;
            }
            boolean ans = hasPath(nbr, dest, vis);
            if (ans) {
                return true;
            }
        }
        vis.remove(src);
        return false;

    }

    public void printAllPath(int src, int dest, HashSet<Integer> vis, String s) {

        if (src == dest) {
            System.out.println(s);
            return;
        }
        vis.add(src);
        for (Integer nbr : graph.get(src).keySet()) {
            if (vis.contains(nbr)) {
                continue;
            }
            printAllPath(nbr, dest, vis, s + " ==> " + nbr);
        }

        vis.remove(src);

    }

    public boolean BFS(int src , int dest){

        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> vis = new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){

        int num = q.remove();    
        if(num==dest){
            return true;
        }    
        // if(vis.contains(num)){
        //     continue;
        // }
        vis.add(num);

        for(Integer nbrs: graph.get(num).keySet()){
            if(!vis.contains(nbrs)){
                q.add(nbrs);
            }
        }

        }

        return false;
    }   

    public boolean DFS(int src,int dest){

        Stack<Integer> st = new Stack<>();
        HashSet<Integer> vis = new HashSet<>();

        st.push(src);
        while(!st.isEmpty()){

            int num = st.pop();

            if(num==dest){
                return true;
            }

            // if(vis.contains(num)){
            //     continue;
            // }

            vis.add(num);

            for(Integer nbrs : graph.get(num).keySet()){

                if(!vis.contains(nbrs)){
                   
                    st.push(nbrs);

                }

            }

        }

        return false;
    }

}
