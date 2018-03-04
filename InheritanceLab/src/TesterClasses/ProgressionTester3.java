package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester3 {
public static void main(String[] args) {
	
	
		Progression p; 
		Progression p2; 
		
	
		
		System.out.println("\n\n\nTesting Geometric:"); 
		p = new Geometric(2, 3);
		p2 = new Geometric(2,4);
		p.printAllTerms(20);
		p2.printAllTerms(20);
		System.out.println(p.equals(p2));
		
		
		
		System.out.println("\n\n\nTesting Arithmetic:"); 
		p = new Arithmetic(2, 3); 
		p2 =new Arithmetic(3, 6);
		p.printAllTerms(20);
		p2.printAllTerms(20);
		System.out.println("The sum of these two proggresions is given by : "+ ((Arithmetic)p).add(p2).toString());
		((Arithmetic)p).add(p2).printAllTerms(20);
	
		
	
}
}
