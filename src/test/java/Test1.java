import SolutionLesson6.Solution;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test1 {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1, 2}, new int[]{1,2,4,4,2,3,4,1,7}},
                {new int[]{1, 7}, new int[]{1,2,4,4,2,3,4,1,7}},
                {new int[]{1,2,3},new int[]{1,2,2,3,1,7}},
        });
    }

    private int[] a;
    private int[] b;
    private Solution solution;

    public Test1(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testT1() {
        Assert.assertArrayEquals(a, solution.massFor4(b));
    }
}
