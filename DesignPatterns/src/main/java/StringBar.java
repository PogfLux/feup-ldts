public class StringBar extends Bar{
    private boolean happyHour;

    public StringBar(){
        this.happyHour = false;
    }

    @Override
    public boolean isHappyHour() {
        return this.happyHour;
    }

    @Override
    public void startHappyHour() {
        this.happyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.happyHour = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
