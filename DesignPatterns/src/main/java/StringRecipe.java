import java.util.List;

public class StringRecipe {
    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformerList) { this.transformers = transformerList; }

    public void mix(StringDrink drink) {
        for (StringTransformer transformer: transformers) {
            transformer.execute(drink);
        }
    }

}
