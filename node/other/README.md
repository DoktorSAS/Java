# Definzione di NaN -> Not a number
"NaN" sta per "non un numero". "NaN" viene prodotto se un'operazione in virgola mobile ha alcuni parametri 
di input che causano all'operazione di produrre un risultato indefinito. Ad esempio, 0,0 diviso per 0,0 è aritmeticamente 
indefinito. Anche prendere la radice quadrata di un numero negativo non è definito.

NaN significa “Not a Number” ed è sostanzialmente una rappresentazione di un valore in virgola mobile speciale in IEE 754 floating 
punto standard. NaN generalmente significa che il valore è qualcosa che non può essere espresso con un numero in virgola mobile valido.

Una conversione comporterà questo valore, quando il valore da convertire è qualcos'altro, ad esempio quando si converte una stringa che non rappresenta un numero.

[Maggiori informazioni](https://www.it-swarm.dev/it/java/java-cosa-significa-nan/969824867/)


### Esempio Di NaN

Completate il corpo del metodo boolean ok(Node v, int x) in modo che restituisca vero se e solo se eseguire metodo(v,x) 
non restituisce nè eccezioni nè valori NaN nè infinity.
```
 public static void metodo(Node p, int x)
  {
      for(  ;x>=0;x--) 
      {
      p.setElem(x);
      p=p.getNext();
      }
  }  

  public static boolean ok(Node p, int x)
  {
     for( ;x>=0;x--)  
     {
        if (p==null) // Automaticamente se il nodo risulta vuoto l'operazione richiesta verrà rifiutata
          return false; 
        p=p.getNext();
     }
     // Se tutto va bene, ovvero non ci sono nodi vuoti che vanno da X a 0 allorà verrà restituito true e l'operazione verrà eseguita
     return true;
  }
```
#### Verifichiamo il funzionamento
Inserendo infatti dei valori e delle debug print, possiamo verificare il funzionamento del codice.
```
 public static boolean ok(Node p, int x)
	  {
	     for( ;x>=0;x--)  
	     {
	    	
	        if (p==null){// Automaticamente se il nodo risulta vuoto l'operazione richiesta verrà rifiutata
	        	System.out.println("P ha valore Null per x che vale " + x);
	        	return false; 
	        }else {
	        	System.out.println("P NON ha valore Null per x che vale " + x);
	        }
	        p=p.getNext();
	     }
	     // Se tutto va bene, ovvero non ci sono nodi vuoti che vanno da X a 0 allorà verrà restituito true e l'operazione verrà eseguita
	     return true;
	  }
```

![](https://i.imgur.com/V1WZf0A.png)

