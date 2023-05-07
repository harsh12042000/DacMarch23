

    /*
     * Complete the 'sortedInsert' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_DOUBLY_LINKED_LIST llist
     *  2. INTEGER data
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
    
    // Write your code here
        
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        
        if(head == null){
            return newNode;
        }
        
        DoublyLinkedListNode trav = head;
        
        while(trav != null){
        if (trav.data >= data){
            newNode.prev = trav.prev;
            newNode.next = trav;
            trav.prev = newNode;
            if (newNode.prev == null){
                return newNode;
            } else {
                newNode.prev.next = newNode;
                return head;
            }
        }
        if (trav.next == null){
            newNode.prev = trav;
            newNode.next = null;
            trav.next = newNode;
            break;
        }
        trav = trav.next;
    }
    return head;
    }

