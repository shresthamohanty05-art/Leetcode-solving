import java.util.*;

import javax.management.Query;
public class TreePractise {
    
    private class Node{
        int value;
        Node left;
        Node right ;

       public Node(int value){
        this.value = value ;
       }
    }

    private Node root ;

    public void populate(Scanner sc){
       System.out.println("Enter the value of the root node: ");
       int value = sc.nextInt();

       root = new Node(value);
       populate(sc, root);
    }

    public void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter the value to left of " + node.value);
        
        boolean left = sc.nextBoolean();

        if(left){
            System.out.println("Enter the value : ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter the value to right of " + node.value);

        boolean right = sc.nextBoolean();

         if(right){
            System.out.println("Enter the value : ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(root , "");
    }

    public void display(Node node, String indent){

        if(node == null){
            return;
        }
        System.out.println(indent + node.value);

       display(node.left , "\t");
       display(node.right , "\t");
    }

    public void displayIn(){
        display(root , "");
    }

    public void displayIn(Node node, String indent){

        if(node == null){
            return;
        }

            display(node.left , indent + "\t");

        System.out.println(indent + node.value);

       display(node.right , indent +  "\t");
    }

     public void displayPost(){
        display(root , "");
    }

    public void displayPost(Node node, String indent){

        if(node == null){
            return;
        }

            display(node.left , indent + "\t");

       display(node.right , indent +  "\t");

       
        System.out.println(indent + node.value);
    }

    public void displayLevelOrder(){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
           Node node = queue.remove();
           
           System.out.println(node.value);

           if(node.left != null){
            queue.add(node.left);
           }

             if(node.right != null){
            queue.add(node.right);
           }
        }
    }
}
