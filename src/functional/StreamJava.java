package functional;


import chapter2.Predica;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by khaitq
 * Date: 16/01/2019
 * Github:  https://github.com/quangkhai88
 */

public class StreamJava {


    public static void main(String ...args) {


        Stream<String> in = Stream.generate(() -> "abd");

        Predicate<String> p = s -> Character.isDigit(s.charAt(0));

        Stream<String> fi = Stream.of("vl", "hehe", "123");


     //   fi.reduce((x,y) -> x ).ifPresent(System.out::println);

//        fi.filter( s -> {
//          System.out.println(s);
//          return  s.length() > 2;
//        }).forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("vcx");
        list.add("hxxgh");




        Stream<String> astream = list.stream();

        list.add("bvb");


//        astream.forEach(s -> {
//            s += "12";
//        });

        list.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList()).forEach(System.out::println);

//        list.forEach(System.out::println);

        System.out.println(list.stream().collect(Collectors.groupingBy(s -> new String(s.charAt(0) +""))));



        System.out.println(list.stream().collect(Collectors.groupingBy(s -> s.length())));


        Stream<String> str = Stream.iterate("-", s -> s + s);

        Consumer<Object> f = o -> System.out.println(o);

        Predicate<String> pre = s -> s.length() > 3;

        f.accept(str.noneMatch(pre));

        //f.accept(str.anyMatch(pre));

        f.accept(str);

        IntStream intStream = IntStream.of(1,2,3);

        intStream.limit(2).peek(System.out::println);

        Stream.iterate(1, s -> ++s).limit(5).forEach(System.out::println);

        BiFunction<String, String, String> cv = (s,t) -> s + s;


        BinaryOperator<Integer> xcc = (t,v)-> t + 1;

        List<Integer> l = IntStream.range(1, 6).mapToObj(i -> i).collect(Collectors.toList());

    }




}
