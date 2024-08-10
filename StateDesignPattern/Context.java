public class Context {
    private State state;

    public Context() {
        state = new Ice();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void incTemp() {
        state.incTemp(this);
    }

    public void decTemp() {
        state.decTemp(this);
    }
}
