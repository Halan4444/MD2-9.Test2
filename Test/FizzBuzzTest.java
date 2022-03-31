import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {


    @org.junit.jupiter.api.Test
    void divideNumber() {
        String expected = "4 ";
        String number = FizzBuzz.divideNumber(4);
        assertEquals(expected, number);

        String expected1 = "Chín";
        String translate = FizzBuzz.translate(9);
        assertEquals(expected1, translate);

        String expected2 = "Fizz";
        String anyNumberHasA3 = FizzBuzz.divideNumber(73);
        assertEquals(expected2, anyNumberHasA3);

        String expected3 = "Fizz";
        String anyNumberHasA4 = FizzBuzz.inputNumber(6);
        assertEquals(expected3, anyNumberHasA4);
    }
}