
public class ConnectionException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionException e1= new ConnectionException();
			
		try {
			e1.connectToDatabase("google.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void connectToDatabase(String serverName) throws Exception
	{
		if(serverName.isEmpty())
		{
			throw new Exception("no server name provided");
		}
		else
		{
			System.out.println("connected to database"+serverName);
		}
	}

}
