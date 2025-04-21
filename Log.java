
import java.time.LocalDateTime;

public class Log {

	private User associatedUser;
	private String message;
	private LocalDateTime dateTime;
	private int severity;

	/**
	 * 
	 * @param message
	 * @param user
	 */
	public Log(String message, User user) {
		// TODO - implement Log.Log
		throw new UnsupportedOperationException();
	}

	public String getMessage() {
		return this.message;
	}

	public LocalDateTime getDateTime() {
		return this.dateTime;
	}

	public int getSeverity() {
		return this.severity;
	}

	public User getAssociatedUser() {
		return this.associatedUser;
	}

}