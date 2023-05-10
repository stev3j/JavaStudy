package kr.hs.dgsw.java.inherit.calculator;

public class Adder extends SimpleCalculator{
    @Override
    public int calulator() {
        return op1 + op2;
    }

    @Override
    public String getOperator() {
        return "+";
    }

    public static void main(String[] args) {
        SimpleCalculator adder = new Adder();

        adder.execute();
    }
}
