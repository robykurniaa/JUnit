package com.juaracoding.junit4.Karyawan;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailKaryawan {
	
	Map<String, String> hashMap = new HashMap<String, String>();
	
	public void tambahEmailKaryawan(String key, String value) {
		if(isValidEmail(value)) {
			hashMap.put(key, value);
		}
		
	}
	
	public String getEmailKaryawanId(Object key) {
		if(!(key instanceof String)) {
			throw new IllegalArgumentException("Object");
		}
		return hashMap.get(key);
	}
	
	public boolean isValidEmail(String email) {
		String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher m = pattern.matcher(email);
		return m.matches();
				
	}

}
