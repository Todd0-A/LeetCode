import java.util.Stack;

public class ValidateStackSequences {
    /*
    https://leetcode.com/problems/validate-stack-sequences/
     */
    public static void main(String[] args) {
        int[] push={1,2,3,4,5};
        int[] pop={4,5,3,2,1};
        System.out.println(validateStackSequences(push,pop));
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        stack.push(pushed[0]);
        int indexPush=1;
        int indexPop=0;
        while(true){
            if(indexPop==popped.length){
                return true;
            }
            if(!stack.empty()&&stack.peek()==popped[indexPop]){
                stack.pop();
                indexPop++;
            }else{
                if(indexPush<pushed.length){
                    stack.push(pushed[indexPush]);
                    indexPush++;
                }
            }

            if(indexPush==popped.length){
                while(!stack.empty()){
                    if(stack.pop()!=popped[indexPop])
                        return false;
                    indexPop++;
                }
            }
        }
    }
}
