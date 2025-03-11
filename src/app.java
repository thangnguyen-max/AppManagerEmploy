import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerEmploy managerEmploy = new ManagerEmploy();
        managerEmploy.setSize(10); // size của mảng
        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("Ứng dụng quản lý nhân viên");
            System.out.println("---------------------------------------");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm nhân viên mới");
            System.out.println("3. Tìm kiếm nhân viên theo tên");
            System.out.println("4. Cập nhât thông tin nhân viên");
            System.out.println("5. Xóa nhân viên");
            System.out.println("6. Tổng lương của tát cả nhân viên");
            System.out.println("0. Thoát");
            System.out.println("--------------------------------------");
            System.out.println("Nhập lựa chọn để thực hiện!");
            int choice = Integer.parseInt((sc.nextLine()));
            switch (choice) {
                case 0:
                    break;
                case 1:
                    //Hiển thị danh sách nhân viên
                    managerEmploy.displayEmploy();
                    break;
                case 2:
                    //Thêm nhân viên mới
                    managerEmploy.addEmploy();
                    break;
                case 3:
                    //Tìm kiếm nhân viên theo tên
                    managerEmploy.searchEmploy();
                    break;
                case 4:
                    //Cập nhật thông tin nhân viên
                    managerEmploy.updateEmploy();
                    break;
                case 5:
                    //Xóa nhân viên
                    managerEmploy.removeEmploy();
                    break;
                case 6:
                    //Tổng lương tất cả nhân viên
                    managerEmploy.sumSalaryEmploy();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }


    }
}