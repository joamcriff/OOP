package BaiTap;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int a;
        QLCB qlcb = new QLCB();
        enum LoaiCanBo {
            NhanVien,
            KySu,
            CongNhan;
        }
        while(true){
            System.out.println("Choose 1: To add member");
            System.out.println("Choose 2: To search member");
            System.out.println("Choose 3: To show member");
            System.out.println("Choose 4: To exit");
            i = scanner.nextInt();
            LoaiCanBo loaicanbo = null;
            switch (i) {
                case 1: {
                    System.out.println("Choose 1: Nhan vien");
                    System.out.println("Choose 2: Ky su");
                    System.out.println("Choose 3: Cong nhan");
                    a = scanner.nextInt();
                    switch (a) {
                        case 1: {
                            loaicanbo = LoaiCanBo.NhanVien;
                            break;
                        }
                        case 2: {
                            loaicanbo = LoaiCanBo.KySu;
                            break;
                        }
                        case 3: {
;                           loaicanbo = LoaiCanBo.CongNhan;
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    System.out.println("Nhap ten:");
                    String name = scanner.next();
                    System.out.println("Nhap tuoi:");
                    int age = scanner.nextInt();
                    System.out.println("Nhap gioi tinh:");
                    String gender = scanner.next();
                    System.out.println("Nhap dia chi:");
                    String address = scanner.next();

                    CanBo canbo;
                    switch (loaicanbo) {
                        case NhanVien:
                            System.out.println("Nhap cong viec:");
                            String job = scanner.next();
                            canbo = new NhanVien(name, age, gender, address, job);
                            qlcb.add(canbo);
                            break;
                        case KySu:
                            System.out.println("Nhap nganh dao tao:");
                            String training = scanner.next();
                            canbo = new KySu(name, age, gender, address, training);
                            qlcb.add(canbo);
                            break;
                        case CongNhan:
                            System.out.println("Nhap bac:");
                            int level = scanner.nextInt();
                            canbo = new CongNhan(name, age, gender, address, level);
                            qlcb.add(canbo);
                            break;
                    }
                    break;
                }
                case 2: {
                    String name = scanner.nextLine();
                    qlcb.search(name).forEach(o -> {
                        System.out.println(o);
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
