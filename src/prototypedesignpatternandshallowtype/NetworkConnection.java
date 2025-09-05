package prototypedesignpatternandshallowtype;

public class NetworkConnection  implements Cloneable{

    private String ip;
    private String importantDate;

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

    public void loadVeryImportantData(){
        this.importantDate = "very very Important Data";
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
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
