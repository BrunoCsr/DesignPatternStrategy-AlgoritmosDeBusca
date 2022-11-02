import designPatter.strategy.c214.BubbleSortC;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortCTest {

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
    public void sortTestWithNegativeNumbers() {

        int[] n = {-2, 3, -60, 400, -1, 0};
        int[] orderedN = {-60, -2, -1, 0, 3, 400};
        int[] n2 = {};
        BubbleSortC bubbleSortC = new BubbleSortC();

        n2 = bubbleSortC.sort(n);

        Assert.assertArrayEquals(orderedN, n2);
    }

    @Test(expected = NullPointerException.class)
    public void whenNullPointerExceptionThrown_thenExpectationSatisfied() {
        int[] n2 = {};
        BubbleSortC bubbleSortC = new BubbleSortC();

        n2 = bubbleSortC.sort(null);
    }


    @Test
    public void sortArrayLengthLesserThanOrEqualToZeroTest() {
        int[] n = {};
        int[] n2 = {};
        BubbleSortC bubbleSortC = new BubbleSortC();
        n2 = bubbleSortC.sort(n);

        Assert.assertEquals(1, n2.length);
        Assert.assertEquals(0, n2[0]);


    }


}
