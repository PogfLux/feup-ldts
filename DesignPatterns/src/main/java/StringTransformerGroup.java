import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> transformerList;

    public StringTransformerGroup(List<StringTransformer> transformers) {this.transformerList = transformers; }

    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer transformer: this.transformerList){
            transformer.execute(drink);
        }
    }
}
