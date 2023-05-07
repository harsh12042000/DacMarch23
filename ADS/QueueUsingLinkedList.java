import java.util.*;

class QNode {
    int data;
    QNode next;
    
    QNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    QNode front, rear;
    
    Queue() {
        this.front = this.rear = null;
    }
    
    void enqueue(int data) {
        QNode temp = new QNode(data);
        
        if(this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        
        this.rear.next = temp;
        this.rear = temp;
    }
    
    void dequeue() {
        if(this.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        
        QNode temp = this.front;
        this.front = this.front.next;
        
        if(this.front == null)
            this.rear = null;
    }
    
    void display() {
        if(this.rear == null || this.front == null) {
            System.out.println("NULL");
            return;
        }
        
        QNode curr = this.front;
        while (curr != null) {
            System.out.print("->" + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ch = 0;
        Queue q = new Queue();
        
        do {
            ch = sc.nextInt();
            switch(ch) {
            case 1:
                int data = sc.nextInt();
                q.enqueue(data);
                break;
                
            case 3:
                q.display();
                break;
                
            case 2:
                q.dequeue();
                break;
            }
        }while(ch != 4);
        
    }
}
