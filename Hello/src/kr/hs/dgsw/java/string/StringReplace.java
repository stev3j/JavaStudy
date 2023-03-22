package kr.hs.dgsw.java.string;

public class StringReplace {

    void study() {
        String str1 = "어쩌구저쩌구 저의 이름은 조승완입니다.";

        stringReplace(str1, "어쩌구저쩌구", "안녕하세요!");
    }

    void stringReplace(String target, String str1, String str2) {
        target = target.replaceAll(str1, str2);
        System.out.printf("\"%s\" 가 \"%s\" 으로 변경되었습니다.\n 결과 : \"%s\"", str1, str2, target);
    }

    public static void main(String[] args) {
        StringReplace stringReplace = new StringReplace();
        stringReplace.study();
    }


}
