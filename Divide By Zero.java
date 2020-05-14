
public class TryCatch {

	public static void main(String[] args) {
		int a = 1, b = 0;
		try {
			divide(a, b);
		} catch (Exception ex) {

			System.out.println(ex.getMessage());
		}
	}
	public static int divide(int a, int b) throws MyException {
		if (b == 0)
			throw new MyException("user defined exception");
		return a / b;
	}
}

class MyException extends Exception {
	public MyException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}
