package com.juaracoding.Junit.pajak;

public class Pajak {
	
	public double HitungPajak(double pendapatan) {
		double presentase;
		if(pendapatan> 7500) {
			presentase =10;
		}else {
			presentase = 0;
		}
		return presentase;
		
	}

}
