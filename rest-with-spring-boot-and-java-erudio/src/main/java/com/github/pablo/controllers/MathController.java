package com.github.pablo.controllers;

import com.github.pablo.exception.UnsupportedMathOperationException;
import com.github.pablo.service.MathService;
import com.github.pablo.util.NumberConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathService mathService;

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable String numberOne,
                      @PathVariable String numberTwo) {
        Double n1 = NumberConverter.convertToDouble(numberOne);
        Double n2 = NumberConverter.convertToDouble(numberTwo);
        return mathService.sum(n1, n2);
    }

    // http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        Double n1 = NumberConverter.convertToDouble(numberOne);
        Double n2 = NumberConverter.convertToDouble(numberTwo);
        return mathService.subtraction(n1, n2);
    }

    // http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        Double n1 = NumberConverter.convertToDouble(numberOne);
        Double n2 = NumberConverter.convertToDouble(numberTwo);
        return mathService.division(n1, n2);
    }

    // http://localhost:8080/math/multiplication/3/5
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        Double n1 = NumberConverter.convertToDouble(numberOne);
        Double n2 = NumberConverter.convertToDouble(numberTwo);
        return mathService.multiplication(n1, n2);
    }

    // http://localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        Double n1 = NumberConverter.convertToDouble(numberOne);
        Double n2 = NumberConverter.convertToDouble(numberTwo);
        return mathService.mean(n1, n2);
    }

    // http://localhost:8080/math/squareRoot/81
    @RequestMapping("/squareroot/{numberOne}")
    public Double squareroot(
            @PathVariable("numberOne") String numberOne
    ) {
        Double n1 = NumberConverter.convertToDouble(numberOne);
        return mathService.squareRoot(n1);
    }
}

