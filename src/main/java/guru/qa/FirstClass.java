package guru.qa;

public class FirstClass {

    byte aByte; // 8 bit -128 ... 127
    short aShort = 100 ; // 16 bit -32768 ... 32767

    // самый используемый
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    // самый используемый (если просто хранить, но не использовать арифметику)
    double aDouble = 0.0D; // 64 bit

    char aChar = 'c';
    boolean aBoolean = false;
    String aString = "hello, qa.guru!";

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

//        System.out.println(5 + 10);

        // >
        // <
        // >=
        // <=
        // ==
        // !=
//        System.out.println(2 != 3);

        // =
        // +=
        // -=...
        int a = 10;
        int b = 10;
        a = a + b;
        a += b;

//        System.out.println(5 % 2);

        // && (&)
        // || (|)
        // !

        boolean result = (3 < 4) || false;

        Book murzilka = new Book();
        murzilka.doReadBook();
    }


}
