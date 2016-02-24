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
     * j'ai modifié ça.
     * @return
     */
    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
