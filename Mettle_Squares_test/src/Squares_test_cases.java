//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Squares_test_cases {

	 @Test
	    public void testFindPerfectSquares() {
	        List<Integer> inputList = new ArrayList<>(Arrays.asList(16, 25, 9, 36, 10));
	        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(16, 25, 9, 36));

	        List<Integer> actualOutput = Squares.findPerfectSquares(inputList);

	        Assert.assertEquals(expectedOutput, actualOutput);
	    }

	    @Test
	    public void testFindPerfectSquaresWithEmptyList() {
	        List<Integer> inputList = new ArrayList<>();
	        List<Integer> expectedOutput = new ArrayList<>();

	        List<Integer> actualOutput = Squares.findPerfectSquares(inputList);

	        Assert.assertEquals(expectedOutput, actualOutput);
	    }

	    @Test
	    public void testFindPerfectSquaresWithNoPerfectSquares() {
	        List<Integer> inputList = new ArrayList<>(Arrays.asList(2, 3, 5, 7));
	        List<Integer> expectedOutput = new ArrayList<>();

	        List<Integer> actualOutput = Squares.findPerfectSquares(inputList);

	        Assert.assertEquals(expectedOutput, actualOutput);
	    }

}
