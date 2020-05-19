package Basic_programming_Model.Bags_Aueues_stacks;

import Standard.StdIn;

import java.util.Iterator;

public class Test_FixedCapacityStack {
    public static void main(String[] args) {
//        System.out.println((1+((2+3)*(4*5))));
//        FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);
//        while (!StdIn.isEmpty()){
//            String item = StdIn.readString();
//
//            if(!item.equals('-')){
//                s.push(item);
//            }else if (!s.isEmpty()){
//                System.out.println(s.pop());
//            }
//        }
//
//        System.out.println(s.size()+" left on stack");


        Stake<String> stake = new Stake<>();
        stake.push("you");
        stake.push("are");
        stake.push("the");
        stake.push("world");

        Iterator<String> iterator = stake.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
