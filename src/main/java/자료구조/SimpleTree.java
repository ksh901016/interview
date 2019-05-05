package 자료구조;

public class SimpleTree<E extends Comparable> {
    private E value;
    private SimpleTree<E> left;  // 왼쪽 자식
    private SimpleTree<E> right; // 오른쪽 자식

    public SimpleTree(E value, SimpleTree<E> left, SimpleTree<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // 값 찾기
    public boolean search(final E toFind){
        if(toFind.equals(value)){
            return true;
        }

        if(toFind.compareTo(value) < 0 && left != null){
            return left.search(toFind);
        }

        return right != null && right.search(toFind);
    }

    // 삽입
    public void insert(final E toInsert){
        if(toInsert.compareTo(value) < 0){
            // 왼쪽
            if(left == null){
                left = new SimpleTree<>(toInsert, null, null);
            }else{
                left.insert(toInsert);
            }
        }else{
            // 오른쪽
            if(right == null){
                right = new SimpleTree<>(toInsert, null, null);
            }else{
                right.insert(toInsert);
            }
        }
    }

    public E getValue() {
        return value;
    }

    public SimpleTree<E> getLeft() {
        return left;
    }

    public SimpleTree<E> getRight() {
        return right;
    }
}
