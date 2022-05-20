import example.codeclan.com.JumpSearch;
import example.codeclan.com.SelectionSort;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortSearchTest {

    private ArrayList<Integer> numbers;
    private SelectionSort sort;

    private JumpSearch search;


    @Before
    public void before(){
        numbers = new ArrayList<>();
        sort = new SelectionSort();
        search = new JumpSearch();
        numbers.add(5);
        numbers.add(100);
        numbers.add(15);
        numbers.add(59);
        numbers.add(7);
        numbers.add(95);
        numbers.add(38);
        numbers.add(82);
        numbers.add(11);
        numbers.add(31);
        numbers.add(64);
        numbers.add(75);
        numbers.add(58);
        numbers.add(42);
        numbers.add(28);
        numbers.add(43);
    }

    @Test
    public void checkSelectionSort(){
        ArrayList<Integer> result = sort.selectionSort(numbers);
//        System.out.println(numbers);
        assertEquals(Arrays.asList(5, 7, 11, 15, 28, 31, 38, 42, 43, 58, 59, 64, 75, 82, 95, 100), result);
    }

    @Test
    public void searchNumberFound(){
        ArrayList<Integer> sortedNumbers = sort.selectionSort(numbers);
        assertTrue(search.find(sortedNumbers, 42));
    }

    @Test
    public void searchNumberNotFound(){
        ArrayList<Integer> sortedNumbers = sort.selectionSort(numbers);
        assertFalse(search.find(sortedNumbers, 99));
        }
}

