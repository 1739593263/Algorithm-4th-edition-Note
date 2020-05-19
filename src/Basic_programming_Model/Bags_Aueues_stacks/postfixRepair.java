package Basic_programming_Model.Bags_Aueues_stacks;

import java.util.Iterator;

public class postfixRepair {

    private Stake<Character> operators;
    private Stake<String> operands;
    private int N;

    public void repair(String s){
        char[] chars = s.toCharArray();
        operators = new Stake<>();
        operands = new Stake<>();

        int num=0;

        for(int i=0;i<chars.length;i++){
            switch(chars[i]){
                // operator
                case '+':
                case '/':
                case '-':
                case '*':
                    operators.push(chars[i]); break;

                // operands
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    operands.push(chars[i]+""); break;

                // )
                case ')':
                    char a = operators.pop();
                    String b = operands.pop();
                    String c = operands.pop();
                    String op = '('+c+a+b+')';

                    operands.push(op);
                    break;

                case  ' ':
                    break;
            }
        }

        System.out.println(operands.pop());
    }
}
