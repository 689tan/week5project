package logger;

public class SpacedLogger implements Logger {

	@Override
	public void log(String a) {
		// TODO Auto-generated method stub
		String newString = "";
		for(int i = 0 ; i < a.length(); i++) {
			newString += a.charAt(i) + " ";
		}System.out.println(newString);
	}

	@Override
	public void error(String b) {
		// TODO Auto-generated method stub
		String newString = "";
		String errorText = "Error: ";
		
		for(int i = 0 ; i < b.length(); i++) {
			newString += b.charAt(i) + " ";
		}System.out.println(errorText + newString);
	}

}
