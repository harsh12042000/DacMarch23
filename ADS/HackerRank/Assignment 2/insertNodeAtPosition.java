public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        if(llist == null) 
            return null;
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        if(position == 0) {
            temp.next = llist;
            return temp;
        }
        SinglyLinkedListNode p = llist;
        for (int i=0; i<position-1; i++) {
            p = p.next;
        }
        SinglyLinkedListNode next = p.next;
        p.next = temp;
        temp.next = next;
        return llist;
    }