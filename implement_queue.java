class MyQueue
{
    QueueNode front, rear;
   
   
   MyQueue(){
    front=null;
    rear=null;
   }
    
     public boolean isEmpty(){
        return (front==null && rear==null);
    }
    
    //Function to push an element into the queue.
void push(int a)
{
       QueueNode  newnode=new QueueNode (a);
 
       if(front==null){
           front=rear=newnode;
           return;
       }
       rear.next=newnode;
       rear=newnode;
}
 
    //Function to pop front element from the queue.
int pop()
{
         if(isEmpty()){
            return -1;
        }
        int val=front.data;
        if(front==rear){
            front=rear=null;
        }
        else{
            front=front.next;
        }
        return val;
}
}