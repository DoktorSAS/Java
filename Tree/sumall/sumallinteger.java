
// Somma ti tutti i numeri dispari
  public int sumAllIntegerODD() {
		node<type> n = top;
		int res = (int) top.getElem();
		if((int) n.getNext().getElem()%2==0)
			res = 0;
		while (n.getNext() != null) {
			if((int) n.getNext().getElem()%2==0)
				res = res + (int) n.getNext().getElem();
			n = n.getNext();
		}
		return res;
	}

// Somma di tutti i numeri pari
	public int sumAllIntegerEVEN() {
		node<type> n = top;
		int res = (int) top.getElem();
		if((int) n.getNext().getElem()%2==1)
			res = 0;
		while (n.getNext() != null) {
			if((int) n.getNext().getElem()%2==1)
				res = res + (int) n.getNext().getElem();
			n = n.getNext();
		}
		return res;
	}
