
public class SolveDeadLock {
	final public String str1 = "abc";
	final public String str2 = "def";
	Thread t1 = new Thread("Thread1") {
		public void run() {
			//while (true) {
				synchronized (str1) {
					System.out.println("	synchronized (str1)");
					synchronized (str2) {
						System.out.println("	synchronized (str2)");
					}

				}
			//}

		}
	};

	Thread t2 = new Thread("Thread2") {
		public void run() {
			//while (true) {
				synchronized (str2) {
					System.out.println("  synchronized(str2)  ");
					synchronized (str1) {
						System.out.println("  synchronized(str1)  ");
					}
				}
			//}
		}

	};

	public static void main(String[] args) {
		SolveDeadLock s1 = new SolveDeadLock();
		s1.t1.start();
		s1.t2.start();

	}

}
