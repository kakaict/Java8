package oca;

import java.io.IOException;

/**
 * Created by khaitq
 * Date: 24/11/2018
 * Github:  https://github.com/quangkhai88
 */

public class ExceptionTest {


    public static void main(String... args) {

//        question1();
        

        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
        } finally {
            System.out.print("e");
            throw new RuntimeException("3");
        }
    }


    public static void question1() {
        try {
            System.out.print("Starting up ");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("Problem ");
            System.exit(0);
        } finally {
            System.out.print("Shutting down ");
        }
    }

    public static void getExeption() throws IOException {
        throw new IllegalArgumentException();
        //   return new Exception();
    }

    public static void getExeptionX() throws IndexOutOfBoundsException {
        throw new RuntimeException();
    }

    public static Exception getExeption2() throws Error {
        return new Exception();
    }

    public static void getExeptionXC() {
        try {
            throw new IOException();
        } catch (IOException e) {

        }
    }

    public static void xxx() {

        try {


        } catch (IllegalArgumentException e) {

        } catch (RuntimeException e) {

        } catch (StackOverflowError e) {

        } catch (VirtualMachineError e) {

        }
    }

    interface Roar {
        void roar() throws Exception;
    }

    class X implements Roar {

        @Override
        public void roar() throws NullPointerException {

        }
    }

}

