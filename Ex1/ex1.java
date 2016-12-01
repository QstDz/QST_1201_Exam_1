public class QSTLinkList 
{
	public static class Node{
		public int value;
		public Node next = null;
		Node(int value){
			this.value = value;
		}
		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
		public void setValue(int value){
			this.value = value;
		}
	}
	//倒序	
	private static Node reverse(Node head){
		if(head==null||head.next==null)return head;  
		Node reHead=reverse(head.next);  
		head.next.next=head;  
		head.next=null;  
		return reHead;  
	}
	//打印	
	private static void printLinkList(Node head) {
		Node current = head;
		while(current!=null){
			if(current.next!=null)
				System.out.print(current.value+"->");
			else
				System.out.print(current.value);
			current=current.next;
		}
	}
  
  public static void main( String[] args ){
    int[] arr = {1,3,5,7,2,4};
    Node head = createLinkList(arr);
    printLinkList(head);
  }
	private static Node createLinkList(int[] arr) {
		// TODO Auto-generated method stub
		Node[] linkArr = new Node[arr.length];
		for (int i=0; i<arr.length; i++){
			linkArr[i] = new Node(arr[i]);
		}
		for (int i=0; i<arr.length; i++){
			linkArr[i].setValue(arr[i]);
			if (i == arr.length - 1){
				linkArr[i].next = null;
			}
			else{
				linkArr[i].next = linkArr[i+1];
			}
		}
		return linkArr[0];
	}
}
