package collections.generics;

class NewInt{
	//instance varaible
	int num1;
	public NewInt() {
		this.num1 = 0;
	}
	public NewInt(int num1) {
		this.num1 = num1;
	}
	public int getNum1() {
		return this.num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}	
}

public class Main {

	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		
		int obj1 = 20; //2147483647 , -2147483648 //Store value
		System.out.println(obj1);//Access value
		
		NewInt obj2 = new NewInt();
		obj2.setNum1(10);
		System.out.println(obj2.getNum1());
	}

}
