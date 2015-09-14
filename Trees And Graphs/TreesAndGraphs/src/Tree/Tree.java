package Tree;

import java.util.ArrayList;

public class Tree<T> {
	public static class TreeNode<T> {
		private T value;
		private boolean hasParent;
		TreeNode<T> parent;
		T data;
		private ArrayList<TreeNode<T>> children;
		public TreeNode(T data, TreeNode<T> parent){
	        this.data = data;
	        this.parent = parent;
	    }
		
		public TreeNode(T value) {
			if (value == null) {
				throw new IllegalArgumentException("Can not insert null value!");
			}
			this.value = value;
			this.children = new ArrayList<TreeNode<T>>();
		}
		public T getValue(){
			return this.value;
		}
		public void setValue(T value){
			this.value = value;
		}
		public void addChild(TreeNode<T> child){
			if (child == null) {
				throw new IllegalArgumentException("Can not insert null value!");
			}
			if (child.hasParent) {
				throw new IllegalArgumentException(
						"The node already has a parent!");
			}
			child.hasParent = true;
			this.children.add(child);
		}
		public void setParent(TreeNode<T> parent){
	        parent.addChild(this);
	        this.parent = parent;
	    }
		public boolean isRoot(){
	        return (this.parent == null);
	    }
		public void removeParent(){
	        this.parent = null;
	    }
		public TreeNode<T> getChild(int index){
			return this.children.get(index);
		}
		public int getChildrenCount(){
			return this.children.size();
		}
	}
	private TreeNode<T> root;
	
	public Tree(T value){
		if (value == null) {
			throw new IllegalArgumentException(
					"Cannot insert null value!");
		}
		this.root = new TreeNode<T>(value);
	}
	public Tree(T value, Tree<T> ...children) {
		this(value);
		for(Tree<T> child: children){
			this.root.addChild(child.root);
		}
	}
	public TreeNode<T> getRoot(){
		return this.root;
	}
	public ArrayList<TreeNode<T>> getChildNodes(){
		if (this.root != null) {
			return this.root.children;
		}
		return new ArrayList<Tree.TreeNode<T>>();
	}
	private void printDFS(TreeNode<T> root, String spaces){
		if (this.root == null) {
			return;
		}
		System.out.println(spaces + root.getValue());
		TreeNode<T> child = null;
		for (int i = 0; i < root.getChildrenCount(); i++) {
			child = root.getChild(i);
			printDFS(child, spaces + "	");
		}
	}
	public void printDFS(){
		this.printDFS(this.root,new String());
	}
	public static void main(String[] args) {
		TreeNode<String> parentNode = new TreeNode<String>("Parent"); 
		System.out.println("Parent depth: " + depth(parentNode));
		
		Tree<Integer> tree =
				new Tree<Integer>(7,
						new Tree<Integer>(19,
								new Tree<Integer>(1),
								new Tree<Integer>(12),
								new Tree<Integer>(31)),
				new Tree<Integer>(21),
				new Tree<Integer>(14,
						new Tree<Integer>(23),
						new Tree<Integer>(6))
				);
		tree.printDFS();
	}
	//unfinished logic...
	public static <T> int depth(TreeNode<T> tree){
    	int d = 0;
    	return d;
    }
}


