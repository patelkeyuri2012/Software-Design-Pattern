public class NegativeHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void setNextRequestHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    @Override
    public boolean process(int number) {
        if (number < 0) {
            return true;
        } else if (nextHandler != null) {
            return nextHandler.process(number);
        }
        return false;
    }

    @Override
    public RequestHandler getNextRequestHandler() {
        return nextHandler;
    }
}