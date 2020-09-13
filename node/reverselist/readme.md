# Ribaltare una lista di nodi

Per ribaltare/invertire una lsita di un nodo solo si può usare questo sistema

```
public static Node reverse(Node p, Node q){
		if (p.getNext()==null) { 
		      return q;
		}else {
			System.out.println("Value Rev: " + p.getElem());
		    return reverse(p.getNext(),new Node(p.getElem(),q));
		}
}
public static Node reverse(Node p){
		return reverse(p,new Node(p.getElem(),null));
	}
```
