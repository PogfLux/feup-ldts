public class RomulanAlien extends AlienClient{

    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }

}
