package com.juaracoding.Junit.array;

public class DataArray {
	public static int cariMax(int angka[]) {
		int max = angka[0];
		for(int i = 1;i<angka.length;i++) {
			if(max<angka[i]) {
				max=angka[i];
			}
		}
		return max;
	}

}
