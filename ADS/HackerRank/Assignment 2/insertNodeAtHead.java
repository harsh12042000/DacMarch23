static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode trav;
        
        if(llist == null) {
            llist = newNode; 
            return llist;
        } 
        trav = newNode;
        trav.next = llist;
        llist = trav;
        return llist;
    }