interface Add{
	void Sum(int a, int b);
}

public class Addition{
	public static void main(String[] args){
	
	Add obj =(int a, int b) ->
	{
		System.out.println(a+b);
	};
	
	obj.Sum(20,122);
	}
}
		