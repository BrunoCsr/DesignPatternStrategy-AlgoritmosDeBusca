import designPatter.strategy.c214.BubbleSortC;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sortTest() {
        //CONTEXT
        int[] n = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] orderedN = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] n2 = {};
        BubbleSortC bubbleSortC = new BubbleSortC();

        //ACT
        n2 = bubbleSortC.sort(n);

        //ASSERT
        Assert.assertArrayEquals(orderedN, n2);//expected --> actual

    }

    @Test
    public void sortTestWithNegativeNUmbers() {

        int[] n = {-2, 3, -60, 400, -1, 0};
        int[] orderedN = {-60, -2, -1, 0, 3, 400};
        int[] n2 = {};

        BubbleSortC bubbleSortC = new BubbleSortC();

        n2 = bubbleSortC.sort(n);

        Assert.assertArrayEquals(orderedN, n2);


    }

}
