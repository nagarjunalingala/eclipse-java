public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PrintNumbers p = new PrintNumbers();

		A a = new A(p);
		B b = new B(p);
		C c = new C(p);

		Thread one = new Thread(a);
		Thread two = new Thread(b);
		Thread three = new Thread(c);
		one.setName("first:");
		two.setName("second:");
		three.setName("third:");

		one.start();
		two.start();
		three.start();
	}

}
