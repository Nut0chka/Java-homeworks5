package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class WorkScheduleServiceTest {
    @ParameterizedTest
    @CsvFileSource(files= "src/test/resources/WorkScheduleService.csv")
    void NumberOfMonthsForHolidaysFirst(int expected, int income, int expenses, int threshold) {
        WorkScheduleService service = new WorkScheduleService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
