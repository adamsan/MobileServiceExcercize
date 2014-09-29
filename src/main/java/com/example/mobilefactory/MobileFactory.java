package com.example.mobilefactory;

import java.util.Random;

import com.example.mobileservice.Mobile;

public interface MobileFactory {

	static final Random RANDOM = new Random();

	Mobile createPhone();

}
