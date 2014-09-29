package com.example.mobilefactory;

import com.example.mobileservice.Manufacturer;

public class SamsungMobileFactory extends AbstractMobileFactory {

	private static final String[] models = { "Galaxy S3", "Galaxy S4", "Galaxy Note" };
	private static final String MANUFACTURER_NAME = "Samsung";
	private static final Manufacturer MANUFACTURER = Manufacturer.SAMSUNG;

	private SamsungMobileFactory() {

	}

	public static final SamsungMobileFactory INSTANCE = new SamsungMobileFactory();

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
