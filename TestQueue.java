import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		QUsingStack q = new QUsingStack();
		q.push("a");
		q.push("b");
		q.push("c");
		q.push("d");

		System.out.println("peek :"+q.peek());
		System.out.println("pop :"+q.pop());
		q.push("e");
		System.out.println("peek after popping once :"+q.peek());
		System.out.println("is the stack empty?:"+q.empty());
	}

}
