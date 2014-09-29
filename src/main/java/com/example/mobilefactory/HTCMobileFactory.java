package com.example.mobilefactory;

import com.example.mobileservice.Manufacturer;

public class HTCMobileFactory extends AbstractMobileFactory {

	protected static final String[] models = { "One", "Desire 610", "One Mini" };
	protected static final String MANUFACTURER_NAME = "HTC";
	protected static final Manufacturer MANUFACTURER = Manufacturer.HTC;

	public static final HTCMobileFactory INSTANCE = new HTCMobileFactory();
	static {
		registerFactory(INSTANCE);
	}

	private HTCMobileFactory() {
	}

	@Override
	protected String getManufacturerName() {
		return MANUFACTURER_NAME;
	}

	@Override
	protected Manufacturer getManufacturer() {
		return MANUFACTURER;
	}

	@Override
	protected String[] getModels() {
		return models;
	}

}
