package Basic_programming_Model.Bags_Aueues_stacks;

import Standard.StdOut;

import java.util.Iterator;

public class Exercise39_RingBuffer<Item> {
    private int size;
    private int last;
    private int first;
    private Item[] ringBuffer;
    private Queue<Item> savedTobeProduce;
    private int countedTobeConsume;

    public Exercise39_RingBuffer(int capacity){
        ringBuffer = (Item[]) new Object[capacity];
        size=0;
        last=-1;
        first=-1;

        savedTobeProduce = new Queue<>();
        countedTobeConsume = 0;
    }

    public boolean isEmpty() {return size==0;}

    public int size() {return size;}

    public void produce(Item item){
        if(countedTobeConsume!=0){
            consumeData(item);
            countedTobeConsume--;
        } else{
          if(isEmpty()){
              first=0;
              last=0;
              ringBuffer[size]=item;
              size++;
          }
          else if(size<ringBuffer.length){
              if (last==ringBuffer.length-1) last=0; // wrap round
              else last++;

              ringBuffer[last]=item;
              size++;
          }
          else {
              savedTobeProduce.enqueue(item);
          }
        }
    }

    public void consumeData(Item item){
        StdOut.println(item+" stillness");
    }

    public Item consume(){
        if (isEmpty()){
            countedTobeConsume++;
            return null;
        }

        Item item = ringBuffer[first];
        ringBuffer[first] = null;

        if(first==ringBuffer.length-1) first=0; // wrap round
        else first++;
        size--;
        if(!savedTobeProduce.isEmpty()) produce(savedTobeProduce.dequeue());

        return item;
    }

    public Iterator<Item> iterator(){return new RingBufferIterator();}

    public class RingBufferIterator implements Iterator<Item>{

        private int count=0;
        private int current=first;

        @Override
        public boolean hasNext() {
            return count<size;
        }

        @Override
        public Item next() {
            Item item = ringBuffer[current];
            if(current == ringBuffer.length-1){
                current=0;
            }else current++;
            count++;
            return item;
        }
    }

    public static void main(String[] args) {
        Exercise39_RingBuffer<Integer> ringBuffer = new Exercise39_RingBuffer<>(4);
        ringBuffer.produce(0);
//        ringBuffer.produce(1);
//        ringBuffer.produce(2);
//        ringBuffer.produce(3);
//        ringBuffer.produce(4);
//        ringBuffer.produce(5);

        System.out.println("item1="+ringBuffer.consume());
        System.out.println("item2="+ringBuffer.consume());
        ringBuffer.produce(6);
        ringBuffer.produce(7);
        System.out.println("item3="+ringBuffer.consume());
    }
}
