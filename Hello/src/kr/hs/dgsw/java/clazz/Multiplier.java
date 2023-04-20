package kr.hs.dgsw.java.clazz;

public class Multiplier {

    int aValue;
    int bValue;

    public void setOperand1(int operand) {
        this.aValue = operand;
    }

    public void setOperand2(int operand) {
        this.bValue = operand;
    }

    public void showResult() {
        System.out.printf("%d * %d = %d", this.aValue, this.bValue, this.aValue*this.bValue);
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        multiplier.setOperand1(5);
        multiplier.setOperand2(3);
        multiplier.showResult();
    }

}
