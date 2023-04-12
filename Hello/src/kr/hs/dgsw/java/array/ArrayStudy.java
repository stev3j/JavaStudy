package kr.hs.dgsw.java.array;

public class ArrayStudy {

    void study() {
        // 배열의 선언
        int[] intArray = new int[5];
        int intArray2[] = new int[5];

        double[] doubleArray = new double[20];
        String[] strArray = new String[12];

        // 읽고 쓰기
        intArray[2] = 7;
        strArray[4] = "Korea";

        System.out.println(strArray[4]);
        System.out.println(strArray[0]);
        System.out.println(intArray[0]);
    }

    void studyInit() {
        int[] initArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(initArray[3] + initArray[2]);

        String[] colorArray = new String[] {
                "white", "black", "red", "blue", "yellow", "green", "purple", "orange"
        };

        int lengthOfColors = colorArray.length;

        System.out.println(lengthOfColors);

//        for(int i = 0; i < lengthOfColors; i++) {
//            System.out.println(colorArray[i]);
//        }

        // 아래가 더 효율적

       for (String color : colorArray) {
            System.out.println(color);
        }

       initArray[-1] = 3; // Error: ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        ArrayStudy arrayStudy = new ArrayStudy();
//        arrayStudy.study();
        arrayStudy.studyInit();
    }

}
