package ex2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExsTest
{
    static Exs perm = null;

    static int result3[][] = {
            {1,2,3},
            {2,1,3},
            {3,2,1},
            {2,3,1},
            {3,1,2},
            {1,3,2}};

    static int result4[][] = {
            {1,2,3,4},
            {2,1,3,4},
            {2,3,1,4},
            {3,2,1,4},
            {3,1,2,4},
            {1,3,2,4},

            {4,2,3,1},
            {2,4,3,1},
            {2,3,4,1},
            {3,2,4,1},
            {3,4,2,1},
            {4,3,2,1},

            {4,1,3,2},
            {1,4,3,2},
            {1,3,4,2},
            {3,1,4,2},
            {3,4,1,2},
            {4,3,1,2},

            {4,1,2,3},
            {1,4,2,3},
            {1,2,4,3},
            {2,1,4,3},
            {2,4,1,3},
            {4,2,1,3}
    };

    static int arr3[] = {1,2,3};

    static int arr4[] = {1,2,3,4};

    static int arr8[] = {1,2,3,4,5,6,7,8};

    @BeforeClass
    public static void crateClass(){
        perm = new Exs();
    }

    @AfterClass
    public static void destroyClass(){
        perm = null;
    }

    @Test
    public void permutationWithThreeElementsTest() {
        assertArrayEquals(perm.permutation(arr3), result3);
    }

    @Test
    public void permutationWithFourElementsTest() {
        assertArrayEquals(perm.permutation(arr4), result4);
    }

    @Test
    public void permutationWithEightElementsTest() {
        assertEquals(perm.permutation(arr8).length, 40320);
    }
}
