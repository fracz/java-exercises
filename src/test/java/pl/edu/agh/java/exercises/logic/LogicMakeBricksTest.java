package pl.edu.agh.java.exercises.logic;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import pl.edu.agh.java.exercises.Logic.Logic_2_makeBricks;
import pl.edu.agh.java.exercises.arrays.ArrayBalance;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LogicMakeBricksTest {//nam eof testing file
    private Logic_2_makeBricks subject;//name of file we are testing
    private int small;
    private int big;
    private int goal;
    private boolean expectedCanBalance;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{


                {new int[]{3, 1, 18}, false},
                {new int[]{0, 1, 9}, false},
                {new int[]{0, 1, 26}, false},
                {new int[]{3, 1, 8}, true},
                {new int[]{3, 2, 10}, true},
                {new int[]{1, 1, 7}, true},
                {new int[]{0, 3, 10}, true},
                {new int[]{43, 1, 46}, true},


        });
    }

    public LogicMakeBricksTest(int[] array, boolean expectedCanBalance) {
        this.small = small;
        this.big = big;
        this.goal = goal;
        this.expectedCanBalance = expectedCanBalance;
        this.subject = new Logic_2_makeBricks();
    }

    @Test
    public void testCanBalance() {
        Assert.assertEquals("Invalid result for: " , expectedCanBalance, subject.makeBricks( small, big, goal));
    }
}
