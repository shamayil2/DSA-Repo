package September20_HW;
import java.util.Scanner;
public class BinaryTree {
   
    public class Node{
        int val;
        Node left;
        Node right;

        public Node(){

        }

        public Node(int val){
            this.val = val;
        }

    }

    Scanner scn = new Scanner(System.in);
    private Node root;

    public BinaryTree(){
        this.root = createTree();
    }

    private Node createTree(){

        Node nn = new Node();
        nn.val =  scn.nextInt();

        boolean hlc = scn.nextBoolean();
        if(hlc){
           nn.left =  createTree();
        }

        boolean hrc = scn.nextBoolean();
        if(hrc){
           nn.right= createTree();
        }

        return nn;
    }

    public void Display(){
        display(this.root);
    }

    private void display(Node node){
        if(node==null){
            return;
        }

        String s = node.val + " ";
        

    }

}
