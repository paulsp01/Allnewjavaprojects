package Queue;

public class QueueUsingArray {

    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){

        data= new int[5];
        front= -1;
        rear= -1;
    }

    public QueueUsingArray(int capacity){

        data= new int[capacity];
        front= -1;
        rear= -1;
    }

    public int size(){
      return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int elem) /*throws QueueFullException*/{
      if(size== data.length){
       // throw new QueueFullException();
    	  doubleCapacity();
      }
      if(size==0){
        front=0;
      }
//        rear++;
//        if(rear== data.length){
//            rear=0;
//        }
      rear=(rear+1)%data.length;
        data[rear]= elem;
        size++;
    }

    private void doubleCapacity() {
		// TODO Auto-generated method stub
    	int temp[]=data;
    	data=new int[2*temp.length];
		
	}

	public int front() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public int dequeue() throws QueueEmptyException{
      if(size == 0){
        throw new QueueEmptyException();
        }
        int temp = data[front];
        front=(front+1)%data.length;
        size--;
        if(size==0){
            front=-1;
            rear= -1;
        }
        return temp;
    }

}
