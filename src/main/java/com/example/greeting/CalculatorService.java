package com.example.greeting;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int getMinimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
