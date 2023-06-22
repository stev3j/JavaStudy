package kr.hs.dgsw.java.generic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenericDate<T extends Date> {

    private T date;

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public void printDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(date));
    }

    public static void main(String[] args) {
        GenericDate<Date> genericDate = new GenericDate<>();

        genericDate.setDate(new Date());
        genericDate.printDate();

//        GenericDate<String> obj = new GenericDate<String>();

    }
}
