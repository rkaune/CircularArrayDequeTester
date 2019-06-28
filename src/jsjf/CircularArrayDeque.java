package jsjf;

import jsjf.exceptions.*;

/**
 * CircularArrayDeque represents an array implementation of a queue in 
 which the indexes for the front and rear of the deque circle back to 0
 when they reach the end of the array.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class CircularArrayDeque<T> implements DequeADT<T>
{
	private final static int DEFAULT_CAPACITY = 5;
	private int front, rear, count;
	private T[] deque; 

	/**
	 * Creates an empty deque using the specified capacity.
	 * @param initialCapacity the initial size of the circular array deque
	 */
	public CircularArrayDeque(int initialCapacity)
	{
		front = rear = count = 0;
		deque = (T[]) (new Object[initialCapacity]);
	}

	/**
	 * Creates an empty queue using the default capacity.
	 */
	public CircularArrayDeque()
	{
		this(DEFAULT_CAPACITY);
	}    

	/**
	 * Adds the specified element to the rear of this deque, expanding
	 * the capacity of the deque array if necessary.
	 * @param element the element to add to the rear of the deque
	 */
	public void enqueueRear(T element)
	{
		if (size() == deque.length) 
                    expandCapacity();

		deque[rear] = element;
		rear = (rear + 1) % deque.length;

		count++;
	}

        /**
	 * Adds the specified element to the front of this deque, expanding
	 * the capacity of the deque array if necessary.
	 * @param element the element to add to the front of the deque
	 */
	public void enqueueFront(T element)
	{
		if (size() == deque.length) 
                    expandCapacity();
		
                if (front==0)
                    front = deque.length-1;
                else
                    front = (front - 1) % deque.length;

		deque[front] = element;
		
		count++;
	}
        
	/**
	 * Creates a new array to store the contents of this deque with
	 * twice the capacity of the old one.
	 */
	private void expandCapacity()
	{
		T[] larger = (T[]) (new Object[deque.length * 2]);

		for (int scan = 0; scan < count; scan++)
		{
			larger[scan] = deque[front];
			front = (front + 1) % deque.length;
		}

		front = 0;
		rear = count;
		deque = larger;
	}

	/**
	 * Removes the element at the front of this deque and returns a
	 * reference to it. 
	 * @return the element removed from the front of the deque
	 * @throws EmptyCollectionException  if the deque is empty
	 */
	public T dequeueFront() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("deque");

		T result = deque[front];
		deque[front] = null;
		front = (front + 1) % deque.length;
                
		count--;
                
		return result;
	}

        /**
	 * Removes the element at the rear of this deque and returns a
	 * reference to it. 
	 * @return the element removed from the rear of the deque
	 * @throws EmptyCollectionException  if the deque is empty
	 */
	public T dequeueRear() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("deque");

		T result = deque[rear -1];
		deque[rear -1] = null;
		front = (rear -1) % deque.length;
                
		count--;

		return result;
	}
        
	/** 
	 * Returns a reference to the element at the front of this deque.
	 * The element is not removed from the queue.  
	 * @return the first element in the queue
	 * @throws EmptyCollectionException if the deque is empty
	 */
	public T first() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("deque");
                
                T result = deque[front];
		return result;  
	}

        /** 
	 * Returns a reference to the element at the rear of this deque.
	 * The element is not removed from the queue.  
	 * @return the last element in the queue
	 * @throws EmptyCollectionException if the deque is empty
	 */
	public T last() throws EmptyCollectionException
	{
		if (isEmpty())
			throw new EmptyCollectionException("deque");
                
                T result = deque[rear-1];
               
		return result;  
	}
        
	/**
	 * Returns true if this deque is empty and false otherwise.
	 * @return true if this deque is empty 
	 */
	public boolean isEmpty()
	{
		return (count == 0);  
	}

	/**
	 * Returns the number of elements currently in this deque.
	 * @return the size of the deque
	 */
	public int size()
	{
		return count;  
	}

	/**
	 * Returns a string representation of this deque. 
	 * @return the string representation of the deque
	 */
	public String toString()
	{
		String dequeElements = "";
                
                
                for (int i = front,j=0; j<count;i=(i+1)% deque.length,j++)
                {
                    
                    if (deque[i]!=null) 
                        dequeElements = dequeElements + deque[i].toString()+ " ";
                    else if (deque[j]!=null)
                    {
                        //System.out.println("j is: " +j);
                        dequeElements = dequeElements + deque[j].toString()+ " ";
                    }
                }
		return dequeElements;  
	}
}
