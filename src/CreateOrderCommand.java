class CreateOrderCommand implements Command {
    private TaxiService taxiService;

    public CreateOrderCommand(TaxiService taxiService) {
        this.taxiService = taxiService;
    }

    @Override
    public void execute() {
        taxiService.createOrder();
    }
}

class CancelOrderCommand implements Command {
    private TaxiService taxiService;

    public CancelOrderCommand(TaxiService taxiService) {
        this.taxiService = taxiService;
    }

    @Override
    public void execute() {
        taxiService.cancelOrder();
    }
}

class ChangeDestinationCommand implements Command {
    private TaxiService taxiService;
    private String newDestination;

    public ChangeDestinationCommand(TaxiService taxiService, String newDestination) {
        this.taxiService = taxiService;
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        taxiService.changeDestination(newDestination);
    }
}
