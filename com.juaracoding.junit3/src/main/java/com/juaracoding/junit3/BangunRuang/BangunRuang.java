package com.juaracoding.junit3.BangunRuang;

public class BangunRuang {
	
	public double VolumeBalok(double panjang, double lebar, double tinggi) {
		return panjang * lebar * tinggi;
	}
	
	public double LuasBalok(double panjang, double lebar, double tinggi) {
		return (2*panjang*lebar) + (2*panjang*tinggi) + (2*lebar*tinggi); 
	}

	
	public double VolumeTabung(double ruas, double tinggi ) {
		return 3.14 *Math.pow(ruas, 2)* tinggi;
	}
	
	public double LuasTabung(double luasAlas, double luasSelimut ) {
		return 2 * luasAlas * luasSelimut;
	}
	
	public double VolumeKerucut(double ruas, double tinggi ) {
		return 0.33 * 3.14 * (Math.pow(ruas, 2)) * tinggi;
	}

}
