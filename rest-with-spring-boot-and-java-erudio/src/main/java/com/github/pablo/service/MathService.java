package com.github.pablo.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double sum(Double a, Double b) {
        return a + b;
    }

    public Double subtraction(Double a, Double b) {
        return a - b;
    }

    public Double division(Double a, Double b) {
        return a / b;
    }

    public Double multiplication(Double a, Double b) {
        return a * b;
    }

    public Double mean(Double a, Double b) {
        return (a + b) / 2;
    }

    public Double squareRoot(Double a) {
        return Math.sqrt(a);
    }
}
