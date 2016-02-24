package dcll.rly.MySimpleStack;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.InputMismatchException;

/**
 * Created by rottanaly on 2/24/16.
 */
public class SimpleStackImplTest extends TestCase {

    SimpleStack simpleStack;

    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis executé avant chaque test");
    }

    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        Assert.assertEquals(false, simpleStack.isEmpty());

    }

    public void testGetSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1+"2")));
        // La taille doit augmenter de 2
        Assert.assertEquals(2, simpleStack.getSize());
    }

    public void testPush() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        // la pile doit etre augmente de un item
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        // on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);

    }

    public void testPeek() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        // ne doit pas retirer l'objet de la pile
        Assert.assertEquals(1, simpleStack.getSize());
        // on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    public void testPop() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        // on doit retirer l'objet de la pile
        Assert.assertEquals(0, simpleStack.getSize());
        // on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);

    }
}