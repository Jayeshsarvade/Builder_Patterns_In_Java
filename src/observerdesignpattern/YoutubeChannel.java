package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    List<Observer> subscriber = new ArrayList<>();


    @Override
    public void subscribe(Observer ob) {
    this.subscriber.add(ob);
    }

    @Override
    public void unSubscribe(Observer ob) {
    this.subscriber.remove(ob);
    }

    @Override
    public void newVideoUploaded(String title) {
    for (Observer ob: this.subscriber){
        ob.notified(title);
    }
    }
}
