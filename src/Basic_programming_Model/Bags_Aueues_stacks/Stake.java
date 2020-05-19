package Basic_programming_Model.Bags_Aueues_stacks;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class Stake<Item> {
    private Node first; // record the top item of stake
    private int N; // record the size

    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){ return first==null; }

    public int size(){ return N; }



    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Iterator<Item> iterator(){
        return new ReverseIterator();
    }

    private class ReverseIterator implements Iterator<Item>{

        @Override
        public boolean hasNext() {
            return !isEmpty();
        }

        @Override
        public Item next() {
            return pop();
        }

        @Override
        public void remove() {

        }
    }
}
