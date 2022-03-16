package guru.qa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstClass {

    byte aByte; // 8 bit -128 ... 127
    short aShort = 100; // 16 bit -32768 ... 32767

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

//        Book war = new Book("Лев Толстой", "Война и Мир");
        Book war0 = new Book("Лев Толстой", "Анна Каренина");
        Book war1 = new Book("Лев Толстой", "Анна Каренина");
        Book stupid = new Book("Федор Достоевский", "Идиот");
        Book master = new Book("Михаил Булгаков", "Мастер и Маргарита");
        Book remark = new Book("Эрих Мария Ремарк", "Ночь в Лиссабоне");


        Book[] library = new Book[]{war0, war1, stupid, master, remark};
        List<Book> libList = List.of(war0, war1, stupid, master, remark);
        Set<Book> libSet = Set.of(war0, war1, stupid, master, remark);

        Map<Integer, Book> booksMap = new HashMap<>() {{
            put(1, war0);
            put(2, war1);
            put(3, stupid);
        }};



        for (int i = (libList.size() - 1); i >= 0; i--) {
            System.out.println("book " + libList.get(i).doReadBook());
        }

        System.out.println("###");

        for (Book book : libSet) {
            System.out.println("book " + book.doReadBook());
        }

        int index = 0;
        while (index < library.length) {
            System.out.println("book " + library[index].doReadBook());
            index++;
        }

        do {
            System.out.println("book " + library[index].doReadBook());
            index++;
        } while (index < library.length);

        Book desiredBook;

        for (Book book : libList) {
            if (book.author.contains("Достоевский")) {
                desiredBook = book;
            }
        }

        for (Map.Entry<Integer, Book> bookEntry : booksMap.entrySet()) {
            Integer key = bookEntry.getKey();
            Book value = bookEntry.getValue();
        }

        for (Book value : booksMap.values()) {

        }
    }
}
