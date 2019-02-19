
public class RuntimeDemo {
	
	protected RuntimeDemo()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime objRun = Runtime.getRuntime();
		Process ObjProcess = null;
		try
		{
			ObjProcess = objRun.exec("calc.exe");
			System.out.println(objRun.freeMemory());
			System.out.println(System.getProperty("java.vendor")); /* diaplay system info with help
			                                                                of system class */
		}
		catch(Exception e)
		{
			System.out.println("ERROR EXECUTING CALCUALTION");
		}
	}

}
