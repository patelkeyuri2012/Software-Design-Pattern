public interface RequestHandler {
    void setNextRequestHandler(RequestHandler requestHandler);

    boolean process(int number);

    RequestHandler getNextRequestHandler();
}