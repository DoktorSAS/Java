package node;

public class leaf<type>{
	type elem;
	leaf<type> left;
	leaf<type> right;
	
	public leaf(type elem, leaf<type> left, leaf<type> right) {
		this.elem = elem;
		this.left = left;
		this.right = right;
	}

	public type getElem() {
		return elem;
	}

	public void setElem(type elem) {
		this.elem = elem;
	}

	public leaf<type> getLeft() {
		return left;
	}

	public void setLeft(leaf<type> left) {
		this.left = left;
	}

	public leaf<type> getRight() {
		return right;
	}

	public void setRight(leaf<type> right) {
		this.right = right;
	}
	
	
}
