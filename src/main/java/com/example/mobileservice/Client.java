package com.example.mobileservice;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.mobilefactory.AbstractMobileFactory;
import com.example.mobilefactory.MobileFactory;

/**
 * 
 * @author vrg
 */
public final class Client {

	private final static AtomicLong counter = new AtomicLong();

	private final long id = counter.incrementAndGet();

	private MobileService service;
	private final Mobile mobile;
	private Random random = new Random();

	private static final List<MobileFactory> MOBILE_FACTORIES = AbstractMobileFactory.getFactories();

	public Client(MobileService service) {
		this.service = service;
		this.mobile = createRandomPhone();
	}

	public Mobile createRandomPhone() {
		int random_index = random.nextInt(MOBILE_FACTORIES.size());
		return MOBILE_FACTORIES.get(random_index).createPhone();
	}

	public void log(String message) {
		System.out.println("Client #" + id + ": " + message);
	}

	public void sendMobileToService() {
		log("Sending in mobile: " + mobile);
		WorkSheet workSheet = service.sendIn(mobile);
		WorkSheet.Status lastKnownStatus = workSheet.status;
		while (lastKnownStatus != WorkSheet.Status.FINISHED) {
			while (workSheet.status == lastKnownStatus) {
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException ex) {
					Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			log("Status changed to " + workSheet.status);
			lastKnownStatus = workSheet.status;
		}
	}

}
