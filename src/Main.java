public class Main {
    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService();

        Command createOrder = new CreateOrderCommand(taxiService);
        Command cancelOrder = new CancelOrderCommand(taxiService);
        Command changeDestination = new ChangeDestinationCommand(taxiService, "New York");

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.setCommand(createOrder);
        dispatcher.executeCommand();

        dispatcher.setCommand(changeDestination);
        dispatcher.executeCommand();

        dispatcher.setCommand(cancelOrder);
        dispatcher.executeCommand();
    }
}
