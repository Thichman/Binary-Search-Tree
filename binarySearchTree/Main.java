//Tyson Hichman 
//Binary Search Tree
//11/27
package binarySearchTree;
//main class to test my Binary search tree
public class Main {

	public static void main(String[] args) {
		
		BinarySeachTree tree = new BinarySeachTree();
		
		System.out.println("Tree size before inserts: " + tree.getSize());
		
		tree.insert(9);
		tree.insert(1);
		tree.insert(10);
		tree.insert(5);
		tree.insert(50);
		tree.insert(100);
		tree.insert(90);
		tree.insert(99999);
		tree.insert(50);
		tree.insert(500);
		tree.insert(63);
		tree.insert(42);
		tree.insert(77);
		tree.insert(99);
		tree.insert(50);
		tree.insert(2);
		tree.insert(46);
		tree.insert(89);
		tree.insert(71);
		tree.insert(0);
		
		System.out.println("Tree size after inserts: " + tree.getSize());

		System.out.println("In order Traversal is: ");
		tree.inOrderTraversal();
		System.out.println();
		System.out.println("Post Order Traversal is: ");
		tree.postOrderTraversal();
		System.out.println();
		System.out.println("In order traversal is: ");
		tree.inOrderTraversal();
		System.out.println();
		
		System.out.println("Search for key 5: " + tree.search(5));
		System.out.println("Search for key 89: " + tree.search(89));
		System.out.println("Search for key 71: " + tree.search(71));
		System.out.println("Search for key 0: " + tree.search(0));
		System.out.println("Search for key 99999: " + tree.search(99999));
		System.out.println("Search for key 551: " + tree.search(551));
		System.out.println("Search for key 999944: " + tree.search(999944));
		System.out.println("Search for key 34: " + tree.search(34));
		System.out.println("Search for key 45: " + tree.search(45));
		System.out.println("Search for key 108: " + tree.search(108));
		
		
		tree.delete(0);
		tree.delete(100);
		tree.delete(77);
		tree.delete(99);
		
		System.out.println("Tree size after deletions: " + tree.getSize());
		System.out.println("In order Traversal after deletions is: ");
		tree.inOrderTraversal();
		System.out.println();
		System.out.println("Post Order Traversal after deletions is: ");
		tree.postOrderTraversal();
		System.out.println();
		System.out.println("In order traversal after dletions is: ");
		tree.inOrderTraversal();
		System.out.println();
	}

}
