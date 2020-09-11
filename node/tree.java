package node;

public class tree<type>{
	type elem;
	leaf<type> root;

	public tree(type elem, leaf<type> right,leaf<type> left) {
		this.root = new leaf(elem,right,left);
	}

	public leaf<type> getRoot() {
		return root;
	}

	public void setRoot(leaf<type> root) {
		this.root = root;
	}
	
	public boolean empty() {
		return root == null;
	}

	
	public void toStringLeft(){
		toStringLeft(this.root);
	}
	
	public void toStringLeft(leaf<type> newRoot){
		if(newRoot.getLeft() != null) {
			if(newRoot.getLeft() != null) {
				System.out.println("Value: " + newRoot.getLeft().getElem());
				toStringLeft(newRoot.getLeft());
			}
			if(newRoot.getRight().getLeft() != null){
				System.out.println("Value: " + newRoot.getRight().getLeft().getElem());
				toStringLeft(newRoot.getRight().getLeft());
			}
		}
	}
	public void toStringRight(){
		toStringRight(this.root);
	}
	public void toStringRight(leaf<type> newRoot){
		if(newRoot.getRight() != null) {
			if(newRoot.getRight() != null) {
				System.out.println("Value: " + newRoot.getRight().getElem());
				toStringRight(newRoot.getRight());
			}
			if(newRoot.getLeft().getRight() != null){
				System.out.println("Value: " + newRoot.getLeft().getRight().getElem());
				toStringRight(newRoot.getLeft().getRight());
			}
		}
	}
	
}
