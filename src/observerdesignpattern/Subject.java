package observerdesignpattern;

public interface Subject {

    public void subscribe(Observer ob);
    public void unSubscribe(Observer ob);
    public void newVideoUploaded(String title);

}
