package ed.dam;

// ed.dam.Stack.java
public class Stack {
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public void stacking(int element){
        this.isEmpty = false;
    }

    public void unstacking(){
        if (isEmpty) {
            throw new UnderflowException();
        }
        isEmpty = true;
    }

    public class UnderflowException extends RuntimeException{

    }
}