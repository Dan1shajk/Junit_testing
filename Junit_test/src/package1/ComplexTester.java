package package1;


public class ComplexTester {

	public static void main(String[] args) {
		 double i= 3;
		 double r= -2;
		
		
		Complex comp = new Complex(r, i);
		Complex comp2= new Complex(r);
		Complex x = new Complex(5,2);
		Complex y = new Complex(7,4);

		System.out.println("Real number is "+ comp.getr());
		System.out.println("Imaginary number is "+ comp.geti());
		System.out.println("Comp is " + comp);
		System.out.println("X = "+ x);
		System.out.println("Y = "+ y);
		Complex w = x.add(y);
		System.out.println("W= "+ w);
		
		System.out.println("X - y = " + x.sub(y));
		comp.Conj();
		System.out.println("Conjugate = " +comp.Conj());
		System.out.println("Conjugate = " +x.Conj());
		
		Complex m = x.mult(y);
		System.out.println(m);
		
		Complex d = x.div(y);
		System.out.println("x/y = "+ d);
		boolean test = x.equals(y);
		System.out.println(test);
	}
	

}
