package kr.hs.dgsw.java.inter;

public class Adder implements Calculator{
    @Override
    public int calculator(int op1, int op2) {
        return op1 + op2;
    }

    @Override
    public String getOperator() {
        return "+";
    }
}
