package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(6, 27);
        double resultSub = calculator.sub(6, 27);
        double resultMul = calculator.mul(6, 27);
        double resultDiv = calculator.div(6, 27);
        //Then
        Assert.assertEquals(33, resultAdd, 0);
        Assert.assertEquals(-21, resultSub,0);
        Assert.assertEquals(162, resultMul,0);
        Assert.assertEquals(0.22, resultDiv,0.01);
    }
}