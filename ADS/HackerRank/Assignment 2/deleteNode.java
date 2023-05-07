public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int pos) {
    // Write your code here
        if(llist == null)
            return llist;
        
        SinglyLinkedListNode trav = llist;
        SinglyLinkedListNode temp = trav.next;
        
        if(pos < 0 || pos == 0)
            llist = llist.next;
        else {
            int count = 0;
            while(temp != null) {
                count++;
                if(count == pos)
                    break;
                temp = temp.next;
                trav = trav.next;
            }
            trav.next = temp.next;
        }
        return llist;
    }