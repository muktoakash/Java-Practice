public interface MyList<E>
{
    /**
     *  The MyList interface defines the list methods we'll use.
     */

    /**
     *  The add method will add an item to the end of the list.
     */
    public void add(E element);

    /**
     *  The remove method will remove the item at the specified
     *  location in the list, moving the following items one position to
     *  the left.
     *
     *  @param index  the location at which to remove the element
     */
    public void remove(int index);

    /**
     *  The get method will return the item at the specified
     *  location in the list.
     *
     *  @param index  the location of the element to return
     */
    public E get(int index);

    /**
     *  The size method will return the size of the list
     */
    public int size();

    /**
     *  The toString method will return a string containing the contents
     *  of the list.
     */
    public String toString();
}