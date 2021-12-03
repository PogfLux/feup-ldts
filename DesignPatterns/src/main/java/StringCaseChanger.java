public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            char c1 = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            result.append(c1);
        }

        drink.setText(result.toString());
    }
}
