public class MusicNewsSubscriber implements Subscriber {
    private String name;

    public MusicNewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received music news: " + news);
    }

    @Override
    public String getType() {
        return "Music";
    }
}
