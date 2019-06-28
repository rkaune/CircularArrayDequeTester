package jsjf;

/**
 * DequeADT defines the interface to a deque collection.
 *
 * @author rkaune
 * @version 4.0
 */
public interface DequeADT<T>
{
	/**  
	 * Adds one element to the rear of this deque. 
	 * @param element  the element to be added to the rear of the deque  
	 */
	public void enqueueRear(T element);
        
        /**  
	 * Adds one element to the front of this deque. 
	 * @param element  the element to be added to the front of the deque  
	 */
	public void enqueueFront(T element);

	/**  
	 * Removes and returns the element at the front of this deque.
	 * @return the element at the front of the deque
	 */
	public T dequeueFront();
        
        /**  
	 * Removes and returns the element at the rear of this deque.
	 * @return the element at the rear of the deque
	 */
	public T dequeueRear();

	/**  
	 * Returns without removing the element at the front of this deque.
	 * @return the first element in the deque
	 */
	public T first();
        
        /**  
	 * Returns without removing the element at the rear of this deque.
	 * @return the last element in the deque
	 */
	public T last();

	/**  
	 * Returns true if this deque contains no elements.
	 * @return true if this deque is empty
	 */
	public boolean isEmpty();

	/**  
	 * Returns the number of elements in this deque. 
	 * @return the integer representation of the size of the deque
	 */
	public int size();

	/**  
	 * Returns a string representation of this deque. 
	 * @return the string representation of the deque
	 */
	public String toString();
}
