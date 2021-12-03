public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder reverse = new StringBuilder(drink.getText());
        reverse.reverse();
        drink.setText(reverse.toString());
    }
}
