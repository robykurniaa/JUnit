package com.juaracoding.junit2.pasien;

import java.util.Scanner;

public class Pasien {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	public int getMenginap() {
		return menginap;
	}
	public void setMenginap(int menginap) {
		this.menginap = menginap;
	}
	private int id;
	private String nama;
	private String kelas;
	private int menginap;

}
