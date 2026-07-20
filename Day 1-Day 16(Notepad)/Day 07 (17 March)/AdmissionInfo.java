class Admission 
{
	static int admissionNumber;
	static String admissionBatch;
	static String admissionProcess;
	static int admissionFee;

	public static void main(String args[])
	{
		
		admissionNumber= 78;
		admissionBatch= "March";
		admissionProcess= "Successful";
		admissionFee= 30000;
		
		System.out.println("Hello Sayyed..! ");
		System.out.println("Your Admission Batch: "+admissionBatch+ " & the number is: " +admissionNumber);
		System.out.println("Also fees paid for the batch is: " +admissionFee);

	}
}