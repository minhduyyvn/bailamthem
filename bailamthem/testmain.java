package bailamthem;

import java.util.Scanner;

public class testmain {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        ProgramManager programManager = new ProgramManager();

        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("Chương trình thêm, sửa, xóa thông tin của 1 đối tượng");
            System.out.println("--------------MENU LỰA CHỌN---------------");
            System.out.println("1. Thêm Thông tin ");
            System.out.println("2. Sửa Thông tin ");
            System.out.println("3. Xóa Thông tin ");
            System.out.println("4. Thoát chương trình ");
            System.out.println("------------------------------------------");

            int choice = ss.nextInt();
            ss.nextLine(); // Đọc dòng trống sau khi đọc số nguyên

            switch (choice) {
                case 1:
                    System.out.println("Mời nhập thông tin thêm vào: ");
                    System.out.println("Tên: ");
                    String Iten = ss.nextLine();
                    System.out.println("Địa chỉ: ");
                    String Idiachi = ss.nextLine();
                    System.out.println("Tuổi: ");
                    int Ituoi = ss.nextInt();
                    System.out.println("Lương: ");
                    double Iluong = ss.nextDouble();
                    ss.nextLine(); // Đọc dòng trống sau khi đọc số thực

                    // Thêm thông tin Program
                    Program program1 = new Program(Iten, Idiachi, Ituoi, Iluong);
                    programManager.addProgram(program1);
                    System.out.println(program1.toString());
                    break;
                case 2:
                    System.out.println("Mời nhập thông tin cần sửa: ");
                    System.out.println("Tên: ");
                    String Iten2 = ss.nextLine();
                    System.out.println("Địa chỉ: ");
                    String Idiachi2 = ss.nextLine();
                    System.out.println("Tuổi: ");
                    int Ituoi2 = ss.nextInt();
                    System.out.println("Lương: ");
                    double Iluong2 = ss.nextDouble();
                     // Đọc dòng trống sau khi đọc số thực

                    // Sửa thông tin Program
                    programManager.updateProgram(program1, Iten2, Idiachi2, Ituoi2, Iluong2);
                    System.out.println(program1.toString());
                    break;
                case 3:
                    ss.nextLine();
                    // Xóa thông tin Program
                    programManager.removeProgram(program1);
                    System.out.println(program1.toString());
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}