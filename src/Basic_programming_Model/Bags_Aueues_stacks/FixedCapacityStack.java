package Basic_programming_Model.Bags_Aueues_stacks;

public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap){
        // new Item[] is illegal, because Java not support "generic array creation"
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty(){return N==0;}

    public boolean isFull(){return N==a.length;}

    public int size(){return N;}

    // aim to change the length of a[];
    public void resize(int max){
        Item[] temp = (Item[])new Object[max];
        for(int i=0;i<N;i++){
            temp[i]=a[i];
        }
        a=temp;
    }

    public Item pop(){
        Item item = a[--N];
        a[N] = null;
        if(N>0 && a.length/4 == N) resize(a.length/2);
        return item;
    }

    public void push(Item item){
        if(N==a.length) resize(a.length*2);
        a[N++]=item;
    }
}
