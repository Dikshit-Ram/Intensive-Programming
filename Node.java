
public class Node<T> {

	protected T item;
	protected Node<T> next;
	
	Node(T itemArg){
		item=itemArg;
		next=null;
	}
	Node(T itemArg,Node nextArg){
		item=itemArg;
		next=nextArg;
	}
	
	public static void main(String[] args){
		Node<Integer> firstNode=new Node<Integer>(10);				//creating integer type
		firstNode=new Node(20,firstNode);
		firstNode=new Node(30,firstNode);
		for(Node current=firstNode;current!=null;current=current.next){
			System.out.println(current.item);
	}
		/* firstNode=new Node(new String("last"));				//string type is in comments
		firstNode=new Node(new String("middle"),firstNode);
		firstNode=new Node(new String("first"),firstNode);
		
		for(Node current=firstNode;current!=null;current=current.next){
			System.out.println((String)current.item+ ' ');
		}*/
	
	}	
}