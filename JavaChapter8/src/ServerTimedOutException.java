public class ServerTimedOutException extends Exception {
	private int port;

	public ServerTimedOutException(String message, int port) {
		super(message);
		this.port = port;
	}

	public int getPort() {
		return port;
	}
}