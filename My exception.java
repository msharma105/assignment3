public class MyException extends Exception {
	public MyException(String s) {
		// Call constructor of parent Exception
		super(s);
	}

	public static void main(String[] args) {
		try {

			throw new MyException("user defined exception");
		} catch (MyException ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}

	}
}
