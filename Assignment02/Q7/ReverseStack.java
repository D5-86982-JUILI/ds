package sunbeam.Q7;
public class ReverseStack {
    
    
    static class Stack {
        private int Size;
        private int[] arr;
        private int top;

        public Stack(int size) {
            this.Size = size;
            this.arr = new int[Size];
            this.top = -1;
        }

        public void push(int value) {
            if (top == Size - 1) {
                System.out.println("Stack is full!");
                return;
            }
            arr[++top] = value;
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Stack is empty!");
                return -1; 
            }
            return arr[top--];
        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }

    
    public static void reverseArray(int[] arr) {
        Stack stack = new Stack(arr.length);

        
        for (int value : arr) {
            stack.push(value);
        }

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        
        reverseArray(arr);

        System.out.println("\nReversed array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
