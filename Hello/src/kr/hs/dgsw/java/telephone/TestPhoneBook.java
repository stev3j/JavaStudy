package kr.hs.dgsw.java.telephone;

import java.util.Scanner;

public class TestPhoneBook {

    public static void main(String[] args) {

        boolean keep = true;
        Scanner scanner = new Scanner(System.in);

        PhoneBook phoneBook = new PhoneBook();

        while (keep) {
            phoneBook.printHowToUse();
            System.out.print("\n하고픈 작업에 알맞은 번호를 입력해주세요! : ");
            String select = scanner.next();

            switch (select) {
                case "1" :
                    System.out.print("\n저장할 번호의 이름을 입력해주세요. : ");
                    String name = scanner.next();
                    System.out.print("저장할 번호를 입력해주세요. : ");
                    String number = scanner.next();

                    phoneBook.saveNumber(name, number);
                    break;

                case "2" :
                    phoneBook.printList();
                    break;

                case "3" :
                    System.out.print("\n검색할 이름을 입력해주세요. : ");
                    String nameToSearch = scanner.next();
                    phoneBook.searchNumber(nameToSearch);
                    break;

                case "4" :
                    System.out.println("\n* 프로그램이 종료됩니다");
                    keep = false;
                    break;

                default :
                    System.out.println("\n* 1부터 4까지의 숫자만 입력해주세요!");
                    break;
            }
        }

    }
}
