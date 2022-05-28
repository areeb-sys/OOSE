abstract class AbstractServer
{
	abstract void listen();
	abstract void stopListening();
	abstract void close();
	abstract void sendToAllClients();
	// HOOK
	abstract void serverStarted();
	abstract void clientConnected();
	abstract void clientDisconnected();
	abstract void clientException();
	abstract void serverStopped();
	abstract void listeningException();
	abstract void serverClosed();
	
	// Slot
	abstract void handleMessageFromClient();
	// accessor
	
	abstract void isListening();
	abstract void getNumberOfClients();
	abstract void getClentConnections();
	abstract void getPort();
	abstract void getBacklog();
}


abstract class ConnectionToClient extends AbstractServer
{
	abstract void sendToClient();
	abstract void close();
	abstract void getInetAddress();
	abstract void setInfo();
	abstract void getInfo();
}


abstract class AbstractClient
{
	// CONTROL
	abstract void openConnection();
	abstract void SendToServer();
	abstract void closeConnection();
	
	// HOOK
	
	abstract void connectionEstablished();
	abstract void connectionClosed();
	abstract void connectionException();
	
	// SLOT
	
	abstract void handleMessageFromServer();
	
	// ACCESSOR
	
	abstract void  isConnected();
	abstract void getPort();
	abstract void setPort();
	abstract void getHost();
	abstract void setHost();
	abstract void getInetAddress();
}

class Main
{
	public static void main(String args[])
	{
		System.out.println("Why r u gay?");
	}
}

