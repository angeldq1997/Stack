package ed.dam;

// ed.dam.Stack.java
public class Stack {
    private int numberElements = 0;

    public boolean isEmpty() {
        return numberElements == 0;
    }

    public void stacking(int element){
        numberElements++;
    }

    public void unstacking(){
        if (isEmpty()) {
            throw new UnderflowException();
        }
        numberElements--;
    }

    public class UnderflowException extends RuntimeException{

    }
}