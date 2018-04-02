/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversidesim;

/**
 *
 * @author Medina
 */
public class KonversiDesim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------Decimal to Hexa,Oktal,Biner------------");
        System.out.println("Decimal to Hexa : " + DestoHex(122));
        System.out.println("Decimal to oktal : " + DestoOkt(12));
        System.out.println("Decimal to Biner : " + DestoBiner(16));
        System.out.println("------------Decimal from Hexa,Oktal,Biner--------------");
        System.out.println("Decimal from Hexa : " + DesfromHex("F"));
        System.out.println("Decimal from Oktal : " + DesfromOkt(121));
        System.out.println("Decimal from Biner : " + DesfromBiner(1010));
    }
    
    //Konversi Desimal ke Heksa
    public static String DestoHex (int n) {
        int hexa;
        String konversi1 = " ";
        
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        while (n > 0){  //perulangan akan terus dilakukan selama nilai nilai dari variabel n masih > 0
            hexa = n % 16;
            konversi1 = hex[hexa] + konversi1;
            n = n / 16;
        }
        return konversi1;
    }
    
    //konversi dari Desimal ke Oktal
    public static String DestoOkt (int n){
        int okt;
        String konversi2 = " ";
        
        char oktal[] = {'1','2','3','4','5','6','7'};
        
        while (n > 0){
            okt = n % 8;
            konversi2 = oktal[okt] + konversi2;
            n = n / 8;
        }
        return konversi2;
    }
    
    //Konversi dari Desimal ke Biner
    public static String DestoBiner (int n){
        String konversi3 = " ";
        int temp = 0;      
        String biner = " ";
        while(n > 1){           //perulangan akan terus dilakukan selama nilai nilai dari variabel n masih > 1
            temp = n % 2;       //variabel temp mempunyai nilai dari perhitungan sisa hasil bagi pada variabel n dengan bil 2
            n = n / 2;          //variabel n akan terus dibagi dengan 2 selama perulangan berlangsung dan hasilnya akan disimpan di variabel n itu sendiri
            biner = temp + biner; //hasil penggabungan temp dan biner akan di simpan di variabel biner itu sendiri
            konversi3 = n + biner;
        }
        return konversi3;
    }
    
      //konversi dari hexa ke desimal
    public static int DesfromHex (String hex){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    
    //konversi dari Biner ke desimal
    public static int DesfromOkt (int okt){
        int decimal = 0;
        int n = 0;
        while(true){
            if(okt==0){
                break;
            }
            else{
                int temp = okt%10;
                decimal+=temp*Math.pow(8,n);
                okt = okt/10;
                n++;
            }
        }
        return decimal;
    }
    
    //konversi dari Biner ke desimal
    public static int DesfromBiner (int biner){
        int decimal = 0;
        int n = 0;
        while(true){
            if(biner==0){
                break;
            }
            else{
                int temp = biner % 10;
                decimal+=temp*Math.pow(2, n);
                biner = biner/10;
                n++;
            }
        }
        return decimal;
    }
}
