package orderedStructures;



public class Geometric extends Progression{

	private double commonFactor; 

	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}

	@Override
	public double nextValue() {
		if(super.set==false) {

			throw new IllegalStateException("Please run first value");

		}
		current = current * commonFactor; 
		return current;
	}


	public String toString() {
		String firstValue =  Double.toString(super.firstValue());
		String commonFactor = Double.toString(this.commonFactor);

		return "Geo(" + firstValue + ", " + commonFactor +")" ;
	}
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		return firstValue()*Math.pow(commonFactor, n-1);
	}

	@Override
	public boolean equals(Object o) {
	Geometric g2 = (Geometric) o;
	return this.toString()==g2.toString();
	
	}



	


}
