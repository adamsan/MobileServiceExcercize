package com.example.mobilefactory;

import com.example.mobileservice.Manufacturer;

public class HuaweiMobileFactory extends AbstractMobileFactory {

	private static final String[] models = { "Ascend P7", "Ascend P2", "Ascend G630" };
	private static final String MANUFACTURER_NAME = "Huawei";
	private static final Manufacturer MANUFACTURER = Manufacturer.HUAWEI;

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
