package kr.hs.dgsw.java.datatype;

public class DataTypeStudy {

    void Integer() {
        byte byteValue = 1;
        short shortValue = 1;
        int intValue = 1;
        long longValue = 1L;

        System.out.printf("byte %d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short %d ~ %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int %d ~ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long %d ~ %d\n", Long.MIN_VALUE, Long.MAX_VALUE);

        byte max = 127;
        max += 1;
        System.out.printf("127 + 1 = %d\n", max);

        int value1 = 1200000000;
        int value2 = 1300000000;
        System.out.printf("%d + %d = %d\n", value1, value2, value1 + value2);

        shortValue = 30000;
        byteValue = (byte) shortValue;
//        shortValue = byteValue;

        System.out.printf("%d -> %d", shortValue, byteValue);
    }

    void Float() {

    }

    public static void main(String[] args) {
        DataTypeStudy dataTypeStudy = new DataTypeStudy();

        dataTypeStudy.Integer();
    }


}
