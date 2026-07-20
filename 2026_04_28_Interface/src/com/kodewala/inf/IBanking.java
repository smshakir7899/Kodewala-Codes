package com.kodewala.inf;

// an interface is 100% abstract
public interface IBanking // in industry people use I before class name
// so use this convention in interface
{
	public abstract void pay();

	public abstract void settle();

	void addPay(); // in interface all the method are abstract by default
					// either you write abstract or not

	void modifyPay();

	// Now why Interface... lets say this class is RBI and all other classes are its
	// sub branches so RBI want to introduce new feature so they just introduce here
	// then all the other classes MUST implement they do not have any other option
	
	// for e.g.
	void doKYC();
	// now go and check both classes(i.e SBI & HDFC) throws error
}