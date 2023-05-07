public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
       
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = head;
       
        while (current != null) {
            SinglyLinkedListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
       
        return prev;
}

public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    // Write your code here
        SinglyLinkedListNode trav = head;
        Stack<Integer> s = new Stack<>();
        while(trav != null){
            s.push(trav.data);
            trav = trav.next;
        }
        trav = head;
        while(trav != null){
            trav.data = s.pop();
            trav = trav.next;
        }
        return head;
    }
