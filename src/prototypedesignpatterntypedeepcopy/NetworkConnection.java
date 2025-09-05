package prototypedesignpatterntypedeepcopy;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection  implements Cloneable{

    private String ip;
    private String importantDate;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantDate() {
        return importantDate;
    }

    public void setImportantDate(String importantDate) {
        this.importantDate = importantDate;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadVeryImportantData(){
        this.importantDate = "very very Important Data";

        domains.add("www.google.com");
        domains.add("www.facebook.com");
        domains.add("www.amazon.com");
        domains.add("www.uber.com");
        //it will take 5 mins
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantDate='" + importantDate + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //logic for cloning
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.ip);
        networkConnection.setImportantDate(this.importantDate);
        //deep copy
        for (String domain: this.domains){
            networkConnection.getDomains().add(domain);
        }
        return networkConnection;
    }
}
