package com.juaracoding.Junit.siswa;

public class Siswa {
	private String nama;
//	private String batch;

	public Siswa(String nama) {
		this.nama = nama;
		
	}

	public String tampilkandata() {
		System.out.println(nama);
		return nama;
	}

}
