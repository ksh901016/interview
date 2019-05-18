package 디자인패턴;

import java.util.LinkedList;

public class Stack {
    private final LinkedList<Integer> stack;

    public Stack(){
        this.stack = new LinkedList<>();
    }

    public Stack(final LinkedList<Integer> initialState){
        this.stack = initialState;
    }

    public void push(final Integer number){
        stack.add(0, number);
    }

    public Integer pop(){
        return stack.remove(0);
    }
    public Stack filter(final StackPredicate filter){

        final LinkedList<Integer> initialState = new LinkedList<>();
        for(Integer e : stack){
            if(filter.isValid(e)){
                initialState.add(e);
            }
        }
        return new Stack(initialState);
    }
}
