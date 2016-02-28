package dcll.rly.MySimpleStack;

/**
 * Created by rottanaly on 2/24/16.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * Un commentaire répondant à l'exigence #1.
     * @return
     */
    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
