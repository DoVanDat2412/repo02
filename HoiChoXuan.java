import java.util.Scanner;

public class HoiChoXuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng học sinh từ bàn phím
        System.out.print("nhap so luong hoc sinh: ");
        int A = scanner.nextInt();

        // Tính toán số vé cần mua
        int soVePhaiMua = (A / 6) * 5 + (A % 6);

        // Tính tổng số tiền
        int tongTien = soVePhaiMua * 5000;

        // Xuất kết quả
        System.out.println("Tong so tien can mua ve la: " + tongTien + " dong");

        scanner.close();
    }
}
