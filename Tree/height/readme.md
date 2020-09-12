# Height
Completate il metodo int height() in Leaf, Branch in modo che conti il numero di livelli che contengono elementi (che non contengono soltanto foglie) in un albero generico con elementi di tipo T.  
## Senza Abstract Class
Senza **Abstract Class** è sufficente fare questa procedura
**Math.max()** rispondera con 1 se è solo se una delle foglie ha valore
```
public int height(){
  return 1 + Math.max(left.height(), right.height());
}
```
## Con Abstract Class
Con la **Abstract Class** è basta aggingere dove necessario
```
public int height(){
  return 0;
}
```
Il risultato che conta è quello che darà il metodo nella classe **Branch**
