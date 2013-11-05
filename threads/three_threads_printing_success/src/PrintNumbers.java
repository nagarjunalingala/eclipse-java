public class PrintNumbers {

	final boolean[] status;

	public PrintNumbers() {
		status = new boolean[3];
		// tff - first
		// ftf - second
		// fft - third
		// first we start with first so , initialise with tff
		status[0] = true;
		status[1] = false;
		status[2] = false;
	}

	public synchronized void printOne(int number) {

		if (!(status[0] == true)) {
			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (!(status[1] == false && status[2] == false)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + number);
		status[0] = false;
		status[1] = true;
		status[2] = false;

		notifyAll();

	}

	public synchronized void printTwo(int number) {
		if (!(status[1] == true)) {
			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (!(status[0] == false && status[2] == false)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + number);

		status[0] = false;
		status[1] = false;
		status[2] = true;

		notifyAll();
	}

	public synchronized void printThree(int number) {
		if (!(status[2] == true)) {

			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (!(status[0] == false && status[1] == false)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + number);
		status[0] = true;
		status[1] = false;
		status[2] = false;

		notifyAll();
	}
}