package ed.dam;

// ed.dam.Stack.java
public class Stack {
    private int numberElements = 0;
    private int[] elements = new int[3];

    public int getNumberElements() {
        return numberElements;
    }

    public boolean isEmpty() {
        return this.numberElements == 0;
    }

    public void stacking(int element){
        this.elements[numberElements++] = element;
    }

    public int unstacking(){
        if (isEmpty()) {
            throw new UnderflowException();
        }
        this.numberElements--;
        return this.elements[this.numberElements];
    }

    public class UnderflowException extends RuntimeException{

    }
}