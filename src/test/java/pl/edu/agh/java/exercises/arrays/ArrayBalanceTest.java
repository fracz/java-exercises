package pl.edu.agh.java.exercises.arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayBalanceTest {
    private ArrayBalance subject;
    private int[] array;
    private boolean expectedCanBalance;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{}, true},
                {new int[]{1}, false},//zmienilam z true na false
                {new int[]{1, 1}, true},
                {new int[]{1, 2}, false},
                {new int[]{1, 1, 2}, true},
                {new int[]{1, 2, 2}, false},
                {new int[]{1, 2, 3}, false},//jezeli ostatni obiekt to ture to ten tez powinien byc true
                {new int[]{33, 33, 1, 2, 1}, true},
                {new int[]{2, 1, 1, 2, 1}, true},//to powinno byc false
                {new int[]{3, 4, 5, 6}, true},
        });
    }

    public ArrayBalanceTest(int[] array, boolean expectedCanBalance) {
        this.array = array;
        this.expectedCanBalance = expectedCanBalance;
        this.subject = new ArrayBalance();
    }

    @Test
    public void testCanBalance() {
        Assert.assertEquals("Invalid result for: " + Arrays.toString(array), expectedCanBalance, subject.canBalance(array));
    }
}
