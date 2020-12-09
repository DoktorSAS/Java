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

```
package es;

class Node { private int elem; private Node next;
  public Node(int elem, Node next){this.elem=elem;this.next=next;}
  public int getElem(){return elem;}
  public Node getNext(){return next;}
  public void setElem(int elem){this.elem=elem;}
  public void setNext(Node next){this.next=next;}}

class Ex
{
public static Node rev(Node p, Node q)
  {
	if(p == null) {
		System.out.println("P ha valore nullo");
        return q;
	}else {
		print(p);
		print(q);
		if(p.getNext() != null)
			System.out.println("Valore: " + p.getNext().getElem());
        return rev(p.getNext(),new Node(p.getElem(),q));
    }
  }
public static Node rev_it(Node p, Node q)
{
	if(p == null) {
		return q;
	}else {
		Node tmp = q;
		while(p != null) {
			tmp = new Node(p.getElem(), tmp);
			System.out.println("Valore: " + p.getElem());
			p = p.getNext();
		}
		return tmp;
	}
}
         
 public static void print(Node n) {
	 while(n != null) {
		 System.out.print(n.getElem() + " ");
		 n = n.getNext();
	 }
	 System.out.println();
 }
 //p={1,2,3}
 static Node p = new Node(1,new Node(2,new Node(3,null)));
 //q={10,20,30}
 static Node q = new Node(10,new Node(20,new Node(30,null)));
 
 public static String toString(Node p)
 {if (p==null) 
   return ""; 
  else 
   return p.getElem() + " " +  toString(p.getNext());
 }
  
 public static void check(String msg, String a, String b)
  {if (a.equals(b))
    System.out.println(msg + a + " OK");
   else
    System.out.println(msg + a + " INSTEAD OF " + b);
  }
    
public static void main(String[] args)
 {
	check("rev(p,q)=", toString(rev_it(p,q)), "3 2 1 10 20 30 ");
 }
    
}
```
