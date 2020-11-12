package my_lib;

public class Maths {
	public int calc_sum(int n1, int n2) {
		return n1+n2;
	}
	public int calc_dif(int n1, int n2) {
		return n1-n2;
	}
	public int calc_prd(int n1, int n2) {
		return n1*n2;
	}
	public int calc_div(int n1, int n2) {
		return n1/n2;
	}
	public int calc_pow(int n1, int n2) {
		return (int)Math.pow(n1, n2);
	}
}