package Basic_programming_Model.Bags_Aueues_stacks;

import B_Q_S.Stack;
import Standard.StdIn;
import Standard.StdOut;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> operators = new Stack<String>();
        Stack<Double> operands = new Stack<Double>();

        // Test type
//        String ss = StdIn.readString();
//        char[] sc = ss.toCharArray();
//        for(char c : sc){
//            String s = c+"";
//            if (s.equals("("));
//            else if (s.equals("*")) operators.push(s);
//            else if (s.equals("/")) operators.push(s);
//            else if (s.equals("-")) operators.push(s);
//            else if (s.equals("+")) operators.push(s);
//            else if (s.equals("sqrt")) operators.push(s);
//            else if (s.equals(")")) {
//                String o = operators.pop();
//                Double v = operands.pop();
//                if(o.equals("+")) v=operands.pop()+v;
//                else if(o.equals("-")) v=operands.pop()-v;
//                else if(o.equals("*")) v=operands.pop()*v;
//                else if(o.equals("/")) v=operands.pop()/v;
//                else if(o.equals("sqrt")) v=Math.sqrt(v);
//                operands.push(v);
//            }
//            else operands.push(Double.parseDouble(s));
//        }

        // real calculation of java system
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            if (s.equals("("));
            else if (s.equals("*")) operators.push(s);
            else if (s.equals("/")) operators.push(s);
            else if (s.equals("-")) operators.push(s);
            else if (s.equals("+")) operators.push(s);
            else if (s.equals("sqrt")) operators.push(s);
            else if (s.equals(")")) {
                String o = operators.pop();
                Double v = operands.pop();
                if(o.equals("+")) v=operands.pop()+v;
                else if(o.equals("-")) v=operands.pop()-v;
                else if(o.equals("*")) v=operands.pop()*v;
                else if(o.equals("/")) v=operands.pop()/v;
                else if(o.equals("sqrt")) v=Math.sqrt(v);
                operands.push(v);
            }
            else operands.push(Double.parseDouble(s));
        }

        StdOut.println(operands.pop());
    }
}
