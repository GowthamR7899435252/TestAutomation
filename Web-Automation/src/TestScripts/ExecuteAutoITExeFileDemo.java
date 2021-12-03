package TestScripts;

public class ExecuteAutoITExeFileDemo {
	public static void main(String[] args)
	{
		//executeFile();
		
		//notsavingnotepad();
		
		savingnotepad();
	}
	
	static void executeFile()
	{
		try
		{
		//	Runtime.getRuntime().exec("E:\\EXAMPLE\\AutoIT\\SampleTest.exe");
			Runtime runtime=Runtime.getRuntime();
			runtime.exec("D:\\AutoitExample\\Autoit sample.exe");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void notsavingnotepad()

	{
		try
		{
		//	Runtime.getRuntime().exec("E:\\EXAMPLE\\AutoIT\\SampleTest.exe");
			Runtime runtime1=Runtime.getRuntime();
			runtime1.exec("D:\\AutoitExample\\NotepadWithoutSaving.exe");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void savingnotepad()

	{
		try
		{
		//	Runtime.getRuntime().exec("E:\\EXAMPLE\\AutoIT\\SampleTest.exe");
			Runtime runtime1=Runtime.getRuntime();
			runtime1.exec("D:\\AutoitExample\\NotepadSaving.exe");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
