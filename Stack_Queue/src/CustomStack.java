public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    int ptr =-1;
    private boolean isFull(){
        return ptr == data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }
    //Default Constructor
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    //Parameterized constructor
    public CustomStack(int size){
        this.data = new int[size];
    }

    //Push Method
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
        };
        ptr++;
        data[ptr]=item;
        return true;
    }

    //Pop Method
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot Pop from an Empty Stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    //Peek Method
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot Peek from the Empty Stack");
        }
        return data[ptr];
    }

}
