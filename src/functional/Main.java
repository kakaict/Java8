package functional;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.*;

/**
 * Created by khaitq
 * Date: 12/01/2019
 * Github:  https://github.com/quangkhai88
 */

public class Main {

    public static void main(String ...args) {

        BiPredicate<String, Integer> testLengString = (String t, Integer u) -> t.length() > u;
        testBiPredicate(testLengString);

        BinaryOperator<String> binaryOperator = (s,t) -> s + t;
        testBiUnaryOperator(binaryOperator);

        Supplier<String> supplier = () -> new String("vvcv");
        testSupplier(supplier);

        BiConsumer<StringBuilder, Integer> biConsumer = (s,t) -> s.append(t);
        testBiConsumer(biConsumer);

        Consumer<Object> print = obj -> System.out.println(obj);

        Supplier<Book> bookSupplier = () -> {
            Book b = new Book();
            b.name = "cccc";
            return b;
        };

        print.accept(bookSupplier.get().toString());

        Supplier<LocalDate> supplier1  = LocalDate::now;

    }

    public static void testBiPredicate(BiPredicate<String, Integer> testPredicate) {
            System.out.println(testPredicate.test("helloff", 5 ));
    }

    public static  void testBiUnaryOperator(BinaryOperator<String> unaryOperator) {
            System.out.println(unaryOperator.apply("helllo", "vcl"));
    }

    public static void testSupplier(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    public static  void testBiConsumer(BiConsumer<StringBuilder, Integer> biConsumer) {
        StringBuilder s =  new StringBuilder("hell");
        biConsumer.accept(s, 5);
        System.out.println(s);
    }

    public static class Book {
        private String name;
        public String toString() {
            return name;
        }
    }
}
