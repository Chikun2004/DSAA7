// IMPLEMENTATION QUEUE USING ARRAY
import java.util.Scanner;
public class QueueDemo2 {
    static void insert(int Q[]){
        Scanner sc = new Scanner(System.in);
        if (rear==MAX-1){
            System.out.println("Queue full");
            return;
        }
        rear++;
        System.out.println("Enter the new element:");
        Q[rear] = sc.nextInt();
        System.out.println("Element inserted!");
    }
    static void delete(int Q[]){
        if (rear==-1){
            System.out.println("Queue is Empty!");
            return;
        }
        int data = Q[10];
        for (int i = 0;i<rear;i++){
            Q[i]=Q[i+1];
        }
        rear--;
        System.out.println(data + "deleted from the queue");
    }
    static void display(int Q[]){
        if (is_empty()){
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = 0;i<=rear;i++){
            System.out.print(Q[i]+" ");
        }
        System.out.println();
    }
    static boolean is_full(){
        return rear == MAX-1;
    }
    static boolean is_empty(){
        return rear == -1;
    }
     static final int MAX = 5;
     static int front  = -1;
     static int rear = -1;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int queue [] = new int[MAX];
        while(true){
            System.out.println("*** MENU***");
            System.out.println("0.Exit");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Enter your choice");
            int choice  = sc.nextInt();
            switch (choice)
            {
                case 0 : System.exit(0);
                case 1 : insert(queue);
                         break;
                case 2 : delete(queue);
                         break;
                case 3 : display(queue);
                        break;
                default:
                    System.out.println("Invalid choice: ");
            }
        }
    }
}