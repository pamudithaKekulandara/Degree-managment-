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
			
		}
		else {
			System.out.println("Sorry! please try in anothet time");
		}
	    
	    
	}

	public void stop(BundleContext Context) throws Exception {
		System.out.println("Good bye");
		Context.ungetService(serviceReference);
	
	}

}
