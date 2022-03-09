package com.juaracoding.junit2.pasien;

public class TagihanMenginap {
	
	public double totalTagihan (Pasien pasien) {
		double total= 0;
		if(pasien.getKelas() == "Kelas VIP") {
			total = 250000 * pasien.getMenginap();
		} else if(pasien.getKelas() == "Kelas 1") {
			total = 200000 * pasien.getMenginap();
		}
		return total;
	}

}
