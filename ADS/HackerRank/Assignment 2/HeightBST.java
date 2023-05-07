	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {        
      	if(root == null)
           return -1;
        
        int hl = height(root.left);
        int hr = height(root.right);
        
        int max = hl > hr ? hl : hr;
        return max+1;
    }