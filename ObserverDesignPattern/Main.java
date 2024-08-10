public class Main {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();

        Subscriber sportsSubscriber = new SportsNewsSubscriber("Sports News Subscriber");
        Subscriber musicSubscriber = new MusicNewsSubscriber("Music News Subscriber");
        Subscriber danceSubscriber = new DanceNewsSubscriber("Dance News Subscriber");

        publisher.register(sportsSubscriber);
        publisher.register(musicSubscriber);
        publisher.register(danceSubscriber);

        publisher.notify("Football World Cup canceled\n", "Sports");
        publisher.notify("Artist Aditya Gadhvi drops a new song\n", "Music");
        publisher.notify("Live concert canceled due to weather conditions\n", "Dance");

        publisher.unregister(sportsSubscriber);

        publisher.notify("Tennis Grand Slam postponed\n", "Sports");
        publisher.notify("Band BTS latest album out now\n", "Music");
        publisher.notify("Ballet performance rescheduled due to venue maintenance\n", "Dance");

    }
}
