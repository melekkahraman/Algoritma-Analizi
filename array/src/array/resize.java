package array;
import java.util.Scanner;
import java.util.Random;
public class resize {
	public static void main(String[] args) {
		int[] dizi = new int[10];
		int boyut;
		Scanner scan = new Scanner(System.in );
		System.out.println("Oluşturmak istediğiniz dizi boyutunu girin");
		boyut = scan.nextInt();
		int uzunluk=dizi.length;
		while(boyut>uzunluk){
		     uzunluk=uzunluk*2;
		     dizi = new int[uzunluk];
		}
		
		Random r = new Random();
		for(int i=0;i<boyut;i++){
		      dizi[i]=r.nextInt(100);
		}
		int a=0;
		System.out.print("Dizi={");
		for (int i=0; i<boyut; i++) {
                     System.out.print(dizi[i]);
                     if(i!=boyut-1){
	                System.out.print(","+" ");
	             }
                     a=a+1; 
                }
		System.out.println("}");
		System.out.println("Tersten yazılmış dizi");
		System.out.print("Dizi={");
		for (int i=boyut-1; i>=0; i--) {
	            System.out.print(dizi[i]);
	            if(i!=0){
			System.out.print(","+" ");
	       	   }
	            a=a+1;
                }
		System.out.print("}");
	 }
     }

