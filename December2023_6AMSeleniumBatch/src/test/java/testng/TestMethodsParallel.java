package testng;

import org.testng.annotations.Test;

public class TestMethodsParallel 
{
	
  @Test
  public void test1() 
  {
	  System.out.println("i am test1 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("i am test2 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("i am test3 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test4() 
  {
	  System.out.println("i am test4 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test5() 
  {
	  System.out.println("i am test5 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test6() 
  {
	  System.out.println("i am test6 : "+ Thread.currentThread().getId());
  }
}
