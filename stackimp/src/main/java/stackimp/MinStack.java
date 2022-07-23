package stackimp;

import java.util.EmptyStackException;

public class MinStack implements MinStackInterface {
	
	private static Node top;
	private  int size;
	
	public MinStack(Node top)
	{
		super();
		this.top = null;
	}
	
	public MinStack() 
	{
		
	}
	
	public void push(int data)
	{
	   Node newNode = new Node();
	   newNode.setData(data);
	   newNode.setNext(top);
	   top = newNode;  
	   size++;
	}
	
	public int top()
	{
		if(top==null)
		{
		   throw new EmptyStackException();
		}
		
			return (top.getData());
	}
    
	/*
	 * public void pop() { if(top==null) { throw new EmptyStackException(); } else {
	 * top = top.getNext(); size--; } }
	 */
    
    public int pop()
    {
    	if(top==null)
    	{
    		throw new EmptyStackException();
    	}
    	else
    	{
    		top = top.getNext();
    		size--;
    	}
    	return size;
    }
    
	public void display() 
	{
		Node node = top;
		while(node!=null)
		{
			System.out.print(node.getData()+" ");
			node = node.getNext();
		}
	}
	
	
      public int size()
      {
    	  return size;
      }
      
      
      public int getMin() {
    	  
    	  if(top==null) {
    	   throw new EmptyStackException();
    	  }
    	  else {
    	   int min = top.getData();
    	   Node tempNode = top;
    	   while(tempNode!=null) {
    	    if(tempNode.getData()<min) {
    	     min = tempNode.getData();
    	    }
    	    tempNode = tempNode.getNext();
    	   }
    	   return min;
    	  }
    	 }
      
      
	 
}
