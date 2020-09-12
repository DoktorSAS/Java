package node;

public class node<type>{
	type elem;
	node<type> next;
	
	public node(type elem, node<type> next){
		 this.elem = elem;
	     this.next = next;
	}
	
	public type getElem() {
		return this.elem;
	}
	
	public node<type> getNext() {
		return this.next;
	}
	
	public void setElem(type elem) {
		this.elem = elem;
	}
	public void setNext(node next) {
		this.next = next;
	}
	public boolean empty() {
		return next == null;
	}

	public int size() {
		if(next != null)
			return 1 + next.size();
		else
			return 0;
	}
}
