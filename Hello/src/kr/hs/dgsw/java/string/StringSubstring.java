package kr.hs.dgsw.java.string;

public class StringSubstring {
    void study() {
        String str = "나 보기가 역겨워 가실 때에는, 말없이 고이 보내 드리오리다.";
        showSubstring(str, 0, 5);
        showSubstring(str, 10, 12);
    }
    void showSubstring(String str, int from, int to) {
        String sub = str.substring(from, to);
        System.out.printf("\"%s\" 의 %d부터 %d까지의 문자열은 \"%s\" 입니다.\n",
                str, from, to, sub);
    }

    public static void main(String[] args) {
        StringSubstring stringSubstring = new StringSubstring();
        stringSubstring.study();
    }
}
