public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        
        if(llist == null)
            return llist;
        
        SinglyLinkedListNode current = llist;
    
        while(current != null) {
            SinglyLinkedListNode trav = current;
            while (trav.next != null) {
                if (trav.next.data == current.data) {
                    trav.next = trav.next.next;
                } else {
                    trav = trav.next;
                }
            }
            current = current.next;
        }
        return llist;
    }