import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleTest {

    @Test
    public void testCalculateOvulationDate() {
        MenstrualCycle cycle = new MenstrualCycle(28, 5, "2024-11-01");
        String ovulationDate = cycle.calculateOvulationDate();

        assertEquals("2024-11-14", ovulationDate);
    }

    @Test
    public void testCalculateSafePeriod() {
  
        MenstrualCycle cycle = new MenstrualCycle(28, 5, "2024-11-01");

        String safePeriod = cycle.calculateSafePeriod();

        assertEquals("2024-11-04 to 2024-11-07 and 2024-11-15 to 2024-11-21", safePeriod);
    }

    @Test
    public void testCalculateNextPeriodStartDate() {
        MenstrualCycle cycle = new MenstrualCycle(28, 5, "2024-11-01");

        String nextPeriod = cycle.calculateNextPeriodStartDate();

        assertEquals("2024-11-29", nextPeriod);
    }
}
