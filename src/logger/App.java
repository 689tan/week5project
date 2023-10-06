package logger;

public class App  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Tannon";
		String lastName = "Hamilton";
		String verb = "did it";
		String status = "right";
		
		Logger astLog = new AsteriskLogger ();
		Logger astError = new AsteriskLogger ();
		
		Logger spaceLog = new SpacedLogger();
		Logger spaceError = new SpacedLogger()	;
		
		astLog.log(firstName);
		System.out.println("\n");
		astError.error(lastName);
		System.out.println("\n");
		System.out.println("\n");
		
		
		spaceLog.log(verb);
		System.out.println("\n");
		spaceError.error(status);
		
		
		
	}
}
