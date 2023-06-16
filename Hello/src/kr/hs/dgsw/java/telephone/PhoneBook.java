package kr.hs.dgsw.java.telephone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class PhoneBook {

    private final HashMap<String, String> numberList = new HashMap<>();

    // 전화번호 저장
    public void saveNumber(String name, String number) {
        numberList.put(name, number);
    }

    // 전화번호 목록 출력
    public void printList() {
        System.out.println("\n[전화 목록]");
        System.out.println("------------------------------------------------");

        for (String key : numberList.keySet()) {
            System.out.println("[이름] " + key + " [번호] " + numberList.get(key));
        }
    }

    // 전화번호 검색
    public void searchNumber(String toSearch) {
        System.out.println("\n[검색한 전화 목록]");
        System.out.println("------------------------------------------------");

        for (String key : numberList.keySet()) {
            if (key.contains(toSearch)) {
                System.out.println("[이름] " + key + " [번호] " + numberList.get(key));
            }
        }
    }

    // 프로그램 종료
//    public void quitProgram(boolean keep) {
//        keep = false;
//    }

    // 전화번호부 사용법 출력
    public void printHowToUse() {
        System.out.println("\n\n[전화번호부 사용법]\n");
        System.out.println("1. 전화번호 저장");
        System.out.println("2. 전화번호 목록 출력");
        System.out.println("3. 전화번호 검색");
        System.out.println("4. 프로그램 종료");
    }

}
