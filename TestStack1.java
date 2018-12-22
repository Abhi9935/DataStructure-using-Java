import java.util.Scanner;
class TestStack1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Stack : ");
		int size=sc.nextInt();
		System.out.println("Enter the no. of elements in  Stack : ");
		int n=sc.nextInt();
		
		Stack s=new Stack(size);		
		System.out.println("Stack is Empty : "+s.isEmpty());
		for(int i=0; i<n;i++){
			s.push(sc.nextInt());
		}
		System.out.println(s);
		System.out.println("Stack is Full : "+s.isFull());
		while(!(s.isEmpty())){
			System.out.println(s.pop());
		}
		s.peek();
		System.out.println("Stack is Empty : "+s.isEmpty());
		System.out.println("Stack is Full : "+s.isFull());
	}
}