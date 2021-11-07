package reflection3;

public class SampleDemo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("reflection3.Sample");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
