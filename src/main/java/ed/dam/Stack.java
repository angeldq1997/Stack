package ed.dam;

// ed.dam.Stack.java
public class Stack {
    private int numberElements = 0;
    private int element = -1;

    public boolean isEmpty() {
        return this.numberElements == 0;
    }

    public void stacking(int element){
        this.numberElements++;
        this.element = element;
    }

    public int unstacking(){
        if (isEmpty()) {
            throw new UnderflowException();
        }
        this.numberElements--;
        return element;
    }

    public class UnderflowException extends RuntimeException{

    }
}