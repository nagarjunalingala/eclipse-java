public class C implements Runnable {

	PrintNumbers obj;

	C(PrintNumbers p) {
		this.obj = p;
	}

	int number = 3;

	@Override
	public void run() {

		while (number < 100) {
			obj.printThree(number);
			number = number + 3;

		}

	}

}
