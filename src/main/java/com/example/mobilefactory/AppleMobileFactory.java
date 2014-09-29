package com.example.mobilefactory;

import com.example.mobileservice.Manufacturer;

public class AppleMobileFactory extends AbstractMobileFactory {

	private static final String[] models = { "iPhone 4s", "iPhone 5s", "iPhone5c" };
	private static final String MANUFACTURER_NAME = "Apple";
	private static final Manufacturer MANUFACTURER = Manufacturer.APPLE;

	private AppleMobileFactory() {

	}

	public static final AppleMobileFactory INSTANCE = new AppleMobileFactory();

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
