public class Ice implements State {
    @Override
    public void incTemp(Context context) {
        context.setState(new Water());
    }

    @Override
    public void decTemp(Context context) {
        context.setState(new Ice());
    }
}
