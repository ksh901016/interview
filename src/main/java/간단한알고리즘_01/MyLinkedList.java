package 간단한알고리즘_01;

public class MyLinkedList<T> {
    private T element;
    private MyLinkedList<T> next;

    public MyLinkedList(T element, MyLinkedList<T> next) {
        this.element = element;
        this.next = next;
    }

    public T getElement(){
        return element;
    }

    public MyLinkedList<T> getNext(){
        return next;
    }

    public static <T> MyLinkedList<T> reverse(final MyLinkedList<T> original){
        if(original == null){
            throw new NullPointerException("Cannot reverse a null list.");
        }

        if(original.next == null){
            return original;
        }

        MyLinkedList<T> next = original.next;
        final MyLinkedList<T> otherReversed = reverse(next);
        next.next = original;

        return otherReversed;
    }

    public static <T> MyLinkedList<T> reverse2(final MyLinkedList<T> original){
        return null;
    }
}
