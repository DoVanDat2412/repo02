import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSo {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều dài của danh sách
        System.out.print("Nhap chieu dai cua danh sach: ");
        int chieuDai = scanner.nextInt();
        
        // Tạo danh sách để lưu các số
        ArrayList<Integer> danhSach = new ArrayList<>();
        
        // Nhập các số từ bàn phím vào danh sách
        for (int i = 0; i < chieuDai; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            int so = scanner.nextInt();
            danhSach.add(so);
        }
        
        // Hiển thị các số đã nhập
        System.out.println("Danh sach cac so da nhap: " + danhSach);
        
        // Tính tổng các số vừa nhập
        int tong = 0;
        for (int so : danhSach) {
            tong += so;
        }
        System.out.println("Tong cac so trong danh sach: " + tong);
        
        // Tìm số lớn nhất trong danh sách
        int soLonNhat = danhSach.get(0);
        for (int so : danhSach) {
            if (so > soLonNhat) {
                soLonNhat = so;
            }
        }
        System.out.println("So lon nhat trong danh sach la: " + soLonNhat);
        
        // Đếm số lần xuất hiện của số lớn nhất
        int dem = 0;
        for (int so : danhSach) {
            if (so == soLonNhat) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien cua so lon nhat la : " + dem);
        
        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
