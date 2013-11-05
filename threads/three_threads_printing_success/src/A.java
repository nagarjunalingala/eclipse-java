public class A implements Runnable {

	PrintNumbers obj;

	A(PrintNumbers p) {
		this.obj = p;
	}

	int number = 1;

	@Override
	public void run() {
		//System.out.println("under run of A");

		while (number < 100) {
			obj.printOne(number);
			number = number + 3;

		}

	}

}
