class JavaModifierPrivate
{
 
	private int a =10;


}

class JavaModifierPrivateAcess
{
	public void nameAccess()
	{
	JavaModifierPrivate j=new JavaModifierPrivate();
	System.out.println(j.a);
	}
}