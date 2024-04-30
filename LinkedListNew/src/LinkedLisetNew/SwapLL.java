package LinkedLisetNew;

public class SwapLL {
public static Node<Integer> swapLL(Node<Integer> head,int i,int j){
	   Node<Integer> temp=head,prev=null,c1=null,c2=null,p1=null,p2=null;
       int pos=0;
       if(i==j){

           return head;

       }
       while(temp!=null)
       {
           if(pos==i)
           {
               p1=prev;
               c1=temp;
           }
else if(pos==j)
{
   p2=prev; 
   c2=temp;
}       
           prev=temp;
           temp=temp.next;
           pos++;
       }
       if(p1!=null)
       {
           p1.next=c2;
       }
       else{                   
           head=c2;
       }
       if(p2!=null){          
           p2.next=c1;
       }
       else{
           head=c1;
       }
       Node<Integer> temp1=c2.next;
       c2.next=c1.next;
       c1.next=temp1;
       return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
