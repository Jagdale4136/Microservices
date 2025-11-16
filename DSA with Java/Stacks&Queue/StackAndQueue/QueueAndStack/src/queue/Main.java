package queue;

public class Main {
public static void main(String[] args) {
	Queue q = new Queue(1);
	q.printQueue();
	q.getFirst();
	q.getLast();
	q.getLength();
	q.enqueue(2);
	q.printQueue();
	System.out.println(q.dequeue());
	System.out.println(q.dequeue());
	System.out.println(q.dequeue());
}
}
