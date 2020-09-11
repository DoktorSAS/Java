package node;

public class dynamicpile<type> {
	node<type> top;
	
	public dynamicpile() {
		this.top = null;
	}
	public boolean elementExist(type value) {
		assert value == null;
		node<type> cloneTop = top;
		boolean found = false;
		while(cloneTop.getNext() != null && !found) {
			if(cloneTop.getElem() == value) {
				found = true;
			}
			cloneTop = cloneTop.getNext();
		}
		return found;
	}
	
	public node<type> getNode(type value) {
		assert value == null;
		node<type> cloneTop = top;
		node<type> found = null;
		boolean f = false;
		while(cloneTop.getNext() != null && !f) {
			if(cloneTop.getElem() == value) {
				f = true;
				found = cloneTop;
			}
			cloneTop = cloneTop.getNext();
		}
		return found;
	}
	
	public type pop() {
		assert empty() : "Now the Pile is Empty";
		type tmp = top.getElem();
		top = top.getNext();
		return tmp;
	}
	
	public void toStringAll() {
		System.out.println("ToString of all data in the pile");
		node<type> n = top;
		String values = "";
		while(n.getNext() != null) {
			values = values + " " + n.getElem();
			n = n.getNext();
		}
		System.out.println(values);
	}
	
	public int size() {
		int i = 0;
		node<type> n = top;
		while (n.getNext() != null) {
			i++;
			n = n.getNext();
		}
		return i;
	}
	
	public void push(int x) {
		top = new node(x, top);
		System.out.println("Node Value: " + x);
	}
	
	public boolean empty() {
		return this.top == null;
	}
	
	public int maxInteger() {
		node<type> n = top;
		int max = (int) top.getElem();
		while (n.getNext() != null) {
			if((int) n.getNext().getElem() >= max) {
				max = (int) n.getNext().getElem();
			}
			n = n.getNext();
		}
		return max;
	}
	
	public int minInteger() {
		node<type> n = top;
		int min = (int) top.getElem();
		while (n.getNext() != null) {
			if((int) n.getNext().getElem() <= min) {
				min = (int) n.getNext().getElem();
			}
			n = n.getNext();
		}
		return min;
	}
	
	public int sumAllInteger() {
		node<type> n = top;
		int res = (int) top.getElem();
		while (n.getNext() != null) {
			res = res + (int) n.getNext().getElem();
			n = n.getNext();
		}
		return res;
	}
	
	public int sumAllIntegerODD() {
		node<type> n = top;
		int res = (int) top.getElem();
		if((int) n.getNext().getElem()%2==0)
			res = 0;
		while (n.getNext() != null) {
			if((int) n.getNext().getElem()%2==0)
				res = res + (int) n.getNext().getElem();
			n = n.getNext();
		}
		return res;
	}
	
	public int sumAllIntegerEVEN() {
		node<type> n = top;
		int res = (int) top.getElem();
		if((int) n.getNext().getElem()%2==1)
			res = 0;
		while (n.getNext() != null) {
			if((int) n.getNext().getElem()%2==1)
				res = res + (int) n.getNext().getElem();
			n = n.getNext();
		}
		return res;
	}

}
