class Queue{
	private int front;
	private	int rear;
	private long queueArray[];
	private int nItems;
	private int maxSize;
	
	Queue(int maxSize){
		this.maxSize=maxSize;
		this.queueArray=new long[maxSize];
		this.front=0;
		this.rear=-1;
	}
	public void enqueue(long element){
		if(isFull()){
			System.out.println("Queue is already Full");
		}
		else{
			rear++;
			queueArray[rear]=element;
			nItems+=1;
		}				
	}
	public long dequeue(){
		if(isEmpty()){
			System.out.println("Underflow : Queue is Empty");
			return -1;
		}
		else{
			int old_front=front;
			front++;
			rear--;
			nItems-=1;
			return queueArray[old_front];
		}
	}
	public long peek(){
		return queueArray[0];
	}
	public boolean isFull(){
		if(rear==maxSize-1){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isEmpty(){
		return (nItems==0);
	}
	@Override
	public String toString(){
		String result = "{ ";
		for (int i=0; i<nItems; i++) {
			result +=queueArray[i]+ " | ";
		}
		result+="}";
		return result;		
	}
}