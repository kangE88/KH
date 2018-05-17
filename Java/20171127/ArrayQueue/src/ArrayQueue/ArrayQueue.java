package ArrayQueue;

public class ArrayQueue {
	private int front;
	private int rear;
	private int maxSize;
	private Object queueArray[];
	
	public ArrayQueue(int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		queueArray = new Object[maxSize];
	}
	
	public boolean isEmpty() {
		return (front == rear+1);
	}
	
	public boolean full() {
		return (rear == maxSize-1);
	}
	
	//추가
	public void push(Object item) {
		if(full()) {
			System.out.println("queue 공간이 꽉 찼습니다.");
			return;
		}
		rear++;
		queueArray[rear] = item;
	}
	
	//삭제
	
	public Object pop() {
		Object item = peek();
		front++;
		return queueArray[rear];
	}
	
	public Object peek() {
		if(isEmpty()) {
			System.out.println("데이터가 없습니다");
			return null;
		}
		return queueArray[front];
	}
	
}
