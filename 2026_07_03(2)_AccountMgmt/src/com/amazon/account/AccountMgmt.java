package com.amazon.account;

import com.amazon.user.UserMgmt;

public class AccountMgmt
{
	public static final String RETAIL = "retail";
	public static final String RESELLER = "reseller";
 
	// Since UserMgmt is in a different project, we cannot access it directly.
	// First, we need to create a JAR file for the UserMgmt project.
	// Right-click  -> Export -> JAR File.

	// After creating the JAR file, add it to this project.
	// Right-click the project(in AccountMgmt class) -> Properties -> Java Build Path (or Libraries)
	// -> Add External JARs -> Select the JAR -> Apply and Close.

	
	// Now you can create an object of the UserMgmt class.
	
	public static void main(String[] args)
	{
		UserMgmt user1 = new UserMgmt();
		user1.showUserInfo(RESELLER);
	}
	
	// Suppose we want to add another user type called "Marketplace".
	// Then the UserMgmt project has to be modified again.

	// public static final String MARKETPLACE = "marketplace";
    
	
	
	/*
	 * Imagine there are 1000 dependencies in a project.
	 * Managing them manually becomes very difficult.
	 *
	 * Suppose the UserMgmt team updates their project by adding a new user type.
	 * They will generate a new JAR file.
	 *
	 * Now, to use the updated code in the AccountMgmt project,
	 * we have to perform all these manual steps again:
	 *
	 * 1. Export the updated JAR from the UserMgmt project.
	 * 2. Remove the old JAR from the AccountMgmt project.
	 * 3. Add the new JAR using Build Path.
	 * 4. Import the required classes if necessary.
	 * 5. Build and test the project.
	 *
	 * Repeating these steps every time a dependency changes is
	 * time-consuming and difficult to manage.
	 */
	
	//THAT'S WHERE MAVEN INTRODUCED

}
