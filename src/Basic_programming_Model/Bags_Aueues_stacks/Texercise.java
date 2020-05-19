package Basic_programming_Model.Bags_Aueues_stacks;

import Standard.StdIn;

import java.util.Iterator;

public class Texercise {
    public static void main(String[] args) {
        String s = StdIn.readString();

//        Parentheses p = new Parentheses();
//        boolean b = p.checkStake(s);
//        System.out.println("boolean="+b);

        postfixRepair pp = new postfixRepair();
        pp.repair(s);

//        RandomQueue<String> randomQueue = new RandomQueue<>();
//        randomQueue.enqueue("you");
//        randomQueue.enqueue("are");
//        randomQueue.enqueue("good");
//        randomQueue.enqueue("dude");
//        randomQueue.enqueue("...");
//        Iterator<String> iterator = randomQueue.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }

    }
}
