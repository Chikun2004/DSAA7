import java.util.Scanner;
// IMPLEMENTATION OF QUEUE USING LINKED LIST
class Node{
    int data;
    Node next;
}
public class QueueDemo3 {
    static Node front = null;
    static Node rear = null;

    static void insert() {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();
        System.out.println("Enter the Element");
        newNode.data = sc.nextInt();
        newNode.next = null;
        if (rear == null & front == null) {
            rear = front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    static void remove() {
        if (front == null & rear == null) {
            System.out.println("Queue is Empty");
            return;
        }
        int num = front.data;
        //SINGLE NODE
        System.out.println(num + "is deleted");
        if (front == rear) {
            rear = null;
        }
        front = front.next;
    }
    static void display() {
        if (front == null & rear == null) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*** MENU***");
            System.out.println("0.Exit");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}