package kr.hs.dgsw.java.inherit;

public class MathScore extends Score {

    public MathScore(int point) {
        super(point);
    }

    @Override
    public String getGrade() {
        return switch (point / 10) {
            case 10, 9 -> "수";
            case 8, 7, 6 -> "우";
            case 5 -> "미";
            case 4 -> "양";
            default -> "가";
        };
    }

    public static void main(String[] args) {
        Score korean = new Score(82);
        Score math = new MathScore(65);

        boolean same = korean.equals(math);
        System.out.println(same);
    }
}