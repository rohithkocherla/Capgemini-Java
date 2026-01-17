import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        String s="(){}[]";
        Stack<Character> st=new Stack<>();
        boolean isvalid=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            }else{
                if((!st.isEmpty())  &&  (st.peek()=='{'&&ch=='}' || (st.peek()=='['&&ch==']' || (st.peek()=='('&&ch==')')))){
                    st.pop();
                }
            
                else{
                    isvalid=false;
                }
            }
        }
        System.out.println(isvalid);

        
    }
}
