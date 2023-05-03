
package kr.hs.dgsw.java.inherit;

import java.util.Date;

public class Score {

    protected final int point;

    public Score(int point) {
        this.point = point;
    }

    public String getGrade() {
        return switch (point / 10) {
            case 9 -> "수";
            case 8 -> "우";
            case 7 -> "미";
            case 6 -> "양";
            case 5 -> "나";
            default -> "";
        };
    }

    @Override
    public String toString() {
        return "저는 Score 클래스이고, 제 점수는 " + point + "점이므로 \"" + getGrade() + "\" 입니다.";
    }

    public static void main(String[] args) {
        Object object = new Object();
        Score score = new Score(82);
        Date date = new Date();

        System.out.println(object.toString()); // 자동으로 toString()이 출력됨
        System.out.println(score.toString());
        System.out.println(date.toString());

        String str1 = new String("대한민국");
        String str2 = new String("Republic Of Korea");
        boolean same = str1.equals(str2); // False

        Score score1 = new Score(93);
        Score score2 = new Score(93);
        System.out.println(score1.equals(score2));
        System.out.println(score1.equals(null));


    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Score)) {
            return false;
        }
        return (getGrade() == ((Score) obj).getGrade());
    }
}