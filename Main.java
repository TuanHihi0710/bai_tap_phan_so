import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyPhanSo quanLyPhanSo = new QuanLyPhanSo();
        int nhap=0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 2 để chọn Menu:");
                System.out.println("1: Nhập phan so");
                System.out.println("2: Xuat phan so");
                System.out.println("3: Tru phan so");
                System.out.println("4: Chia phan so");
                System.out.println("5: Tinh tong 2 phan so");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 5) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap == 1) {
                    System.out.println("Nhap phan so");
                    System.out.println("Nhap tu so");
                    Scanner scTuSo = new Scanner(System.in);
                    int tuSo = scTuSo.nextInt();
                    System.out.println("Nhap mau so");
                    Scanner scMauSo = new Scanner(System.in);
                    int mauSo = scMauSo.nextInt();
                    quanLyPhanSo.NhapVaoPhanSo(tuSo,mauSo);
                }else if (nhap == 2){
                    System.out.println("Xuat phan so");
                    quanLyPhanSo.XuatPhanSo();
                } else if (nhap==3) {
                    System.out.println("Tru hai phan so");
                    System.out.println("Nhap tu so");
                    Scanner scTuSo = new Scanner(System.in);
                    int tuSo = scTuSo.nextInt();
                    System.out.println("Nhap mau so");
                    Scanner scMauSo = new Scanner(System.in);
                    int mauSo = scMauSo.nextInt();
                    quanLyPhanSo.TruHaiPhanSo(new PhanSo(tuSo,mauSo)).XuatPhanSo();
                } else if (nhap==4) {
                    System.out.println("Chia hai phan so");
                    System.out.println("Nhap tu so");
                    Scanner scTuSo = new Scanner(System.in);
                    int tuSo = scTuSo.nextInt();
                    System.out.println("Nhap mau so");
                    Scanner scMauSo = new Scanner(System.in);
                    int mauSo = scMauSo.nextInt();
                    quanLyPhanSo.ChiaHaiPhanSo(new PhanSo(tuSo,mauSo)).XuatPhanSo();
                } else if (nhap==5) {
                    System.out.println("Tinh tong hai phan so");
                    System.out.println("Nhap tu so 1");
                    Scanner scTuSo = new Scanner(System.in);
                    int tuSo = scTuSo.nextInt();
                    System.out.println("Nhap mau so 1");
                    Scanner scMauSo = new Scanner(System.in);
                    int mauSo = scMauSo.nextInt();
                    System.out.println("Nhap tu so 2");
                    Scanner scTuSo2 = new Scanner(System.in);
                    int tuSo2 = scTuSo2.nextInt();
                    System.out.println("Nhap mau so 2");
                    Scanner scMauSo2 = new Scanner(System.in);
                    int mauSo2 = scMauSo2.nextInt();
                    quanLyPhanSo.TinhTong2PhanSo(new PhanSo(tuSo,mauSo), new PhanSo(tuSo2,mauSo2)).XuatPhanSo();
                }
            }catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 5);
            }
}