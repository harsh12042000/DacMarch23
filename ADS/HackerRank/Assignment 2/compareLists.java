static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode trav1 = head1;
        SinglyLinkedListNode trav2 = head2;
        
        while(trav1!= null && trav2 != null) {
            if(trav1.data != trav2.data)
                return false;
            
            trav1 = trav1.next;
            trav2 = trav2.next;
        }
        
        if(trav1 == null && trav2 == null) {
            return true;
        } 

        return false;
    }