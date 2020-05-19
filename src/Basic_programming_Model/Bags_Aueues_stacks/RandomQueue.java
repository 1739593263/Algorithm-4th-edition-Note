package Basic_programming_Model.Bags_Aueues_stacks;

import Standard.StdRandom;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class RandomQueue<Item> {
    private int N;
    private Node first;
    private Node last;

    public class Node{
        Node next;
        Item item;
    }

    public boolean isEmpty(){return first==null;}

    public int size(){return N;}

    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first = last;
        else oldlast.next = last;
        N++;
    }

    public Item dequeue(){
        int r = StdRandom.uniform(0, N);
        Node nr = first;
        Item oldFirst = first.item;
        for(int i=0;i<r;i++){
            nr = nr.next;
        }
        first.item = nr.item;
        nr.item = oldFirst;
        Node newFirst = first;
        first = first.next;
        if(isEmpty()) first = last;
        N--;
        return newFirst.item;
    }


    public Iterator<Item> iterator(){
        return new RandomIterator();
    }

    public class RandomIterator implements Iterator<Item> {

        @Override
        public boolean hasNext() {
            return N!=0;
        }

        @Override
        public Item next() {
            return dequeue();
        }
    }
}
