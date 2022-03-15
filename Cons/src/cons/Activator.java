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
				   System.out.println("You can choose these courses. \n Enginering\n Computing\n Buisness Managment");
				   break;
				case 2:
				   System.out.println("You can choose these courses. \n Medicine\n Computing\n Buisness Management");
				   break;
				case 3:
				   System.out.println("You can choose these courses. \n Computing\n Buisness Management");
				   break;
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
