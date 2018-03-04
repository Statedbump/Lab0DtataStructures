package orderedStructures;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if(super.set==false) {
			
			throw new IllegalStateException("Please run first value");
			
		}
		
		current = current + commonDifference; 
		return current;
	}


	public String toString() {
		String firstValue =  Double.toString(super.firstValue());
		String commonDifference = Double.toString(this.commonDifference);
		
		return "Arith(" + firstValue + ", " + commonDifference +")" ;
	}
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		return firstValue()+(n-1)*commonDifference;
	}

	@Override
	public Progression add(Progression p) {
		Arithmetic p2 = (Arithmetic) p;
		double newFirstTerm = this.firstValue() + p2.firstValue();
		double newCommonDifference = this.commonDifference + p2.commonDifference;
		
		 Progression P = new Arithmetic(newFirstTerm,newCommonDifference);
				

		return P;
	}

	@Override
	public Progression subtract(Progression p) {
		
		Arithmetic p2 = (Arithmetic) p;
		double newFirstTerm = this.firstValue() - p2.firstValue();
		double newCommonDifference = this.commonDifference - p2.commonDifference;
		
		 Progression P = new Arithmetic(newFirstTerm,newCommonDifference);
				

		return P;
		
	}

	@Override
	public boolean equals(Object o) {
		Arithmetic p2 = (Arithmetic)o;
		return this.toString()==p2.toString();
	}



}
