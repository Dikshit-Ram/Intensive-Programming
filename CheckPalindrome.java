
public class CheckPalindrome {

	public static void main(String[] args)
	{
		LinkList list = new LinkList();
		list.insert(0, new IntegerNode(10));
		list.insert(0, new IntegerNode(20));
		list.insert(0, new IntegerNode(10));
		
		System.out.println(list);
		System.out.println(list.checkPalindrome());
		
		list.insert(1, new IntegerNode(30));
		
		System.out.println(list);
		System.out.println(list.checkPalindrome());
	}
}
