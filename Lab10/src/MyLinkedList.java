
public class MyLinkedList {
	private Node start;
	public MyLinkedList() {
		start = null;
	}
	
	public void add(Car data) {
	    
		Node nodeNew = new Node(data);
		//temp
		Node currentNode = null;
		
		if(start == null) 
		{
			start = nodeNew;
		}
		else
		{
			if(start.data.compareTo(data)<0) 
			{
				nodeNew.next = start;
				start = nodeNew;
			}
			else 
			{
				currentNode = start;
				
				while(currentNode.next != null && (currentNode.next.data.compareTo(nodeNew.data)>0)  ) 
				{
					currentNode = currentNode.next;
				}
				nodeNew.next=currentNode.next;
				currentNode.next = nodeNew;
			}
		}
	}
	
	public void printAll () {
		Node node = start;
		while (node.next != null) 
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
		
}
