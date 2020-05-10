
public class TryCatch {

	public static void main(String[] args) {
		int a=1,b=0;
		try
		{
		divide(a,b);
		}
		catch(Exception ex)
		{
			
			System.out.println(ex.getMessage()); 
		}

	}
	public static int  divide(int a,int b)
	{	
	  return a/b;	
	}

}
