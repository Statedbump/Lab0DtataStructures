package orderedStructures;

public class Arithmetic extends Progression {
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

	@Override
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


}
