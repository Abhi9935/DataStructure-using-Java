import java.util.Scanner;
class TestQueue1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Queue : ");
		int size=sc.nextInt();
		System.out.println("Enter the no. of elements in  Queue : ");
		int n=sc.nextInt();
		
		Queue q=new Queue(size);		
		System.out.println("Queue is Empty : "+q.isEmpty());		
		System.out.println("Queue is Full : "+q.isFull());		
		System.out.println("please add elements in queue ");
		for(int i=0; i<n;i++){
			q.enqueue(sc.nextInt());
		}
		System.out.println(q);
		System.out.println("Queue is Full : "+q.isFull());
		while(!(q.isEmpty())){
			System.out.println(q.dequeue());
		}
		//q.peek();
		System.out.println("Queue is Empty : "+q.isEmpty());
		System.out.println("Queue is Full : "+q.isFull());
		System.out.println("----- Test queue is finished ------ ");
		
	}
}