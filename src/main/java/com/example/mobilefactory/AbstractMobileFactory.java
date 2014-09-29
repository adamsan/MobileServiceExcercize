package com.example.mobilefactory;

import com.example.mobileservice.Manufacturer;
import com.example.mobileservice.Mobile;
import com.example.mobileservice.Part;
import com.example.mobileservice.PartType;

public abstract class AbstractMobileFactory implements MobileFactory {

	protected abstract String getManufacturerName();

	protected abstract Manufacturer getManufacturer();

	protected abstract String[] getModels();

	@Override
	public Mobile createPhone() {
		Mobile mobile = new Mobile();
		mobile.manufacturer = getManufacturer();
		mobile.model = getModels()[RANDOM.nextInt(getModels().length)];
		mobile.display = new Part(PartType.DISPLAY, RANDOM.nextBoolean(), getManufacturerName() + " Display");
		mobile.microphone = new Part(PartType.MICROPHONE, RANDOM.nextBoolean(), getManufacturerName() + " Microphone");
		mobile.motherBoard = new Part(PartType.MOTHERBOARD, RANDOM.nextBoolean(), getManufacturerName() + " " + mobile.model + " Motherboard");
		mobile.powerSwitch = new Part(PartType.POWER_SWITCH, RANDOM.nextBoolean(), getManufacturerName() + " Power Switch");
		mobile.speaker = new Part(PartType.SPEAKER, RANDOM.nextBoolean(), getManufacturerName() + " Speaker");
		mobile.volumeButtons = new Part(PartType.VOLUME_BUTTONS, RANDOM.nextBoolean(), getManufacturerName() + " Volume Buttons");
		return mobile;
	}

}
