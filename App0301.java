import java.util.Scanner;

public class App0301 {
    public static void main(String[] args) {
        int n , tong ; 
        try(Scanner sc = new Scanner(System.in)){
            do{
                System.out.println("nhap n(n la so phan tu cua mang):");
                n = sc.nextInt() ; 
            }while (n < 0) ; 
            // khoi tao va cap phat bo nho cho mang 
            int A[] = new int[n] ; 
            System.out.println("nhap mang");
            for (int i = 0 ; i < n ; i++){
                System.out.println("A[]" + i + "]:");
                A[i] = sc.nextInt() ; 
            }
            //Hien thi mang vua nhap
            System.out.println("A: ");            for (int i = 0 ; i < n ; i++){
                System.out.println(A[i] + "\t");
            }
            tong = 0 ; 
            // tinh tong cac phan tu co trong mang 
            for (int i = 0 ; i < n ; i++){
                tong += A[i] ; 
            }
            System.out.println("\nTong cua mang = " + tong);
        
        } 

    }
}
