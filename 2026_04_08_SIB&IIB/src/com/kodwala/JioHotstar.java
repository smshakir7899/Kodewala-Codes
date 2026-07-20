package com.kodwala;

class User 
{
	public static int totalLiveUser = 0;
	
	private String mobile;
	
	public User(String mobile) {
		this.mobile = mobile;
	}
	
	{
		totalLiveUser = totalLiveUser + 1;
	}
}


public class JioHotstar
{

	public static void main(String[] args)
	{
		User u1 = new User("5664456346");
		User u2 = new User("8986754643");
		User u3 = new User("3242353445");
		User u4 = new User("4435436434");
		User u5 = new User("4445454534");
		User u6 = new User("9766866555");
		
		System.out.println("Total Live Viewers are: "+User.totalLiveUser);
	}

}
