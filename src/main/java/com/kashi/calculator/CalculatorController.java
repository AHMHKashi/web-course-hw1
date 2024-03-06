package com.kashi.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calc/{operand}/{op1}/{op2}")
    public String calcAdd(@PathVariable String operand, @PathVariable int op1, @PathVariable int op2) {
        return switch (operand) {
            case "sum" -> String.format("%d + %d = %d", op1, op2, op1 + op2);
            case "subtract" -> String.format("%d - %d = %d", op1, op2, op1 - op2);
            case "mult" -> String.format("%d * %d = %d", op1, op2, op1 * op2);
            case "div" -> String.format("%d / %d = %f", op1, op2, (float) op1 / op2);
            default -> "Invalid operand name!";
        };
    }
}
