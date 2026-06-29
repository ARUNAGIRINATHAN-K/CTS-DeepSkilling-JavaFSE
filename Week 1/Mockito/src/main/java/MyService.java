public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }

    public String fetchData(String id) {
        return externalApi.getData(id);
    }

    public void executeAction() {
        externalApi.performAction();
    }

    public void executeActionWithException() {
        externalApi.performActionWithException();
    }

    public void executeSteps() {
        externalApi.stepOne();
        externalApi.stepTwo();
    }
}
