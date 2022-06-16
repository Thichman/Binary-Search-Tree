package binarySearchTree;


public class BinarySeachTree {

	private BSTNode root;
	private int size;
	
	public BinarySeachTree(){
		this.size = 0;
		this.root = null;
	}

	public int getSize() {
		return size;
	}
	
	//this is a swapper class for my nodes
	private void transplant(BSTNode u,BSTNode v) {
		if (u.getP() == null) {   
			this.root = v;
		}
		else if(u == u.getP().getLeft()){ 
			u.getP().setLeft(v); 
		}				
		else{
			u.getP().setRight(v);  
		}
		if( v != null) {
			v.setP(u.getP()); 
				
		}
		
	}
	
	//searching class that traverses the tree using the key value to try and find a certain value
	private BSTNode search(BSTNode x, int k) { 
		if (x == null) {               
			return null;
		}
		if( k == x.getKey()) {                
			return x;
		}
		if(k < x.getKey()) {                   
			return search(x.getLeft(), k);
		}
		else{
			return search(x.getRight(), k);
		}
			
	}
	
	public String search(int key) {
		BSTNode x = search(this.root, key);
		
		if (x == null) {
			return "Key not found";
		}
		return "Number " + x.getKey() +  " is found" ;
	}
	
	//finding the smallest value in the tree
	private BSTNode minimum(BSTNode x) {
		while( x.getLeft() != null) {
			x = x.getLeft();
		}
		return x;

	}
	
	public int minimum() {
		BSTNode x = minimum(this.root);
		return x.getKey();
	}
	
	//finding the largest node in the tree
	private BSTNode maximum(BSTNode x) {
		while( x.getRight() != null) {
			x = x.getRight();
		}
		return x;
	}
	
	public int maximum() {
		BSTNode x = maximum(this.root);
		return x.getKey();
	}
	
	//finding which node is right after the current node
	private BSTNode SUCCESSOR(BSTNode x) {
		if(x.getRight() != null) { 
			return minimum(x.getRight());
		}
		while(x.getP() != null && x == x.getP().getRight()) { 
			x = x.getP();
		}
		return x.getP();
				
	}
	
	public int successor(int key) {
		BSTNode x = search(this.root, key);
		BSTNode y = SUCCESSOR(x);
		
		return y.getKey();
	}
	
	private BSTNode PREDECESSOR(BSTNode x) {
		if(x.getLeft() != null) { 
			return maximum(x.getLeft());
		}
		while(x.getP() != null && x == x.getP().getLeft()) { 
			x = x.getP(); 
		}
		return x.getP();

	}
	
	public int predecessor(int key) {
		BSTNode x = search(this.root, key);
		BSTNode y = PREDECESSOR(x);
		
		return y.getKey();
	}
		
	//insert method to add nodes in the correct spot in the tree
	private void INSERT(BSTNode z) { 
		BSTNode y = null;
		BSTNode x = this.root;
		while( x != null) {  
			y = x; 
			if( z.getKey() < x.getKey()) {  
				x = x.getLeft();
			}
			else {
				x = x.getRight();  
			}
		}
		z.setP(y);
			
		if(y == null) { 
			this.root = z;
		}
		else if( z.getKey() < y.getKey()){
			y.setLeft(z);   
		}
		else{
			y.setRight(z);    
		}
		this.size++;
	}
	
	public void insert(int key) {
		BSTNode x = new BSTNode(key);
		INSERT(x);
	}
	
	//deletes a node out of the tree while keeping the tree structure
	private void DELETE(BSTNode z) {
		if(z.getLeft() == null) { 
			transplant(z, z.getRight());
		}
		else if(z.getRight() == null) { 
			transplant(z, z.getLeft());
		}
		else { 
			BSTNode y = minimum(z.getRight()); 
			if(y.getP() != z) {
				transplant(y, y.getRight());
				y.setRight(z.getRight());
				y.getRight().setP(y);
			}
			transplant(z, y); 
			y.setLeft(z.getLeft());
			y.getLeft().setP(y);
		}
		this.size--;
	}
	
	public void delete(int key) {
		BSTNode x = search(this.root, key);
		DELETE(x);
	}

	//these are the three traversal methods to accurately move throughout the tree
	private void preOrderTraversal(BSTNode T){            
		if(T != null) {                    
			System.out.print(T.getKey() + ", ");
			preOrderTraversal(T.getLeft());  
			preOrderTraversal(T.getRight());
		}
	}
	
	public void preOrderTraversal() {
		
		preOrderTraversal(this.root);
	}
	
	private void inOrderTraversal(BSTNode T){
		if(T != null) {
		inOrderTraversal(T.getLeft());
		System.out.print(T.getKey() + ", ");
	   inOrderTraversal(T.getRight());
		}
	}
	
	public void inOrderTraversal() {
		
		inOrderTraversal(this.root);
	}
	
	private void postOrderTraversal(BSTNode T){      
		if(T != null) {
			postOrderTraversal(T.getLeft());
			postOrderTraversal(T.getRight());
			System.out.print(T.getKey() + ", ");
		}
	}
	public void postOrderTraversal() {
		postOrderTraversal(this.root);
	}
}
