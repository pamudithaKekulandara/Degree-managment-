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

	@Override
	public float CheckApptitude() {
		
		System.out.println("Enter the marks");
		
		Scanner sc= new Scanner(System.in);
		float mark= sc.nextFloat();
		
		return mark;
		
	}

	@Override
	public int CheckStream() {
		System.out.println("Welcome to the degree management department.");
		System.out.println("According to your AL stream, we are going to recomend pre-defined courses for your stream.");
		System.out.println("	Maths	1 \n Biology	2\n Commerce	3");
		Scanner st= new Scanner(System.in);
		int stream= st.nextInt();
		return stream;
	}

	@Override
	public int selectCourse() {
		System.out.println("Enter the preferd course code");
		
		Scanner cr= new Scanner(System.in);
		int crs= cr.nextInt();
		
		return crs;
	}
	
	

	

}
