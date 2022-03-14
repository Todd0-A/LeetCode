import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SimplifyPath {
    /*
    https://leetcode.com/problems/simplify-path/
     */
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] p = path.split("/");
        for (int i = 0; i < p.length; i++) {
            if (!stack.empty() && p[i].equals(".."))
                stack.pop();
            else if (!p[i].equals(".") && !p[i].equals("") && !p[i].equals(".."))
                stack.push(p[i]);
        }
        ArrayList<String> list = new ArrayList(stack);
        return "/"+String.join("/", list);
    }
}
