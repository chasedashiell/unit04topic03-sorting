import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSortTest {
    @Test
    public void testSelectionSort() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("z", "b", "a", "p", "a"));
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList("a", "a", "b", "P", "z"));
        StringListSort.selectionSort(input);
        assertEquals(expectedOutput, input);
    }
}
