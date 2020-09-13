## Come esplorare tutte le foglie di sinsitra
Il metodo seguente permette di esplorare tutte le foglie Sinsitre di ogni singolo ramo, il metodo è fatto
per essere generico e per ciò può funzionare con ogni tipo di variabile.

Il metodo è fatto per esere ricorsivo. Infatti richiama se stesso partendo da un nodo radice, e per
ogni nodo scorre sia la foglia di destra che la foglia di sinistra.

```
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
```

## Come esplorare tutte le foglie di destra
Il metodo seguente permette di esplorare tutte le foglie Destre di ogni singolo ramo, il metodo è fatto
per essere generico e per ciò può funzionare con ogni tipo di variabile.

Il metodo è fatto per esere ricorsivo. Infatti richiama se stesso partendo da un nodo radice, e per
ogni nodo scorre sia la foglia di destra che la foglia di sinistra.

```
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
```
