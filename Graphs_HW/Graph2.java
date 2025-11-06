package Graphs_HW;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Stack;
public class Graph2 {
   
        private HashMap<Integer,HashMap <Integer,Integer>> graph2;

        public Graph2(int m){

            graph2 = new HashMap<>();

            for (int i = 1; i <= m; i++) {

                graph2.put(i,new HashMap<>());
            }
        }
        
        public void addVertice(int v1){
           graph2.put(v1,new HashMap<>()); 
        }

        public void addEdge(int v1,int v2,int w){

            graph2.get(v1).put(v2,w);
            graph2.get(v2).put(v1,w);

        }

        public void BFT(){
            
            Queue<Integer> q = new LinkedList<>();
            HashSet<Integer> vis = new HashSet<>();

            for(Integer key : graph2.keySet()){

                if(vis.contains(key)){
                    continue;
                }

                q.add(key);
                while(!q.isEmpty()){
                  int num = q.remove();
                  
                  if(vis.contains(num)){
                    continue;
                  }

                  vis.add(num);
                  System.out.print(num + " ");

                  for(Integer nbrs: graph2.get(num).keySet()){
                    if(!vis.contains(nbrs)){
                        q.add(nbrs);
                    }
                  }

                }

                System.out.println();

            }


        }

        public void DFT(){

            Stack<Integer> st = new Stack<>();
            HashSet<Integer> vis = new HashSet<>();

            for(Integer key: graph2.keySet()){

                if(vis.contains(key)){
                    continue;
                }
                st.push(key);
                while(!st.isEmpty()){

                    int num = st.pop();

                    if(vis.contains(num)){
                        continue;
                    }

                    vis.add(num);
                    System.out.print(num + " ");

                    for(Integer nbrs: graph2.get(num).keySet()){

                        if(!vis.contains(nbrs)){
                            st.add(nbrs);
                        }
                    }

                }

                System.out.println();
            }
        }

        public boolean isCyclic(){
            Stack<Integer> st = new Stack<>();
            HashSet<Integer> vis = new HashSet<>();
            
            for(Integer src:graph2.keySet()){
                if(vis.contains(src)){
                    continue;
                }
                st.push(src);
                while(!st.isEmpty()){

                int num = st.pop();
                if(vis.contains(num)){
                    return true;
                }
                vis.add(num);
                System.out.print(num + "  ");
                for(Integer nbrs: graph2.get(num).keySet()){
                    if(!vis.contains(nbrs)){
                        st.push(nbrs);
                    }
                }

            }

            }

            




            return false;
        }

        public boolean isConnected(){

            Queue<Integer> q = new LinkedList<>();
            HashSet<Integer> vis = new HashSet<>();
            int count = 0;
            for(Integer src: graph2.keySet()){

                if(vis.contains(src)){
                    continue;
                }
                q.add(src);
                count++;
                while(!q.isEmpty()){

                    int num = q.remove();

                    if(vis.contains(num)){
                        continue;
                    }
                    System.out.print(num + " ");
                    vis.add(num);
                    for(Integer nbrs: graph2.get(num).keySet()){
                        if(!vis.contains(nbrs)){
                            q.add(nbrs);
                        }
                    }

                }

            }
            return count==1;
        }

        public boolean isTree(){
            HashSet<Integer> vis = new HashSet<>();
            Queue<Integer> q = new LinkedList<>();
            int count = 0;
            for(Integer src:graph2.keySet()){

                if(vis.contains(src)){
                    continue;
                }
                count++;
                q.add(src);
                while(!q.isEmpty()){
                    int num = q.remove();

                    if(vis.contains(num)){
                        return false;
                    }

                    vis.add(num);

                    for(Integer nbrs:graph2.get(num).keySet()){
                        if(!vis.contains(nbrs)){
                            q.add(nbrs);
                        }
                    }

                }


            }

            return count==1;
        }

     public static void main(){

        Graph2 g2 = new Graph2(4);
        g2.addEdge(1,2,10);
        g2.addEdge(2,4,10);
        g2.addEdge(3,4,10);
        g2.BFT();
        g2.DFT();
        System.out.println(g2.isCyclic());
        System.out.println(g2.isConnected());
        System.out.println(g2.isTree());

       
        
    }
}
