package week7;

import java.util.*;

public class weekSeven {
	public static Map <Integer,Integer> nodeParent = new LinkedHashMap<Integer,Integer>();
	static class Node
	{
	    int key;
	    Node left, right, parent;
	    boolean burntstatus;
	}
	static Node newNode(int item)
	{
	    Node temp = new Node();
	    temp.key = item;
	    temp.left = null;
	    temp.right = null;
	    temp.parent = null;
	    temp.burntstatus=false;
	    return temp;
	}
	static void inorder(Node root)
	{
	    if (root != null)
	    {
	        inorder(root.left);
	        if (root.parent == null) {
	        	nodeParent.put(root.key,-1);
	        	
	        }
	        else {
	        	
	        	nodeParent.put(root.key,root.parent.key);
	        }
	        inorder(root.right);
	    }
	}
	public static int check() {
		Stack<Integer> n = new Stack<Integer>();
		Stack <ArrayList<Integer>> s = new Stack <ArrayList<Integer>>();
		 for (Map.Entry mapElement : nodeParent.entrySet()) {
	            int key = (int)mapElement.getKey();
	            int value = (int)mapElement.getValue();
	            ArrayList<Integer> arr = new ArrayList<Integer>();
	            if(value!=-1) {
	            	 if(!n.contains(value)) {
	 	            	for (Map.Entry insidemapElement : nodeParent.entrySet()) {
	 		            	if((int)insidemapElement.getKey()==value || (int)insidemapElement.getValue()==value) {
	 		            		arr.add((int)insidemapElement.getKey());
	 		            		n.push((int)insidemapElement.getKey());
	 		            	}
	 		            }
	 		            for (Map.Entry insidemapElement : nodeParent.entrySet()) {
	 		            	if((int)insidemapElement.getKey()==value || (int)insidemapElement.getValue()==value) {
	 		            		arr.add((int)insidemapElement.getValue());
	 		            		n.push((int)insidemapElement.getValue());
	 		            	}
	 		            }
	 		            s.add(arr);
	 	            }
	            }
	        }

		 int rootnode=-99999;
		 for (Map.Entry insidemapElement : nodeParent.entrySet()) {
          	if((int)insidemapElement.getValue()==-1) {
          		rootnode=((int)insidemapElement.getKey());
          		
          	}
          }
         if(!n.contains(rootnode)) {
        	 ArrayList<Integer> arr = new ArrayList<Integer>();
         	s.add(arr);
         }
		 return s.size(); 
	}
	static Node insert(Node node, int key)
	{
	    if (node == null) return newNode(key);
	    if (key < node.key)
	    {
	        Node lchild = insert(node.left, key);
	        node.left = lchild;
	        lchild.parent = node;
	    }
	    else if (key > node.key)
	    {
	        Node rchild = insert(node.right, key);
	        node.right = rchild;
	        rchild.parent = node;
	    }
	    return node;
	}

	public static void main(String[] args)
	{
	   
	    Node root = null;
		root = insert(root, 0);
		insert(root, 0);
		insert(root, 0);
		insert(root, 0);
		insert(root, 0);

	    inorder(root);
	    int res=check();
	    System.out.println(res);
	}
}