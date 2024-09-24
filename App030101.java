import java.util.Scanner;

public class App030101 {    d 
    public static void main(String[] args) {
        // kiem tra xem co phai so happy ko 
        int n ;
        System.out.println("nhap so n : "); 
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ;
        int tonguoc = 0 ; 
        for(int i = 1 ; i <= n/2 ; i++ ){
            if(n % i == 0){
                tonguoc += i ; 

            }
            if (tonguoc == n ) {
                System.out.println("\n" + n + " la so Happy");
            }else{
                System.out.println("\n" + n + " khong la so Happy");
            }
        }
    }
}