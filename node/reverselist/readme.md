# Ribaltare una lista di nodi

Per ribaltare/invertire una lsita di un nodo solo si può usare questo sistema

```
public static Node reverse(Node p, Node q){
		if (p.getNext()==null) { 
		      return q;
		}else {
			System.out.println("Value Rev: " + p.getElem());
		    return rev(p.getNext(),new Node(p.getElem(),q));
		}
}
public static Node reverse(Node p){
		return rev(p,new Node(p.getElem(),null));
	}
```
