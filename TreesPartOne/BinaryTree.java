package TreesPartOne;
import java.util.*;
import java.util.Scanner;

public class BinaryTree {

    public class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner scn = new Scanner(System.in);
    public void BinaryTree(){
        this.root = createTree();
    }

    private Node createTree() {
        Node nn =  new Node();
        int item = scn.nextInt();
        nn.val = item;
        System.out.println(item + " has  left child? ");
        boolean hlc = scn.nextBoolean();
        if(hlc){
            nn.left = createTree();
        }

        System.out.println(item + " has right child ");
        boolean hrc = scn.nextBoolean();
        if(hrc){
            nn.right = createTree();
        }


        return nn;
    }

    public void Display(){

        display(this.root);

    }

    private void display(Node temp) {
        if(temp==null){
            return;
        }

        String s = " " + temp.val;     

        if(temp.left!=null){
            s = temp.left.val + " <--" + s; 
        }else{
            s = " . <-- " + s ; 
        }

        if(temp.right!=null){
            s = s + " --> " + temp.right.val;
        }else{
            s = s + " --> " + " . ";
        }
        System.out.println(s);
        display(temp.left);
        display(temp.right);
    }


    public int Max(){

        return max(this.root);

    }

    private int max(Node temp) {

        if(temp==null){
            return Integer.MIN_VALUE;
        }

        int curr = temp.val;
        int leftMax = max(temp.left);
        int rightMax = max(temp.right);

        int max = Math.max(curr,Math.max(leftMax,rightMax));

        return max;
    }

    public int Min(){
        return min(this.root);
    }

    private int min(Node temp) {

        if(temp==null){
            return Integer.MAX_VALUE;
        }

        int curr = temp.val;

        int leftMin = min(temp.left);
        int rightMin = min(temp.right);

        int minVal = Math.min(curr,Math.min(leftMin,rightMin));
        return minVal;
    }

    public boolean find(int k){
        return find(this.root,k);
    }

    private boolean find(Node node, int k) {
        if(node==null){
            return false;
        }

        if(node.val==k){
            return true;
        }
        
        boolean left = find(node.left,k);
        boolean right = find(node.right,k);

        return left || right;
    }


    public int height(){
        return height(this.root);
    }

    private int height(Node temp){

        if(temp==null){
            return -1;
        }

        int left = height(temp.left);
        int right = height(temp.right);

        return Math.max(left,right) + 1;        
    }

    public void PreOrder(){
        preOrder(this.root);
    }

    private void preOrder(Node temp){

        if(temp==null){
            return;
        }

        System.out.print(temp.val + " ");

        preOrder(temp.left);
        preOrder(temp.right);
        

    }

    public void InOrder(){
        inOrder(this.root);
    }

    private void inOrder(Node temp){

        if(temp==null){
            return;
        }
        inOrder(temp.left);
        System.out.print(temp.val + " ");
        inOrder(temp.right);
    }

    public void PostOrder(){
        postOrder(this.root);
    }

    private void postOrder(Node temp) {
        
        if(temp==null){
            return;
        }

        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.val + " ");

    }

    public void LevelOrder(){

        Queue<Node> q = new LinkedList<>();
        q.add(this.root);

        while(!q.isEmpty()){

          Node temp =  q.remove();
          System.out.println(temp.val + " ");
          
          if(temp.left!=null){
            q.add(temp.left);
          }
          if(temp.right!=null){
            q.add(temp.right);
          }

        }
        System.out.println();
    }

}
