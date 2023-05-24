package kr.hs.dgsw.java.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        LinkedList<String> LinkList = new LinkedList<>();

        // size, add, get

        colors.size();

        colors.add("빨강");
        colors.add("노랑");

        String color = colors.get(0);
        System.out.println(color);

        colors.add(2, "파랑"); // 인덱스 지정은 '이미 들어가 있는 곳/``바로 다음' 에 넣을 수 있음.

        System.out.println(colors.get(2));

        MyList myList = new MyList();

        myList.add("ㅁㄴㅇㄹ");
        String result = myList.get(0);
        myList.remove(0);
        String deleted = myList.get(0);
        System.out.println("삭제 전 : " + result);
        System.out.println("삭제 후 : " + deleted);
    }
}
