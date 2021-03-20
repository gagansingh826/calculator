package com.calculator;
import java.util.Scanner;
/**]
 * Name : Gagandeep Singh
 * Student ID: 201906363
 * Date Submitted: March 20, 2021
 * Class IN2203 G1
 * Name of assignment: Calculator
 */
public class Calculator {
    Scanner sc = new Scanner(System.in);
    double firstNum, secondNum;
    char operation;
    double result = 0.0;
    char runAgain = 'y';

    public void start() {
        do {
            getUserInput();
            calculate();
            System.out.println("Would you like to perfom another operation? (y/n)");
            runAgain = sc.next().charAt(0);
        } while (runAgain == 'y');
    }

    public void getUserInput() {
        System.out.println("Please enter the first number");
        firstNum = sc.nextDouble();
        System.out.println("Please enter the second number");
        secondNum = sc.nextDouble();

        System.out.println("Addition: +");
        System.out.println("Subtraction: +");
        System.out.println("Multiplication: *");
        System.out.println("Division: /");
        System.out.println("Exponential: e");
        System.out.print("Enter an operator: ");
        operation = sc.next().charAt(0);
    }

    public void calculate() {
        switch (operation) {
        case '+':
            result = add();
            break;

        case '-':
            result = subtract();
            break;

        case '*':
            result = multiply();
            break;

        case '/':
            result = divide();
            break;
        case 'e':
            result = exponential();
            break;
        default:
            System.out.printf("Error! operator is not correct");
            return;
        }
        System.out.println(firstNum + " " + operation + " " + secondNum + " = " + result);
    }

    public double add() {
        return firstNum + secondNum;
    }

    public double subtract() {
        return firstNum - secondNum;
    }

    public double multiply() {
        return firstNum * secondNum;
    }

    public double divide() {
        return firstNum / secondNum;
    }

    public double exponential() {
        return Math.pow(firstNum, secondNum); 
    }
}