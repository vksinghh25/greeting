package com.example.greeting;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class CalculatorServiceTests {

    @Test
    public void testMin() {

        CalculatorService calculatorService = new CalculatorService();

        int min = calculatorService.getMinimum(0, -20, 30);
        Assert.isTrue(min == -20);
    }
}
