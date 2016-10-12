/**
  Mohammed Raza
  CSC 162 - Lab4 #3 (class2)
*/

public class Essay extends GradedActivity
{
   private int grammar;
   private int spelling;
   private int length;
   private int content;

   public Essay()
      {   super();
      	  grammar = 0;
      	  spelling = 0;
      	  length = 0;
      	  content = 0;
   	  }

  public Essay(int g, int sp, int l, int c)
     {

  	  grammar = g;
	  spelling = sp;
	  length = l;
      content = c;
   }


   public void setScore(double s)
   {
      score = s;

   }

   private void setGrammar(int g)
   {

      if (grammar < 0 || grammar > 30)
      System.out.println("Invalid Grammar Score");
      grammar = g;
   }

   private void setSpelling(int sp)
   {

      if (spelling < 0 || spelling > 20)
      System.out.println("Invalid Spelling Score");
      spelling = sp;
   }

   private void setCorrectLength(int l)
   {

      if (length < 0 || length > 20)
      System.out.println("Invalid Length Score");
      length = l;
   }

   private void setContent(int c)
   {

      if (content < 0 || content > 30)
      System.out.println("Invalid Content Score");
      content = c;
   }


   public int getGrammar()
   {
      return grammar;
   }

   public int getSpelling()
   {
      return spelling;
   }

   public int getCorrectLength()
   {
      return length;
   }

   public int getContent()
   {
      return content;
   }

   public double getScore()
   {
	  score = (grammar + spelling + length + content);
      return score;
   }



}