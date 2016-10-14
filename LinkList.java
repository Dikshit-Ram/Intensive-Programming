import java.util.*;
public class LinkList {
	
	IntegerNode head ;		//create a dummy


	public static void main(String[] args) {			//main program
	
		LinkList list = new LinkList();
		list.insert(0, new IntegerNode(10));
		list.insert(0, new IntegerNode(20));
		IntegerNode s = list.get(1);
		System.out.println("Item at index 1 is "+s);
		list.insert(2, new IntegerNode(30));
		System.out.println("Before removing:");
		System.out.println(list);
		list.remove(10);
		System.out.println("After removing");
		System.out.println(""+list);
		
	}
	
	 public void insert(int pos, IntegerNode item)    //add one node there
	 {
		 IntegerNode dummy = new IntegerNode(-1, null); // dummy node to assist the programming
		 dummy.next = head;
		 
		 IntegerNode curr = dummy;
		 
		 while(--pos >= 0)                            // find the position, curr.next will be right position to add new node there
		 {
			 curr = curr.next;				 
		 }
		 
		 item.next = curr.next;                     //insert the node in the list
		 curr.next = item;
		 
		 head = dummy.next;                          // update head
	 }
	 
	 
	//own method defined
	/*public void insert(int index,IntegerNode nn)		//insert method
	{
		IntegerNode point = head;						//create another reference that points to head
	 
		 if(head == null)								//if list is empty then return
		 {
			 head = nn;
			 return;
		 }
		 if(index == 0)									//adding at  first position 
		 {
			 nn.next = head.next;
			 head.next = nn;
		 }
		 else if(index > 0)								//adding at other positions
		 {
			 for(int i =0;i<index;i++)
			 {
				 point = point.next;
			 }
			 nn.next = point.next;
			 point.next = nn;
		 }
	   
	}*/
	
	public void remove(int value)					//remove method
	{
		IntegerNode ref1 = head;					//create two other references
		IntegerNode ref2 = head.next;
		
		while(ref2!=null)							//check if the ref2 is equal to value until the ref2 reaches end
		{
			if(ref2.item==value)
			{
				ref1.next = ref2.next;
				ref2.next = null;
			}
			ref2 = ref2.next;						//updating references by one element
			ref1 = ref1.next;
		}

	}
	
	public IntegerNode get(int index)				//get method
	{
		IntegerNode gets = head;

		if(index == 0)							
		 {
			return gets;
		 }
		 for(int i =0;i<index;i++)
			 {
				 gets = gets.next;
			 }
			 
			 return gets;
		 }
	
	
	
	
	public String toString()   //return the string representation of the list
	 {
		StringBuilder ret = new StringBuilder();
		IntegerNode curr = head;
		
		 while (curr != null)
		 {
			 if(curr != head)
			 {
				 ret.append("->"); 
			 }
			 ret.append(curr.item);
			 curr = curr.next;
		 }			
		return ret.toString();
	 }
}


