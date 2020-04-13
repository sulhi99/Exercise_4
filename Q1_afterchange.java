class QuestionOne 
{
	private int count;
	
	public void Question_4()
     {  	
       count = 1;
     }
	public void increment()
    {
		count = count + 1;
 	 }
    
	public int getCount()
    {
		return count;
	 }
}

public class Q1_afterchange
{
	public static void main (String []arg)
   {
   	QuestionOne q1;
   	q1 = new QuestionOne();
      q1.Question_4(); 
      q1.increment();
   	q1.increment();
   	System.out.println(q1.getCount());
	}
}