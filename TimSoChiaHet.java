public class TimSoChiaHet {
    public static void main(String[] args) {
        int count = 0; // Đếm số lượng số đã in trên một dòng

        // Duyệt qua các số có 3 chữ số
        for (int i = 100; i <= 999; i++) {
            // Kiểm tra điều kiện chia hết cho 2, 3 và 5
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + "\t"); // In số ra màn hình, cách nhau bằng tab
                count++; // Tăng số lượng số đã in

                // Nếu đã in 5 số, xuống dòng và reset lại biến đếm
                if (count == 5) {
                    System.out.println(); // Xuống dòng
                    count = 0; // Reset biến đếm
                }
            }
        }
    }
}
