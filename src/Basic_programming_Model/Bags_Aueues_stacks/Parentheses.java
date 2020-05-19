package Basic_programming_Model.Bags_Aueues_stacks;

import Standard.StdIn;

import java.util.Iterator;

public class Parentheses {

    private Stake<Character> stake;
    private int N;

    public boolean checkStake(String s){
        char[] chars = s.toCharArray();
        Stake<Character> stake = new Stake<>();
        if(chars[0]==']'||chars[0]=='}'||chars[0]==')') return false;

        for(int i=0;i<chars.length;i++){
            if(chars[i]=='{') stake.push(chars[i]);
            else if(chars[i]=='(') stake.push(chars[i]);
            else if(chars[i]=='[') stake.push(chars[i]);
            else if(chars[i]=='}') {
                if(stake.pop()=='{'){}
                else return false;
            }
            else if(chars[i]==']') {
                if(stake.pop()=='['){}
                else return false;
            }
            else if(chars[i]==')') {
                if(stake.pop()=='('){}
                else return false;
            }
            else return false;
        }
        if(stake.isEmpty()) return true;
        else return false;
    }

}
