public class StringReplacer implements StringTransformer{
    private char toReplace;
    private char replacement;

    public StringReplacer(char toReplace, char replacement) {
        this.toReplace = toReplace;
        this.replacement = replacement;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(toReplace, replacement));
    }
}
