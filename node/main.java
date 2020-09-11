package node;

public class main {
	public static void main(String[] args) {
		dynamicpile<Integer> intpile = new dynamicpile();
		System.out.println("-----------------------------------------------------------");
		System.out.println("Dynamic pile: ");
		System.out.println("Values: ");
		for(int i = 0; i <= 10; i++)
			intpile.push(i*3); 
		System.out.println("-----------------------------------------------------------");
		System.out.println("Element 3 Exist: " + intpile.elementExist(3)); 
		System.out.println("Element null Exist: " + intpile.elementExist(null)); 
		System.out.println("Size: " + intpile.size());
		System.out.println("Get Node[3] size : " + intpile.getNode(3).size());
		System.out.println("Get Node[12] size : " + intpile.getNode(12).size());
		System.out.println("Max INT in the list : " + intpile.maxInteger());
		System.out.println("Min INT in the list : " + intpile.minInteger());
		System.out.println("Sum of all Element in the list : " + intpile.sumAllInteger());
		System.out.println("Sum of all ODD Element in the list : " + intpile.sumAllIntegerODD());
		System.out.println("Sum of all EVEN Element in the list : " + intpile.sumAllIntegerEVEN());
		System.out.println("-----------------------------------------------------------");
		intpile.toStringAll();
		System.out.println("-----------------------------------------------------------");
		
		tree<String> t = new tree("root",
				new leaf("Left:1",null,null),
				new leaf("Right:1",new leaf("Left:2",null,null),null));
		System.out.println("Tree: ");
		System.out.println("Is empty?: " + t.empty());
		System.out.println("-----------------------------------------------------------");
		System.out.println("Left leaf: ");
		t.toStringLeft();
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Right leaf: ");
		t.toStringRight();
		System.out.println("-----------------------------------------------------------");
		System.out.println("Exceptions: ");
		ExceptionOUTofBorder();
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void ExceptionOUTofBorder() {
		try {
			int[] myNumbers = {1, 2, 3};
		    System.out.println(myNumbers[10]);
		} catch (Exception e) {
		    System.out.println("Error: " + e.getMessage());
		}
	}

}
