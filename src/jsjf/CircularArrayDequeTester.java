/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

/**
 *
 * @author rkaune
 */
public class CircularArrayDequeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // instantiate object from CircularArrayDeque class
        CircularArrayDeque<Integer> circularArrayDeque = new CircularArrayDeque<Integer>();
        
        // test each method to add at front and rear positions
        circularArrayDeque.enqueueRear(25);
        circularArrayDeque.enqueueRear(15);
        circularArrayDeque.enqueueRear(30);
        circularArrayDeque.enqueueRear(10);
        
        circularArrayDeque.enqueueFront(35);
        circularArrayDeque.enqueueFront(20);
        
        System.out.print("The deque is empty.(T/F): ");
        System.out.println(circularArrayDeque.isEmpty());
        
        System.out.print("The size of the deque: ");
        System.out.println(circularArrayDeque.size());
        
        System.out.println("The elements in the deque are: ");
        System.out.println(circularArrayDeque.toString());
        
        System.out.print("The element at the front of the deque: ");
        System.out.println(circularArrayDeque.first());
        
        System.out.print("The element at the rear of the deque: ");
        System.out.println(circularArrayDeque.last());
        
        System.out.println("The elements in the deque are:");
        System.out.println(circularArrayDeque.toString());
        
        System.out.print("The removed element at the front of the deque: ");
        System.out.println(circularArrayDeque.dequeueFront());
        
        System.out.print("The removed element at the rear of the deque: ");
        System.out.println(circularArrayDeque.dequeueRear());
        
        System.out.println("The elements in the deque are:");
        System.out.println(circularArrayDeque.toString());
        
        
    }
    
}
