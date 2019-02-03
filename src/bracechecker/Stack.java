package bracechecker;

public class Stack {
    public static final int DEFAULD_CAPACITY = 16;
    private int [] values;
    private int tos;

    public Stack() {
        this(DEFAULD_CAPACITY);
    }

    public Stack(int capacity) {
        values = new int[capacity];
        tos = -1;
    }

    public void push(int value) {
        if(tos == values.length -1){
            ensureCapacity();
        }
        values[++tos] = value;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return values[tos--];
    }

    public boolean isEmpty(){
        return tos == -1;
    }

    private void ensureCapacity() {
        int [] newValues = new int[values.length * 3 / 2 + 1];

        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
    }


}
