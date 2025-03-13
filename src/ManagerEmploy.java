import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerEmploy {
    private final ArrayList<Employee> listEmploy;
    private int count = 0;
    private final Scanner scanner;
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public ManagerEmploy() {
        listEmploy = new ArrayList<>(size);
        scanner = new Scanner(System.in);
    }

    public void addEmploy() {
        if (this.count == size) {
            System.out.println("Không thể thêm nhân viên mới");
        } else {
            System.out.println("Nhập tên nhân viên: ");
            String name = scanner.next();
            System.out.println("Nhập ID của nhân viên: ");
            int id = scanner.nextInt();
            System.out.println("Nhập lương nhân viên:");
            double salary = scanner.nextDouble();
            System.out.println("Lựa chọn chức vụ: 1- Manager  2- Developer");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Nhap so tien bonus: ");
                double bonus = scanner.nextDouble();
                Manager employee = new Manager(name, id, salary, bonus);
                listEmploy.add(employee);
            }
            if (choice == 2) {
                System.out.println("Nhập ngôn ngữ lập trình của nhân viên: ");
                String programmingLanguage = scanner.next();
                Developer employee = new Developer(name, id, salary, programmingLanguage);
                listEmploy.add(employee);
            }
            count++;
        }
    }

    public void displayEmploy() {
        if (count == 0) {
            System.out.println("Không có nhân viên ở trong danh sách");
        } else {
            System.out.println("--------Danh sách nhân viên---------");
            for (Employee employee : listEmploy) {
                if (employee == null) {
                    break;
                }
                System.out.println(employee);
            }
        }
    }

    public void searchEmploy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên cần tìm kiếm: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Employee employee : listEmploy) {
            if (employee.name.equalsIgnoreCase(name)) {
                System.out.println(employee);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không có nhân viên " + name + " ở trong danh sách!");
        }
    }

    public void removeEmploy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên cần xóa: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Employee employee : listEmploy) {
            if (employee.name.equalsIgnoreCase(name)) {
                System.out.println("Bạn có chắc rằng bạn muốn xóa nhân viên " + name + " khỏi danh sách không ?");
                System.out.println("1 - Yes");
                System.out.println("2 - No");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        listEmploy.remove(employee);
                        System.out.println("Đã xóa nhân viên " + name + " thành công");
                        count--;
                        break;
                    case 2:
                        break;

                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không có nhân viên " + name + " ở trong danh sách!");
        }
    }

    public void updateEmploy() {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        System.out.println("Nhập tên nhân viên cần cập nhật: ");
        String name = scanner.nextLine();
        for (Employee employee : listEmploy) {
            if (employee.name.equalsIgnoreCase(name)) {
                listEmploy.remove(employee);
                addEmploy();
                found = true;
                System.out.println("Bạn đã cập nhập thành công!");
                break;
            }
        }
        if (!found) {
            System.out.println("Không có nhân viên " + name + " ở trong danh sách!");
        }
    }

    public void sumSalaryEmploy() {
        double sum = 0;
        double[] salary = new double[listEmploy.size()];
        for (int i = 0; i < listEmploy.size(); i++) {
            if(listEmploy.get(i) instanceof Manager){
                ((Manager)listEmploy.get(i) ).calculateSalary();
                salary[i] = ((Manager)listEmploy.get(i)).calculateSalary();
            }else if(listEmploy.get(i) instanceof Developer){
                salary[i] = (listEmploy.get(i)).salary;
            }
        }
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }

        System.out.println(sum);
    }
}
