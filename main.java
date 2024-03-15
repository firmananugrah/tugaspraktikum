
import java.util.Scanner;


public class main {
    
    public static void main(String[] args){
        System.out.println("1.BujurSangkar");
        System.out.println("2.Persegi Panjang");
        System.out.print("Isikan Pilihan");
        
        Scanner sc = new Scanner(System.in);
        int pilihan = sc.nextInt();
        
        if(pilihan==1){
            BujurSangkar bs = new BujurSangkar(10);
            System.out.println(bs);
        }
        
        if(pilihan==2){
            PersegiPanjang pp = new PersegiPanjang(8,6);
            System.out.println(pp);
        }
    }
}
