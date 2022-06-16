package binarySearchTree;

//Holder class for my BST nodes just constructor and holder class for the nodes
//with getters and setters
public class BSTNode {

	private int key; 
    private BSTNode left;
    private BSTNode right; 
    private BSTNode p;

    public BSTNode(int key){ 
        this.key = key; 
        this.left = null;
        this.right = null;
        this.p = null;
    }

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public BSTNode getP() {
		return p;
	}

	public void setP(BSTNode p) {
		this.p = p;
	} 
    
    
} 

