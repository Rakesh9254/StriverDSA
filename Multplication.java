package StriverDSA;

public class Multplication {

	int multi(int a, int b) {
		return a * b;
	}

	int multi(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {
		Multplication result = new Multplication();
		System.out.println("Multplication of 2 No is :" + result.multi(4, 5));
		System.out.println("Multplication of 2 No is :" + result.multi(4, 5, 6));
	}

}
