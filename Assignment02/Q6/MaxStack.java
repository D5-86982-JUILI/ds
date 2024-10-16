package sunbeam.Q6;

class MaxStack {
    private int maxSize;
    private int[] stackArray;
    private int[] maxArray;
    private int top;

   
    public MaxStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        maxArray = new int[maxSize];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full!");
            return;
        }
        stackArray[++top] = value;
        if (top == 0) {
            maxArray[top] = value;
        } else {
            maxArray[top] = Math.max(value, maxArray[top - 1]);
        }
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1; 
        }
        return stackArray[top--];
    }

    // Get max value
    public int getMax() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1; 
        }
        return maxArray[top];
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack(5);
        maxStack.push(10);
        maxStack.push(20);
        maxStack.push(15);
        maxStack.push(30);
        maxStack.push(5);

        System.out.println("Current max value in the stack: " + maxStack.getMax());
    }
}
