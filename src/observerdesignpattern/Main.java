package observerdesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        YoutubeChannel youtubeChannel = new YoutubeChannel();
        Subscriber s1 = new Subscriber("Ram");
        Subscriber s2 = new Subscriber("Sham");
        Subscriber s3 = new Subscriber("Sita");

        youtubeChannel.subscribe(s1);
        youtubeChannel.subscribe(s2);
        youtubeChannel.subscribe(s3);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("press 1 to upload video");
            System.out.println("press 2 to create new Subscriber");
            System.out.println("press 3 to Unsubscriber");
            System.out.println("press 4 to Exit");

            int c = Integer.parseInt(br.readLine());
            if (c == 1){
                //new Video upload
                System.out.println("Enter video title: ");
                String videoTitle = br.readLine();
                youtubeChannel.newVideoUploaded(videoTitle);
            } else if (c==2) {
                //create new subscriber
                System.out.println("Enter Name of Subscriber: ");
                String subsName = br.readLine();
                Subscriber subscriber3 = new Subscriber(subsName);
                youtubeChannel.subscribe(subscriber3);
            } else if (c==3) {
                //Unsubscribe
                System.out.println("Enter Name of Subscriber to unsubscribe: ");
                String subsName = br.readLine();
                //create a temp subscriber to remove
                Subscriber temp = new Subscriber(subsName);
                youtubeChannel.unSubscribe(temp);
                System.out.println(subsName+" has been unsubscribed.");
            } else if(c==4){
                //exit
                System.out.println("Thank you for using app");
                break;
            }else {
                //exit wrong input
                System.out.println("wring input");
            }
        }
    }
}
