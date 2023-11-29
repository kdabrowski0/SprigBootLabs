package com.ug.zad.springlab04zad01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathApplication {
    private final Calculator calculator;

    @Autowired
    public MathApplication(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int a, int b) {
        return calculator.add(a, b);
    }
    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
    }

}
