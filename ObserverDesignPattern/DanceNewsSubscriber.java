public class DanceNewsSubscriber implements Subscriber {
    private String name;

    public DanceNewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received dance news: " + news);
    }

    @Override
    public String getType() {
        return "Dance";
    }
}
