package kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(55, result);
    }
}
