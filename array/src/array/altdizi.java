package array;

import java.util.Scanner;

public class altdizi {
	static int[] dizi ={1,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0};
	public static void main(String[] args) {
		int uzunluk=dizi.length;
		int[] sayac =new int[uzunluk];
		int j=0;
		int deger=0;
		for(int i=0; i<uzunluk;i++){
			if(dizi[i]==0){
				deger=deger+1;
				sayac[j]=deger;
			}
			else{
				deger=0;
				j=j+1;
			}
		}
		int max=sayac[0];
		for(int i=1;i<sayac.length;i++){
			if(sayac[i]>max){
				max=sayac[i];
			}
			
		}
		System.out.print("Altdizi={");
		for(int i=0;i<max;i++){
			System.out.print("0");
			if(i<max-1){
				System.out.print(",");
			}
		}
		System.out.print("}");
		
	}
}
