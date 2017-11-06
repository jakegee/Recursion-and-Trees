/** @author Jacob Smith
 * 
 * This class contains the solution for Worksheet2
 */

public class Worksheet2 implements Worksheet2Interface {
    
	// Exercise 1
	
    public static Tree negateAll(Tree t) { // negateAll returns the negative of positive values, or vice versa
    	if (t.isEmpty()) {
    		return new Tree(); // returns an empty new tree if tree is empty
    	} else { // else return the value of the root node multiplied by -1 (inverse) the run the left, then right side
		return new Tree(t.getValue()*-1,negateAll(t.getLeft()),negateAll(t.getRight())); // through the negateAll function
    	}
    }

    // Exercise 2

    public static Tree mirror(Tree t) { // mirror alternates the left and right subtrees
    	if (t.isEmpty()) {
			return new Tree(); // if tree is empty, return an empty tree
		} else { // else return a new tree with the root node, then the right and left side are run through the mirror function
			return new Tree(t.getValue(), mirror(t.getRight()),mirror(t.getLeft())); 
		}
	}

    // Exercise 3

    public static List postorder(Tree t) { // postorder traverses a tree, prints the left, right, then root node into a list
    	if (t.isEmpty()) {
			return List.empty(); // returns an empty list for an empty tree
    	} else { // List function to append the left, run through the left subtree, append the right subtree through postorder, then add the root node value at the end
    		return ListOps.append(postorder(t.getLeft()), ListOps.append(postorder(t.getRight()),List.cons(t.getValue(), List.empty())));
    	}
    }

    // Exercise 4

    public static boolean allPositive(Tree a) { // returns true for positive tree and false for negative
    	if (a.isEmpty()) {
    		return true; // an empty tree is a positive tree
    	} else if (a.getValue() < 0) { // if the node value is less than 0 it's false
    		return false;
    	} else { // else run through the left subtree through the function to return true
			return (allPositive(a.getLeft()));
    	}
    }

		// Exercise 5

    public static boolean isSearchTree(Tree a) { // indicates true for a binary search tree or false if not
    	if (a.isEmpty()) {
			return true; // an empty tree is a bst
    	} else if (!a.getLeft().isEmpty() && minimumValueOfTree(a.getLeft()) > a.getValue()) {
    		return false; // if the left subtree isn't empty and the minimum value of the left is greater than the root it's false 
    	} else if (!a.getRight().isEmpty() &&  maximumValueOfTree(a.getRight()) < a.getValue()) {
    		return false; // if the right subtree isn't empty and the maximum value of the right is less than the root it's false 
    	} else { // else the left and right subtrees are run through the function to return the boolean result
    	return (isSearchTree(a.getLeft()) && isSearchTree(a.getRight()));
    	}
    }
    
    public static int minimumValueOfTree(Tree a) { // Helper methods were defined to work through this exercise
    	if (a.getLeft().isEmpty()) {
    		return a.getValue(); // if the left subtree is empty return the root node
    	} else {
    		return minimumValueOfTree(a.getLeft()); // else just return the min value of the left subtree
    	}
    }
    public static int maximumValueOfTree(Tree a) {
    	if (a.getRight().isEmpty()) {
    		return a.getValue(); // if the left right is empty return the root node
    	} else {
    		return maximumValueOfTree(a.getRight()); // else just return the max value of the right subtree
    	}
    }

    // Exercise 6

    public static void printDescending(Tree a) { // returns a descending numerical list based on the trees
    	if (a.isEmpty()) {
    		return; // return for an empty tree
    	} else {
    		printDescending(a.getRight()); // right subtree through the function first (since it's the larger subtree)
    		System.out.println(a.getValue()); // next just print the root node as it's the second largest
    		printDescending(a.getLeft()); // left subtree through the function last (since it's the lower subtree)
    	}
    }

		// Exercise 7

    public static int max(Tree a) { // returns the maximum value in a bst
    	if (a.isEmpty()) {
    		return 0; // if the tree is empty than the maximum must be 0
    	} if (a.getLeft().isEmpty() && a.getRight().isEmpty()) { // if the left and right subtrees are empty
    		return a.getValue(); // return the root node
    	} else { // else return the maximum node value from the right subtree and the max function through the right
    		return Math.max(a.getRight().getValue(), max(a.getRight()));
    	}
    }

    // Exercise 8
/*
 * There delete function traverses a BST searching for the value x, in order to delete that node from the tree
 * and shift up the nodes that are to the left or right of the tree. It checks to see if the x is lesser or greater
 * than the root node, it checks to see if the left or right subtrees are empty in order to return the left or right
 * subtree, and else it then finally goes through the entire in order to find x and delete it.
 */
    public static Tree delete(int x, Tree a) {
    	if (a.isEmpty()) {
				return a; 
    	} else if (x < a.getValue()) {
    		return new Tree(a.getValue(), delete(x, a.getLeft()), a.getRight());
    	} else if (x > a.getValue()) {
    		return new Tree(a.getValue(), a.getLeft(), delete(x, a.getRight()));			
    	} else if (a.getLeft().isEmpty() && a.getRight().isEmpty()) {
    		return new Tree();
    	} else if (a.getLeft().isEmpty()) {
    		return a.getRight();
    	} else if (a.getRight().isEmpty()) {
    		return a.getLeft();
    	} else {
    		return new Tree(x, delete(x, a.getLeft()), a.getRight());
    	}
    }

		// Exercise 9
    public static boolean isHeightBalanced(Tree a) { // returns true for a height balanced tree and false if not
    	if (a.isEmpty()) {
				return true; // an empty tree is technically balanced so true
    	} else if (Math.abs(a.getLeft().getHeight()-a.getRight().getHeight())>1){
    		return false; // absolute value of the left height subtracted by the right height is greater than 1 is false
    	} else { // a height balanced tree has a height difference of 1 which is why anything greater is false.
    		return isHeightBalanced(a.getLeft()) && isHeightBalanced(a.getRight()); // else we run the function through
    		// the left and right subtrees
    	}
    }
		// Exercise 10

    public static Tree insertHB(int x, Tree a) {
				return new Tree();
    }

    public static Tree deleteHB(int x, Tree a) {
				return new Tree();
    }
    
}