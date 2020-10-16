package lab_lft;

public class mainclass {

	public static void main(String[] args) {
		System.out.print("DFA Non corrisposto: ");
		System.out.println(scan("010101") ? "Valid!" : "Not Valid!");
		System.out.print("3 Zero consecutivi: ");
		System.out.println(scan("1100011001") ? "Valid!" : "Not Valid!");
		System.out.print("Caratteri non presenti nel linguaggio {0,1}: ");
		System.out.println(scan("10214") ? "Valid!" : "Not Valid!");
		System.out.print("DFA corrisposto ma non valido per i 3 Zero consecutivi: ");
		System.out.println(scan("010001") ? "Valid!" : "Not Valid!");
		
	}
	
	/*
		Copiare il codice in Listing 1, compilarlo e testarlo su un insieme significativo di
		stringhe, per es. “010101”, “1100011001”, “10214”, ecc.
		Come deve essere modificato il DFA in Figure 1 per riconoscere il linguaggio complementare,
		ovvero il linguaggio delle stringhe di 0 e 1 che non contengono 3 zeri consecutivi? Progettare e
		implementare il DFA modificato, e testare il suo funzionamento.
	*/

	public static boolean scan(String s){
	int state = 0;
	int zero_counter = 0;
	int i = 0;
	while (state >= 0 && i < s.length()) {
		final char ch = s.charAt(i++);
		if(ch == '1' || ch == '0')
			state = -1;
		if(ch == '0')
			zero_counter++;
		switch (state) {
		case 0:
			if (ch == '0')
			    state = 1;
			else if (ch == '1')
			    state = 0;
			else
			    state = -1;
		break;

		case 1:
			if (ch == '0')
			    state = 2;
			else if (ch == '1')
			    state = 0;
			else
			    state = -1;
		break;

		case 2:
			if (ch == '0')
			    state = 3;
			else if (ch == '1')
			    state = 0;
			else
			    state = -1;
		break;

		case 3:
			if (ch == '0' || ch == '1')
			    state = 3;
			else
			    state = -1;
		break;
		    }
		}
		return state == 3 && zero_counter != 3;
	}

}
