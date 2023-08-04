package BaiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int a;
        QLCB qlcb = new QLCB();
        while(true){
            System.out.println("Choose 1: To add member");
            System.out.println("Choose 2: To search member");
            System.out.println("Choose 3: To show member");
            System.out.println("Choose 4: To exit");
            i = scanner.nextInt();
            switch (i) {
                case 1: {
                    System.out.println("Choose 1: Nhan vien");
                    System.out.println("Choose 2: Ky su");
                    System.out.println("Choose 3: Cong nhan");
                    a = scanner.nextInt();
                    switch (a) {
                        case 1: {
                            System.out.println("Nhap ten:");
                            String name = scanner.nextLine();
                            System.out.println("Nhap tuoi:");
                            int age = scanner.nextInt();
                            System.out.println("Nhap gioi tinh:");
                            String gender = scanner.nextLine();
                            System.out.println("Nhap dia chi:");
                            String address = scanner.nextLine();
                            System.out.println("Nhap cong viec:");
                            String job = scanner.nextLine();
                            CanBo canbo = new NhanVien(name, age, gender, address, job);
                            qlcb.add(canbo);
                            break;
                        }
                        case 2: {
                            System.out.println("Nhap ten:");
                            String name = scanner.nextLine();
                            System.out.println("Nhap tuoi:");
                            int age = scanner.nextInt();
                            System.out.println("Nhap gioi tinh:");
                            String gender = scanner.nextLine();
                            System.out.println("Nhap dia chi:");
                            String address = scanner.nextLine();
                            System.out.println("Nhap nganh dao tao:");
                            String training = scanner.nextLine();
                            CanBo canbo = new KySu(name, age, gender, address, training);
                            qlcb.add(canbo);
                            break;
                        }
                        case 3: {
                            System.out.println("Nhap ten:");
                            String name = scanner.nextLine();
                            System.out.println("Nhap tuoi:");
                            int age = scanner.nextInt();
                            System.out.println("Nhap gioi tinh:");
                            String gender = scanner.nextLine();
                            System.out.println("Nhap dia chi:");
                            String address = scanner.nextLine();
                            System.out.println("Nhap bac:");
                            int level = scanner.nextInt();
                            CanBo canbo = new CongNhan(name, age, gender, address, level);
                            qlcb.add(canbo);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case 2: {
                    String name = scanner.nextLine();
                    qlcb.search(name).forEach(o -> {
                        System.out.println(o.toString());
                    });
                    break;
                }
                case 3: {
                    qlcb.ShowCanBo();
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
