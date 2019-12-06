package com.kodilla;
import java.lang.*;


class SimpleCalculator
{
    public double subtractAFromB(double a, double b)
    {
        return a - b;
    }
    public double addAToB(double a,double b)
    {
        return a + b;
    }
}

class Application
{
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        double result1 = simpleCalculator.subtractAFromB(5, 5.87);

        double result2 = simpleCalculator.addAToB(6,8.54);

        System.out.format("%.2f\n", result1);
        System.out.format("%.2f\n", result2);
    }
}