 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
    
        Node newNode = new Node(data);
        
        if(root == null) 
            return root = newNode;
        
        Node trav = root;
        while(true) {
            if(data < trav.data) {
                if(trav.left != null)
                    trav = trav.left;
                else {
                    trav.left = newNode;
                    break;
                }
            } else {
                if(trav.right != null)
                    trav = trav.right;
                else {
                    trav.right = newNode;
                    break;
                }
            }
        }
    	return root;
    }