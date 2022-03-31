import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void nextDay() {
        String dayInMonth = NextDayCalculator.nextDay(30,12,2020);
        String expected = "31/12/2020";
        assertEquals(expected,dayInMonth);
    }
    @org.junit.jupiter.api.Test
    void nextDay1() {
        String dayInMonth = NextDayCalculator.nextDay(30,12,2020);
        String expected = "1/1/2021";
        assertEquals(expected,dayInMonth);
    }
}