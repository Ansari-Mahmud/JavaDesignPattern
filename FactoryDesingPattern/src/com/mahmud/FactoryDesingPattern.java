package com.mahmud;

import java.util.Scanner;

import phone.OS;
import phone.OSFactory;

public class FactoryDesingPattern {

	public static void main(String[] args) {

		OS obj = OSFactory.getInstance("Open");
		obj.spec();
	}

}
