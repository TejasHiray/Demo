import java.util.*;
public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    static class BinaryTreeQ{
        static int idx=-1;
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;

            }
            Node newNode=new Node(node[idx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;

        }
        
    }
    // public static void preorder(Node root){
    //     if(root == null){
    //         return;
    //     }
    //     System.out.println(root.data+" ");
    //     preorder(root.left);
    //     preorder(root.right);
    // }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);

                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeQ tree=new BinaryTreeQ();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.data);
        levelOrder(root);
    }
} 