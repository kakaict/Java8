package generic;

import java.util.*;

/**
 * Created by khaitq
 * Date: 30/12/2018
 * Github:  https://github.com/quangkhai88
 */

public class Main {


    public static  void main(String ...args) {


//        List<? extends A> list1 = new ArrayList<>();
//
//
//        List<? super C> list2   = new ArrayList<C>();
//
//
        List<A> list3 = new ArrayList<A>();
//        list3.add(new B());
//
//        println2(list3);

        ArrayDeque<String> greetings = new ArrayDeque<String>();

        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.add("vv");

        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null) {
            System.out.println(greetings.pop());
        }

        new D<String>("vv");
        D d = new D("vv");

        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(90));
        numbers.add(null);
        numbers.add(311L);

        Iterator i = numbers.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        ArrayDeque<?> list = new ArrayDeque<String>();

        TreeSet<A> t2 = new TreeSet(new B());


        Comparator<Integer> c = (o1, o2) -> o2 - o1;
        List<Integer> listx = Arrays.asList(5, 4, 7, 1);
        Collections.sort(listx, c);
        System.out.println(Collections.binarySearch(listx, 3));


    }

    public static void showSize(List<?> list) {
        System.out.println(list.size());

    }

    public static void println(List<? extends  A> list) {
        for (A a : list) {
            a.test();
        }
    }

    public static void println2(List<? super  C> list) {

    }

}

class D<T> {
    private T t;
    public D(T t) {
        this.t = t;
    }

    public D(){
    }
}

class A {
    public void test() {
    }
}

class B extends  A  implements  Comparator<B>{
    @Override
    public int compare(B o1, B o2) {
        return 0;
    }
}

class C extends  B {}