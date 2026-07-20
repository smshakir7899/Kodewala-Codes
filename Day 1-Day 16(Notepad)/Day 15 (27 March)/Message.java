class Message
{
	public static void main(String args[])
	{
		Message msg=new Message();
		int num= Integer.parseInt(args[0]);
		msg.displayMessage(num);
	}

	public void displayMessage(int num)
	{
		for(int x=1; x<num; x++)
		{
			System.out.println(x+": Welcome to Sayyed's House");
		}
	}

}