package kr.hs.dgsw.java.inherit.calculator;

import kr.hs.dgsw.java.inherit.Score;

public class Multiplier extends SimpleCalculator{
    @Override
    public int calulator() {
        return op1 * op2;
    }

    @Override
    public String getOperator() {
        return "*";
    }

    public static void main(String[] args) {
        SimpleCalculator multiplier = new Multiplier();

        multiplier.execute();
    }
}
