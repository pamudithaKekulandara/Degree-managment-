package test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;

	public void start(BundleContext Context) throws Exception {
		
	System.out.println("Publisher start");
	Pub  publishservice =new Pub();
	serviceRegistration=Context.registerService(Pub.class.getName(),publishservice ,null );
	

	}
	

	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Publisher stop");
		serviceRegistration.unregister();
	}

}
