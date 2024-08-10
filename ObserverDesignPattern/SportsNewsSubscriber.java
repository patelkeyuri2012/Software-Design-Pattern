public class SportsNewsSubscriber implements Subscriber {
    private String name;

    public SportsNewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received sports news: " + news);
    }

    @Override
    public String getType() {
        return "Sports";
    }
}
