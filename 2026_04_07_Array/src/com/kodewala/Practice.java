package com.kodewala;


class PracticeArray
{
	void getDetails()
	{
	
		String[] students = new String[7];
		students[0] ="Shakir";
		students[1] ="Faisal";
		students[2] ="Zahur";
		students[3] ="Akram";
		students[4] ="Nasir";
		students[5] ="Kaleem";
		students[6] ="Ajmal";
		

		students[0] = "Sayyed";//Reassigning the data
		System.out.println(students[0]);
		System.out.println(students.length);
		
		for (int i = 0; i < students.length; i++)
		{
			System.out.println("Students["+i+"] = "+students[i]);
		}
		
		for (int i = 0; i < students.length; i++)
		{
			
			String currentElement = students[i];
			
			if(currentElement.startsWith("A"))
			{
				
				System.out.println("\n"+currentElement);
			}
		}
		
		for (int i = students.length -1; i >= 0; i--)
		{
			System.out.println("Students["+i+"}]= "+students[i]);
		}
	}
	
	
}

class Practice
{

	public static void main(String[] args)
	{
		PracticeArray practiceArray = new PracticeArray();
		practiceArray.getDetails();

	}

}

