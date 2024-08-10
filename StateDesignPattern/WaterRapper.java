public class WaterRapper implements State {
    @Override
    public void incTemp(Context context) {
        context.setState(new WaterRapper());
    }

    @Override
    public void decTemp(Context context) {
        context.setState(new Water());
    }
}
