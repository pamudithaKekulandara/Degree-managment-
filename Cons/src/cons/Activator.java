package cons;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import test.Pub;
import test.PubInt;



public class Activator implements BundleActivator {

	ServiceReference serviceReference; 

	public void start(BundleContext Context) throws Exception {
		
		System.out.println("Start Consumer");
		serviceReference= Context.getServiceReference(Pub.class.getName());
		Pub pub=(Pub)Context.getService(serviceReference);
	    System.out.println(pub.publisherervice());
//	    System.out.println(servicePublisher.CheckEligibility());
	    
		int select=pub.CheckEligibility(),selection;
		if(select==1) {
			System.out.println("Congragulations! Now you have to face the apitude test");
		 
			while(true) 
			{
				float mrk=pub.CheckApptitude(),mark;
				if((mrk>100) || (mrk<0)) {
					System.out.println("You entered invalid marks. Please re-enter");
				}
				else if(mrk>=75) {
					System.out.println("Congradulations! You have passed the apptitude test. Now you can select a course");
					break;
				}
				else {
					System.out.println("You have failed the appitude test. Try in the next intake");
					break;
				}
			}
			
			int stm=pub.CheckStream(),stream;
			switch(stm){
				case 1:
				   System.out.println("You can choose these courses. \n Enginering	1\n Computing	2\n Buisness	3");
				   break;
				case 2:
				   System.out.println("You can choose these courses. \n Medicine	4\n Computing	2\n Buisness	3");
				   break;
				case 3:
				   System.out.println("You can choose these courses. \n Computing	2\n Buisness	3");
				   break;
			}
				
			
			while(true) 
			{
				int crse=pub.selectCourse(),crs;

				if((crse<1) || (crse>4)) {
					System.out.println("You entered invalid course code. Please re-enter");
				}
				else if(crse==1) {
					System.out.println("Welcome to Enginnering");
					break;
				}
				else if(crse==2){
					System.out.println("Welcome to Computing");
					break;
				}
				else if(crse==3) {
					System.out.println("Welcome to Buisness");
					break;
				}
				else {
					System.out.println("Welcome to Medicine");
					break;
				}
			}
			
		}
		else {
			System.out.println("Sorry! please try in another time");
		}
	    
	    
	}

	public void stop(BundleContext Context) throws Exception {
		System.out.println("Good bye");
		Context.ungetService(serviceReference);
	
	}

}
