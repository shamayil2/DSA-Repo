package Sep14;

public class LLCycle {
	
	public class Node {
		int val;
		Node next;

		public Node() {

		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size = 0;

	public void addfirst(int temp) {
		if (size == 0) {
			Node nn = new Node();
			nn.val = temp;
			this.head = nn;
			this.tail = nn;
		} else {
			Node nn = new Node();
			nn.val = temp;
			nn.next = head;
			this.head = nn;
		}
		this.size++;
	}

	public void addLast(int temp) {
		if (size == 0) {
			Node nn = new Node();
			nn.val = temp;
			this.head = nn;
			this.tail = nn;
		} else {
			Node nn = new Node();
			nn.val = temp;
			tail.next = nn;
			this.tail = nn;
		}
		this.size++;
	}
	
	public Node getAtIdx(int idx) {
		if(idx>=size) {
			return null;
		}
		int count= 0;
		Node temp = head;
		while(count!=idx) {
			temp = temp.next;
			count++;
		}
		return temp;
	}
	public void Display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.val+" ==> ");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
	public void createCycle(int idx) {
		Node n =  getAtIdx(idx);
		this.tail.next = n;
	}
	
	public void removeCycle() {
		
	}
}