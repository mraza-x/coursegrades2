
/**
  Mohammed Raza
  CSC 162 - Lab4 #3 (class 6)
*/

public class CourseGrades extends GradedActivity implements Analyzable
{

   private final int NUM_GRADES	= 4;

   GradedActivity[] grades;

   public double labgrade;

   public double average;

   public GradedActivity highest;

   public GradedActivity lowest;


	public CourseGrades(double lg)
	  {
		  super();

		  grades = new GradedActivity[NUM_GRADES];

   	  }

	public void setLab(double lg)
	{
		labgrade = lg;
		grades[0] = new GradedActivity();
		grades[0].setScore(85.0);

		// *** Professor, this is not working ***
		// Trying to pass 85.0 to element 0 of
		// the array, should store value in setScore
		// method of GradedActivity class.

	}

	public GradedActivity getLab()
	{
		return grades[0];
	}


	public void setPassFailExam(int questions, int missed, double minPassing)
	{
		grades[1] = new PassFailExam(20,3,70);
	}

	public GradedActivity getPassFailExam()
	{
		return grades[1];
	}


	public void setEssay(int g, int sp, int l, int c)
	{
		grades[2] = new Essay(25,18,17,20);
	}

	public GradedActivity getEssay()
	{
		return grades[2];
	}


	public void setFinalExam(int questions, int missed)
	{
		grades[3] = new FinalExam(50,10);
	}

	public GradedActivity getFinalExam()
	{
		return grades[3];
	}


	// *** The compiler will not let me add
	// or compare array elements. It says +, <, and >
	// operators cannot be applied to GradedActivity.
	// Otherwise, this should work.


	public double getAverage()
	{
		average = ((grades[0] + grades[1] + grades[2] + grades[3]) / 4);
		return average;
	}


	public GradedActivity getHighest()
	{

		for (int i = 0; i <= 3; i++)
		{

			if (grades[0] > grades[i])
				{
					highest = grades[0];
					return highest;
				}

			else if (grades[1] > grades[i])
				{
					highest = grades[1];
					return highest;
				}

			else if (grades[2] > grades[i])
				{
					highest = grades[2];
					return highest;
				}

			else if (grades[3] > grades[i])
				{
					highest = grades[3];
					return highest;
				}
		}
	}


	public GradedActivity getLowest()
	{

		for (int i = 0; i <= 3; i++)
		{

			if (grades[0] < grades[i])
				{
					lowest = grades[0];
					return lowest;
				}

			else if (grades[1] < grades[i])
				{
					lowest = grades[1];
					return lowest;
				}

			else if (grades[2] < grades[i])
				{
					lowest = grades[2];
					return lowest;
				}

			else if (grades[3] < grades[i])
				{
					lowest = grades[3];
					return lowest;
				}
		}
	}

	public String toString()
	{
		String str = " ";
		return str;
	}






}