import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private List<StringRecipe> wantedRecipes = new ArrayList<>();
    private List<StringDrink> wantedDrinks = new ArrayList<>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            recipe.mix(drink);
        } else {
            wantedDrinks.add(drink);
            wantedRecipes.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (int i = 0; i < wantedRecipes.size(); i++) {
            wantedRecipes.get(i).mix(wantedDrinks.get(i));
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
