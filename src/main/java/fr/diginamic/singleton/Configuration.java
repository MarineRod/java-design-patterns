package fr.diginamic.singleton;

import java.util.HashMap;

public class Configuration {

	private HashMap<String, String> proprietes = new HashMap<>();
	private static Configuration instance = new Configuration();

	public Configuration() {

		init();
	}

	public static Configuration getInstance() {
		return instance;
	}

	private void init() {

	}
}
