package ArrayStack;

public class ArrayStack {
	
	private int top;
	private int maxSize;
	private Object stackArray[];
	
	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new Object[maxSize];
		this.top = -1;
	}
	
	
	// stack 공간이 비어 있는지
	public boolean isEmpty() {
		return (this.top == -1);
	}
	
	// stack 공간이 꽉 차 있는지
	public boolean full() {
		return (this.top == maxSize-1);
	}
	
	// Insert
	public void push(Object item) {
		if(full()) {
			System.out.println("stack 공간이 꽉 찼습니다.");
			return;
		}
		top++;
		stackArray[top] = item;
	}
	
	public Object pop() {
		Object item = peek();
		if(top != -1) top--;
		return item;
	}

	public Object peek() {
		if(isEmpty()) {
			System.out.println("stack 공간이 비어있습니다.");
			return null;
		}
		return stackArray[top];
	}
	
}
