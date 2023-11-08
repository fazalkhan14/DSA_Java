
public class MyBinaryTree {

	TreeNode root;
	
	MyBinaryTree(){
		this.root = null;
	}
	
	public void insert(int value) {
		TreeNode currentNode = this.root;
		TreeNode prevNode = new TreeNode();
		boolean flag = false;
		if(currentNode == null) {
			this.root = new TreeNode();
			this.root.value = value;
			return;
		}
		while(flag != true) {
			if(currentNode == null) {
				currentNode = new TreeNode();
				if(value < prevNode.value)
					prevNode.left = currentNode;
				else
					prevNode.right = currentNode;
				currentNode.value = value;
				flag = true;
			}
			else if(value < currentNode.value) {
				prevNode = currentNode;
				currentNode = currentNode.left;
			}
			else {
				prevNode = currentNode;
				currentNode = currentNode.right;
			}
		}
	}
	
	public Object lookup(int value) {
		int valueFound = 0;
		boolean flag = false;
		TreeNode currentNode = this.root;
		
		while(flag != true && currentNode != null) {
			if(value == currentNode.value) {
				valueFound = currentNode.value;
				flag = true;
			}
			else if(value < currentNode.value) {
				currentNode = currentNode.left;
			}
			else {
				currentNode = currentNode.right;
			}
				
		}
		
		return valueFound == 0 ? false : valueFound; 
	}
	
	public void remove(int value) {
	    if (this.root == null) {
	        return;
	      }

	      TreeNode nodeToRemove = this.root;
	      TreeNode parentNode = null;
	      while (nodeToRemove.value != value) { //Searching for the node to remove and it's parent
	        parentNode = nodeToRemove;
	        if (value < nodeToRemove.value) {
	          nodeToRemove = nodeToRemove.left;
	        } else if (value > nodeToRemove.value) {
	          nodeToRemove = nodeToRemove.right;
	        }
	      }

	      TreeNode replacementNode = null;
	      if (nodeToRemove.right != null) { //We have a right node
	        replacementNode = nodeToRemove.right;
	        if(replacementNode.left == null) { //We don't have a left node
	          replacementNode.left = nodeToRemove.left;
	        } else { //We have a have a left node, lets find the leftmost
	        	TreeNode replacementParentNode = nodeToRemove;
	          while (replacementNode.left != null) {
	            replacementParentNode = replacementNode;
	            replacementNode = replacementNode.left;
	          }
	          replacementParentNode.left = null;
	          replacementNode.left = nodeToRemove.left;
	          replacementNode.right = nodeToRemove.right;
	        }
	      } else if(nodeToRemove.left != null) {//We only have a left node
	        replacementNode = nodeToRemove.left;
	      }

	      if(parentNode == null) {
	        root = replacementNode;
	      } else if(parentNode.left == nodeToRemove) { //We are a left child
	        parentNode.left = replacementNode;
	      } else { //We are a right child
	        parentNode.right = replacementNode;
	      }
	    
	}
	
}
