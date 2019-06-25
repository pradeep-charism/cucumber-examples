package calculator;

public class Calculator {

    public Integer add(Integer a, Integer b) {
        return a+b;
    }

    public Integer subtract(Integer int1, Integer int2) {
        return int1-int2;
    }

    public Object divide(Integer int1, int int2) {
        if(int2 == 0){
            return "Divide by zero exception";
        }
        return Double.valueOf(int1)/Double.valueOf(int2);
    }
}
