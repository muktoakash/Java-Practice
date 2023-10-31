public class MyConcreteList<E>
extends MyAbstractList<E>
implements MyList<E>
{
    private Object[] myList;

    public MyConcreteList()
    {
        myList = new Object[100];
    }

    public MyConcreteList(int size)
    {
        myList = new Object[size];
    }

    public void add(E element)
    {    
        myList[listSize] = element;
        listSize++;
    }

    public void remove(int index)
    {
        listSize--;
        for (int i = index; i < listSize; i++)
        {
            myList[i] = myList[i+1];
        }
    }

    public E get(int index)
    {
        return (E) myList[index];
    }
}