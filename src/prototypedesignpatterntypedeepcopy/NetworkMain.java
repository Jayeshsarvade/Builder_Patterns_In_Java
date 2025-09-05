package prototypedesignpatterntypedeepcopy;


public class NetworkMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();


        //we want a new object of NetworkConnection
        NetworkConnection networkConnection2 =  (NetworkConnection) networkConnection.clone();
        NetworkConnection networkConnection3 =  (NetworkConnection) networkConnection.clone();

        System.out.println(networkConnection);
        networkConnection.getDomains().remove(1);

        System.out.println(networkConnection);
        System.out.println(networkConnection2);
        System.out.println(networkConnection3);
    }
}
