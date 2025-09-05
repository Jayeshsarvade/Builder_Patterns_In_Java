package prototypedesignpatternandshallowtype;

public class NetworkMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);

        //we want a new object of NetworkConnection
        NetworkConnection networkConnection2 =  (NetworkConnection) networkConnection.clone();
        networkConnection2.setIp("192.167.2.2");
        networkConnection2.loadVeryImportantData();
        System.out.println(networkConnection2);

        NetworkConnection networkConnection3 =  (NetworkConnection) networkConnection.clone();
        System.out.println(networkConnection3);
    }
}
