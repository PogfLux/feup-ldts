public class HumanClient implements Client{
    private OrderingStrategy clientType;

    public HumanClient(OrderingStrategy strategy) {
        this.clientType = strategy;
    }

    @Override
    public void happyHourStarted(Bar bar) {

    }

    @Override
    public void happyHourEnded(Bar bar) {

    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        clientType.wants(drink, recipe, bar);
    }
}
