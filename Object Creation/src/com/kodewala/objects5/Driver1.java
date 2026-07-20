package com.kodewala.objects5;

class Patient
{
	String patientName;
	String disease;
	int fees;
	String status;
	
	
	Patient(String patientName, String disease, int fees)
	{
		this(patientName, disease, fees, "ADMITTED");
	}
	
	Patient(String patientName, String disease, int fees, String status)
	{
		this.patientName = patientName;
		this.disease = disease;
		this.fees = fees;
		this.status = status;
	}
	
	
	void display()
	{
		System.out.println("Patient Name: "+patientName);
		System.out.println("Disease: "+disease );
		System.out.println("Fees: "+fees);
		System.out.println("Status: "+status);
	}
}

public class Driver1
{

	public static void main(String[] args)
	{

		Patient p1 = new Patient("Shakir", "Scaling", 1300);
		p1.display();

	}

}
