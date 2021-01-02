package org.kodluyoruz;

import java.util.Stack;

public class ThreadSafeStack<T> {
    static Stack stack;

    public ThreadSafeStack(){
        stack = new Stack<T>();
    }
    
    synchronized T getValue(){
        System.out.println("Returned value: " + stack.peek().toString());
        return (T) stack.pop();
    } 
    
    synchronized void setStack(T item){
        System.out.println("Inserted value: " + item.toString());
        stack.push(item);
    }
}
