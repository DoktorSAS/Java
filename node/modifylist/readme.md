# Modifica di una Lista

Prendendo come esempio l'esercizzio seguente possiamo sviluppare un metodo per modficare la liste nel modo richiesto

Implementare un metodo "modifica" di MyList che aggiunge ad ogni elemento della 
lista la somma degli elementi che lo precedono

Seguono alcuni esempi di risultati attesi:

prima: 5
dopo: 5

prima: 5, 3, 1
dopo: 5, 8, 9

prima: -1, 1, 0, 4
dopo: -1, 0, 0, 4

Non e` consentito usare break o continue o return all'interno di
cicli.

Non e` consentito modificare in alcun modo il codice al di fuori
del metodo "modifica".
```
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
  ```
  ##### Soluzione Alternativa
  
  ```
  public void modifica(){ // Fra
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
  ```
  
**PS** Il modo migliore per modificare una lsita è ri-crearla inserendo i nuovi dati
