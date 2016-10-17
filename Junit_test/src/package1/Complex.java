package package1;

//import package1.Complex;

public class Complex {
	/**
	 * 
	 * @param r is the real number
	 * @param i is the imaginary number
	 * @precondition parameter must be doubles
	 */
	Complex(double r, double i)
	{
		imaginary = i;
		real = r;
	}
	/**
	 * 
	 * @param r is the real number
	 * @precondition r must be double
	 * @postcondition imaginary number is set to 0
	 * this constructor is called only when supplied with the real number
	 */
	Complex(double r)
	{
		this.real = r;
		this.imaginary= 0;
	}
	/**
	 * takes the real and imaginary number and formats it into a string
	 * @return string that is in a complex number format
	 */
	public String toString()
	{
		
		if (imaginary >=0)
		{
			return getr() + " + " +geti()+"i"; //if imaginary is positive return with a+bi format
		}
		else{
			double x  = imaginary*-1;
			return getr()+ " - " +x+"i";  //if imaginary is positive return with a-bi format
		}
	}
	/**
	 * 
	 * @return the real number
	 */
	public double getr(){
		return real;
	}
	/**
	 * 
	 * @return the imaginary number
	 */
	public double geti(){
		return imaginary;
	}
	/**
	 * 
	 * @param a is the complex object that is being passed in
	 * @return the sum of two complex numbers
	 */
	public Complex add(Complex a)
	{
		double r = a.getr()+ this.getr(); //adds the real numbers from both objects
		double i = a.geti()+ this.geti();//adds the imaginary numbers from both objects
		
		Complex z = new Complex(r,i);  //passes the new real and imaginay numbers to create a new Complex number
		return z;	//new complex is returned
	}
	/**
	 * 
	 * @param a complex object to be subtracted from
	 * @return a new complex that is the difference of the two complex numbers
	 */
	public Complex sub(Complex a)
	{
		double r = this.getr() - a.getr(); //subtract the real numbers
		double i = this.geti() - a.geti(); //subtractt the imaginary numbers
		
		Complex z = new Complex(r,i);  //passes the new imaginary and real numbers to be converted into a new complex number
		return z;
	}
	/**
	 * flips the + to - and vice versa
	 * @return the conjugate of the complex number
	 */
	public Complex Conj()
	{
		double r = this.getr(); //gets the real number
		double i = this.geti()*(-1); //gets the imaginary and flips the sign
		Complex z = new Complex(r,i); //passes the new imaginary and real numbers to be converted into a new complex number
		return z;
	}
	/**
	 * 
	 * @param x is the complex to be multiplied
	 * @return newly created complex by multiplying two complex numbers 
	 */
	public Complex mult(Complex x)
	{
		double a, b, c, d= 0;
		a = this.getr();
		b= this.geti();
		c= x.getr();
		d= x.geti();
		
		double r = a*c;
		double i= b*c + a*d;
		c = b*d*(-1);
		r = r+c;
		
		Complex z = new Complex(r,i);
		return z;
	}
	/**
	 * 
	 * @param x  is the complex to be divided
	 * @return newly created complex by dividing two complex numbers 
	 * @precondition cannot divide by 0
	 */
	public Complex div(Complex x)
	{
		Complex sum;
		sum= x.Conj();
		sum = this.mult(sum);
		
		return sum;
	}
	/**
	 * 
	 * @param a is the complex to be checked for equality
	 * @return true if equal else false
	 */
	public boolean equals(Complex a)
	{
		if(this.getr() == a.getr() && this.geti()== a.geti()) //compares the real and the imaginary numbers
		{
			return true;
		}
		else return false;	
	}
	
	private final double imaginary;
	private final double real;
}
