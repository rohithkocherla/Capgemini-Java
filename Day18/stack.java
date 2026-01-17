import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        System.out.println(st.empty());
        st.push(10);
        st.push(14);
        st.push(16);
        st.push(12);
        st.push(13);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
System.out.println(st);
System.out.println(st.empty());
    }
    
}
