package logger;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String a) {
		// TODO Auto-generated method stub
		
		System.out.println("***" + a + "***");
		
	}

	@Override
	public void error(String b) {
		// TODO Auto-generated method stub
		int asteriskCount = b.length() + 13;
		String asterisk = "*";
		String numberAsterisk = "";
		for (int i = 0 ; i < asteriskCount ; i++) {
			numberAsterisk += asterisk;
		}
		System.out.println(numberAsterisk + "\n" + "***Error: " + b + "***" + "\n" + numberAsterisk);
		
	}

}
