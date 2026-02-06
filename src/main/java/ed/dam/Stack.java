package ed.dam;

// ed.dam.Stack.java
public class Stack {
    private int numberElements;
    private int limit;
    private int[] elements;

    public Stack() {
        this.numberElements = 0;
        this.limit = 2;
        this.elements = new int[limit];
    }

    public void setLimit(int limit) {
        this.limit = limit;
        int[] aux = new int[limit];
        for (int i = 0; i < this.elements.length; i++) {
            aux[i] = this.elements[i];
        }
        this.elements = aux;
    }

    public int getNumberElements() {
        return numberElements;
    }

    public boolean isEmpty() {
        return this.numberElements == 0;
    }

    public void stacking(int element){
        if ((numberElements+1) > limit){
            throw new OverflowExcepcion();
        }
        this.elements[numberElements] = element;
        this.numberElements++;
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

    public class OverflowExcepcion extends RuntimeException{
    }
}