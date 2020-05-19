package Basic_programming_Model.Bags_Aueues_stacks;

public class Queue<Item> {

    private Node last;
    private Node first;
    private int N;

    private class Node{
        Item item;
        Node next;
    }

    public int size(){ return N; }

    public boolean isEmpty(){ return first == null; }

    public void enqueue(Item item){
        Node oldQueue = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first = last;
        else  oldQueue.next = last;
        N++;
    }

    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if(isEmpty()) first = last;
        N--;
        return item;
    }
}
