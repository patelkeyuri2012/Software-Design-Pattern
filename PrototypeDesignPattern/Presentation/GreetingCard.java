public class GreetingCard implements Prototype {
    private String design;
    private String message;

    public GreetingCard() {

    }

    public GreetingCard(String design, String message) {
        this.design = design;
        this.message = message;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String display() {
        return design + "\n" + message;
    }

    @Override
    public Prototype clone() {
        return new GreetingCard(design, message);
    }
}