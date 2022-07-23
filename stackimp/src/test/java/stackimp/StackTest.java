package stackimp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.Test;


public class StackTest {
	MinStack stack = new MinStack();

	@Test
	public void when_StackHasElements_Expect_TopEleToBeRemovedForPop() 
	{
		stack.push(90);
		stack.push(100);
		stack.push(300);
		
		stack.pop();
		
		assertEquals(100,stack.top());
	    //assertEquals(2,stack.size());
	}
	@Test(expected = EmptyStackException.class)
	public void When_StackIsEmpty_Expect_StackEmptyExceptionForPop()
	{
		stack.pop();
	}

	@Test(expected = EmptyStackException.class)
	public void When_StackHasNoEle_Expect_EmptyExceptionForMinEle()
	{
		stack.push(10);
		stack.push(400);
		
		stack.pop();
		stack.pop();
		
		stack.getMin();
		
	}
	@Test
	public void When_StackHasElements_Expect_MinEleAsSmallestEle(){
		stack.push(50);
		stack.push(10);
		stack.push(30);
		stack.push(40);
		
		assertEquals(10,stack.getMin());	
	}
	@Test
	public void When_StackHasEle_Expect_LastElementAsTopElement() {
		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.pop();
		stack.pop();
		
		assertEquals(10, stack.top());
	}
	
	@Test  (expected = EmptyStackException.class)
	public void When_StackIsEmpty_Expect_StackEmptyExceptionForTopElement()
	{
		stack.top();
	}

	@Test
	public void When_StackHasEle_Expect_StackSizeIncreasedForPush()
	{
		stack.push(10);
		stack.push(30);
		stack.push(40);
		
		assertEquals(3,stack.size());
		
		
	}
	
	
	
}
