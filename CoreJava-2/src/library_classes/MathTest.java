package library_classes;

public class MathTest {
	public static void main(String[] args) {
		
		//int abs(int n)
		int x = -35;
		System.out.println(x);
		x = Math.abs(x);
		System.out.println(x);
		
		int a=19, b=7, c;
		c = Math.max(a, b);
		System.out.println("MAX : "+c);
		c = Math.min(a, b);
		System.out.println("MIN : "+c);
		
		//double random()
		//double round(double dn)		
		double rn = Math.random();
		System.out.println("Random Number : "+rn); //>0 < 1
		System.out.println("Random Number : "+Math.round(rn*100)); //>0 <1
		
		//double pow(double a, double b)
		double pn = Math.pow(10, 3);
		System.out.println(pn);
		
		//double sqrt(double n)
		double sr = Math.sqrt(64);
		System.out.println(Math.round(sr));
		
	}
}
