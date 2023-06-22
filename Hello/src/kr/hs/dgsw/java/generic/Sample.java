package kr.hs.dgsw.java.generic;

import javax.xml.crypto.Data;
import java.util.Date;

public class Sample<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {

        Sample<String> tt = new Sample<>();
        tt.setValue("ttt");
        Object ans = tt.getValue();
        System.out.println(ans);

        Sample<Integer> intSample = new Sample<>();
        intSample.setValue(1);
//        intSample.setValue("blahblah");
        Object ans2 = intSample.getValue();
        System.out.println(ans2);

        Sample<Date> sample = new Sample<>();
        sample.setValue(new Date());
        Date data = sample.getValue();
    }
}
