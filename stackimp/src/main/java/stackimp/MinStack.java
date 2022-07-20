package stackimp;

import java.util.EmptyStackException;

public class MinStack {
	
	private static Node top;
	private static int size;
	
	
	public MinStack(Node top) {
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
	   
	}
    
    public void pop()
    {
    	if(top==null)
    	{
    		throw new EmptyStackException();
    	}
    	else
    	{
    		top = top.getNext();
    	}
    	
    }

		

	public static void display() {
		Node node = top;
		
		while(node!=null)
		{
			System.out.print(node.getData()+" ");
			node = node.getNext();
		}

	}
	
     public static void main(String[] args) {
		
    	 MinStack stack = new MinStack();
    	 
			
			  stack.push(10); 
			  stack.push(20); 
			  stack.push(30);
			 
				 stack.display(); 
			
				  stack.pop(); 
				  stack.pop();
				 
    	 
			  stack.display();
    	 
    	
	}
	
}
