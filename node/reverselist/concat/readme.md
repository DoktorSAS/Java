## Nodes Concat
The following method allows you to return a list of nodes consisting of A and B by putting B on top
### Concat Nodes
```
public static Node concatNodes(Node a, Node b) {
		b = rev(b);
		a = rev(a);
		Node top = new Node( 0, null);
		while(a.getNext() != null) {
			Node newNode = new Node(a.getElem(), top);
			top = newNode;
			a = a.getNext();
		}
		while(b.getNext() != null) {
			Node newNode = new Node(b.getElem(), top);
			top = newNode;
			b = b.getNext();
		}
    	return top;
    }
 ```
 ### Reverse Nodes List
 ```
  public static Node rev(Node p, Node q){
		if (p.getNext()==null) { 
		      return q;
		}else {
		    return rev(p.getNext(),new Node(p.getElem(),q));
		}
	  }
	public static Node rev(Node p){
		return rev(p,new Node(p.getElem(),null));
	  }
  ```
