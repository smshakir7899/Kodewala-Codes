class DataTypes1
{
	static String languageName; //String is Non Primitive Data Type
	static byte version; 
	static int numberOfClasses;
	static double completeVersion;
	static boolean compeatibleWithWindows;

	public static void main(String args[])
	{
		languageName="Java";
		version=25;
		numberOfClasses=1234567;
		completeVersion=25.2;
		compeatibleWithWindows=true;
		
		System.out.println("Language Name:\t"+languageName+"\t\nVersion:\t"+version+"\nTotal Classes:\t"+numberOfClasses+"\nEasy to Understand language:\t"+compeatibleWithWindows);

	}
 
}