package test;

import java.util.Scanner;

public class Pub implements PubInt{

	@Override
	public String publisherervice() {
		// TODO Auto-generated method stub
		return "\n\n               Welcome to Rental Services...!!!               ";
	}

	@Override
	public int CheckEligibility() {
		// TODO Auto-generated method stub
		System.out.println("If you pass AL enter 1\n  Fail enter 2 ");
		
		
	    System.out.println("Enter the AL status :");
	    
	    Scanner select = new Scanner(System.in);
		int selection = select.nextInt();
		
		return selection;
	}

	

}
