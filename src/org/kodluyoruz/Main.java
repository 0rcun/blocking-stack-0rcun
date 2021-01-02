package org.kodluyoruz;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ThreadSafeStack stack = new ThreadSafeStack();

        Runnable insertThread1 = () -> {
            stack.setStack(1);
        };
        Runnable insertThread2 = () -> {
            stack.setStack(2);
        };
        Runnable insertThread3 = () -> {
            stack.setStack(3);

        };
        Runnable insertThread4 = () -> {
            stack.setStack(4);

        };
        Runnable insertThread5 = () -> {
            stack.setStack(5);
        };
        Runnable insertThread6 = () -> {
            stack.setStack("deneme1");
        };
        Runnable insertThread7 = () -> {
            stack.setStack("deneme2");
        };
        Runnable insertThread8 = () -> {
            stack.setStack("deneme3");
        };
        Runnable popThread1 = () -> {
            stack.getValue().toString();
        };
        Runnable popThread2 = () -> {
            stack.getValue().toString();
        };
        Runnable popThread3 = () -> {
            stack.getValue().toString();
        };
        Runnable popThread4 = () -> {
            stack.getValue().toString();
        };
        Runnable popThread5 = () -> {
            stack.getValue().toString();
        };
        Runnable popThread6 = () -> {
            stack.getValue().toString();
        };
        Runnable popThread7 = () -> {
            stack.getValue().toString();
        };
        Runnable popThread8 = () -> {
            stack.getValue().toString();
        };
        Runnable popThread9 = () -> {
            stack.getValue().toString();
        };


        try {
            new Thread(insertThread1).start();
            new Thread(insertThread2).start();
            new Thread(insertThread3).start();
            new Thread(insertThread4).start();
            new Thread(insertThread5).start();
            new Thread(insertThread6).start();
            new Thread(insertThread7).start();
            new Thread(insertThread8).start();
            new Thread(popThread1).start();
            new Thread(popThread2).start();
            new Thread(popThread3).start();
            new Thread(popThread4).start();
            new Thread(popThread5).start();
            new Thread(popThread6).start();
            new Thread(popThread7).start();
            new Thread(popThread8).start();
        } catch (EmptyStackException e){
            System.out.println("Error: "+e.getMessage());
        }







    }
}
