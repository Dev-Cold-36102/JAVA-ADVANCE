package Factorial;

public class Factorial {
    int limitNumber;

    Factorial(int limitNumber) {
        this.limitNumber = limitNumber;
    }

    public int getFactorial(int limitNumber) {
        if (limitNumber > 0) {
            return limitNumber * getFactorial(limitNumber - 1);
        } else return 1;
    }
}
