package programm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;


public class RepeatArrElemTest {

    static RepeatArrElem rae = null;
    static int arr[] = new int[]
    {1,2,3,4,5,6,7,8,9,10,100,
    11,12,13,14,15,16,17,18,19,20,
    21,22,23,24,25,26,27,28,29,30,
    31,32,33,34,35,36,37,38,39,40,
    41,42,43,44,45,46,47,48,49,50,
    51,52,53,54,55,56,57,58,59,60,
    61,62,63,64,65,66,67,68,69,70,
    71,72,73,74,75,76,77,78,79,80,
    81,82,83,84,85,86,87,88,89,90,
    91,92,93,94,95,96,97,98,99,100};

    static int arr1[] = new int[]
    {1,2,3,4,5,6,7,8,9,10,
    11,12,13,14,15,16,17,18,19,20,
    21,22,23,24,25,26,27,28,29,30,
    31,32,33,34,35,36,37,38,39,40,
    41,42,43,44,45,46,47,48,49,50,
    51,52,53,54,55,56,57,58,59,60,
    61,62,63,64,65,66,67,68,69,70,
    71,72,73,74,75,76,77,78,79,80,
    81,82,83,84,85,86,87,88,89,90,
    91,92,93,94,95,96,97,98,99,99};

    @BeforeClass
    public static void createClass(){
        rae = new RepeatArrElem();
    }

    @AfterClass
    public static void removeClass(){
        rae = null;
    }

    @Test
    public void findWithArrSizeMorThenOneHundredElementsExpectFalseTest(){
        assertFalse(rae.find(arr));
    }

    @Test
    public void findWithRepeatElementsInArrExpectFalseTest(){
        assertFalse(rae.find(arr1));
    }

    @Test
    public void findWithCorrectDataExpectTrueTest(){
        assertTrue(rae.find(1,2,3,4,5,6,7,8,9));
    }
}
