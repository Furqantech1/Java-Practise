class Stack{
    int [] stk = new int[4];
    int top;
    Stack(){
        top =-1;
    }
    void push(int item){
        if(top==stk.length-1){
            System.out.println("Stack overflow");
        }else{
            stk[++top]=item;
            System.out.println("Pushed element is :"+stk[top]);
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack unerflow");
            return 0;
        }else{
            return stk[top--];
        }
    }
}

public class StackOperation {
    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        System.out.println("poped element:"+sc.pop());
    }
}
