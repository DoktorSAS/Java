package test;
/*Compilare i campi che seguono:
 * NOME        :
 * COGNOME     :
 * MATRICOLA   :
 * N. MACCHINA :
 *
 * Implementare un metodo "modifica" di MyList che aggiunge ad ogni elemento della 
 *  lista la somma degli elementi che lo precedono
 *
 * Seguono alcuni esempi di risultati attesi:
 *
 * prima: 5
 * dopo: 5
 *
 * prima: 5, 3, 1
 * dopo: 5, 8, 9
 *
 * prima: -1, 1, 0, 4
 * dopo: -1, 0, 0, 4
 *
 * Non e` consentito usare break o continue o return all'interno di
 * cicli.
 *
 * Non e` consentito modificare in alcun modo il codice al di fuori
 * del metodo "modifica".
 *
 */

// Node.java
class Node {
  private int elem;
  private Node next;
  
  public Node(int elem, Node next)
    {
      this.elem = elem;
      this.next = next;
    }
  
  public int getElem()
    { return elem; }
  
  public Node getNext()
    { return next; }
  
  public void setElem(int elem)
    { this.elem = elem; }
  
  public void setNext(Node next)
    { this.next = next; }
}

// MyList.java
class MyList {
  private Node first;
  
  public MyList()
    { this.first = null; }
  
  public void insert(int elem)
    { first = new Node(elem, first); }
  

  public String toString()
    {
      String res = "";
      for (Node p = first; p != null; p = p.getNext()) {
        res += p.getElem();
        if (p.getNext() != null) res += ", ";
      }
    return res;
    }
  
  public void modifica(){
    int size = 0;
    Node clone = first;
    while(clone != null) {
    	size++;
    	clone = clone.getNext();
    }
    System.out.println("Size: " + size);
    int [] data = new int[size];
    int [] result = new int[size];
    int i = size-1;
    clone = first;
    while(clone != null) {
    	data[i] = clone.getElem();
    	System.out.print(" " + data[i]);
    	clone = clone.getNext();
    	i--;
    }
    int v = 0;
    i = size-1;
    System.out.println("\nSize-1: " + (size-1) );
    for(i = size-1; i >= 0; i--) {
    	v = 0;
    	System.out.println("Target [" + i + "]" + data[i]);
    	for(int j = size-1; j >= 0;j--) {
    		if(j >= i) {
    			v = v + data[j];
    			System.out.print("+" + data[j]);
    		}
    	}
    	System.out.println("\nValue [" + i + "]" + v);
    	result[i] = v;
    }
    first = new Node(result[0], null);
    i = 1;
    while(i < size) {
    	System.out.println("Result: "+result[i]);
    	insert(result[i]);
    	i++;
    }
  }
  
  public void modifica2(){ // Fra
	  if(first.getNext() != null) {
		  Node clone = this.first;
		  first = new Node(clone.getElem(), null);
		  while(clone.getNext() != null) {
			clone = clone.getNext();
		    insert(clone.getElem());
		  }
		  for (Node p= first; p != null; p = p.getNext()) { 
		        int s=0;
		        for (Node q = p.getNext() ; q != null; q = q.getNext()) { 
		          s=s+q.getElem();
		        }
		        
		        p.setElem(p.getElem()+s);
		      }
		  clone = this.first;
		  first = new Node(clone.getElem(), null);
		  while(clone.getNext() != null) {
			clone = clone.getNext();
		    insert(clone.getElem());
		  }
	  } 
  }
}

public class Main {
  public static void main(String[] args) {
    	test(crea(5), "5");
	test(crea(5, 3, 1), "5, 8, 9");
	test(crea(-1, 1, 0,4), "-1, 0, 0, 4");
  }
  
  static void test(MyList l, String atteso)
    {
	System.out.println("lista    : " + l);
	l.modifica();
	System.out.println("ottenuto : " + l);
	System.out.println("atteso   : " + atteso);
	System.out.println(l.toString().equals(atteso) ? "=== OK" : "=== ERRORE");
	System.out.println();
    }
  
  static MyList crea(Integer...v)
    {
	MyList l = new MyList();
	for (int i = v.length - 1; i >= 0; i--)
	    l.insert(v[i]);
	return l;
    }
  
}
