/**
  Mohammed Raza
  CSC 162 - Lab4 #3 (class4)
*/

public class PassFailActivity extends GradedActivity
{
   private double minPassingScore;


   public PassFailActivity(double mps)
   {
      minPassingScore = mps;
   }


   public char getGrade()
   {
      char letterGrade;

      if (super.getScore() >= minPassingScore)
         letterGrade = 'P';
      else
         letterGrade = 'F';

      return letterGrade;
   }
}