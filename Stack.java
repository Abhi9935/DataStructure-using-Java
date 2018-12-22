/*
Stack in java
*/
class Stack{
	private int top;
	private long LongArray[];
	private int maxSize;
	private int items;
	
	Stack(int maxSize){
		this.maxSize=maxSize;		
		this.LongArray=new long[maxSize];
		this.top=-1;
	}
	public void push(long element){
		if(isFull()){
			System.out.println("OverFlow : Stack is already Full");
		}
		else{
			top++;
			LongArray[top]=element;
			items+=1;
		}		
	}
	public long pop(){
		if(isEmpty()){
			System.out.println("UnderFlow : Stack is empty");
			return -1;
		}else{			
			int old_top=top;
			top--;
			items--;
			return LongArray[old_top];
		}				
	}
	public long peek(){
		if(isEmpty()){
			System.out.println("Stack has no element");
			return -1;
		}else{
			return LongArray[top];
		}		
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public boolean isFull(){
		return (maxSize-1)==top;
	}
	@Override
	public String toString(){
		String result = "| ";
		for (int i = items-1; i>=0; i--) {
			result +=LongArray[i]+ " | ";
		}
		return result;		
	}
}