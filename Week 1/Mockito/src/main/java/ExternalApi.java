public interface ExternalApi {
    String getData();

    String getData(String id);

    void performAction();

    void performActionWithException();

    void stepOne();

    void stepTwo();
}
