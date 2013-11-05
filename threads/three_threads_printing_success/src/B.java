public class B implements Runnable {

	PrintNumbers obj;

	B(PrintNumbers p) {
		this.obj = p;
	}

	int number = 2;

	@Override
	public void run() {

		while (number < 100) {
			obj.printTwo(number);
			number = number + 3;

		}

	}

}
