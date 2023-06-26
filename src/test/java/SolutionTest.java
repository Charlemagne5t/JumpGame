import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void canJumpTest1() {
        int[] nums = {2, 3, 1, 1, 4};
        boolean actual = new Solution().canJump(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void canJumpTest2() {
        int[] nums = {3, 2, 1, 0, 4};
        boolean actual = new Solution().canJump(nums);

        Assert.assertFalse(actual);
    }

}
