package Login;

import java.util.Scanner;


public class loginSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Login");
        System.out.println("Anda Ingin Login Sebagai?");
        System.out.println("0. Logout");
        System.out.println("1. Admin");
        System.out.println("2. Author");
        System.out.println("3. Mahasiswa");
        System.out.println("4. Manajer");
        System.out.printf("Anda memilih: ");




            int pilihan = scan.nextInt();
            scan.nextLine();
        try {
            if (pilihan < 0) {
                System.out.println("Angka Tidak Boleh Negatif!!!");
            } else {
                System.out.printf("Pilihan Sah: " + pilihan);
            }


            switch (pilihan) {
                case 0 :
                    System.out.println("Selamat Anda Berhasil Logout");
                break;

                case 1:
                        System.out.println("Selamat Anda Berhasil Login!!!");
                break;

                case 2:
                        System.out.println("Selamat Anda Berhasil Login");
                break;
                case 3:
                    System.out.println("Selamat Anda Berhasil Login!!!");
                break;

                case 4:
                    System.out.println("Selamat Anda Berhasil Login!!!");
                break;
                default:
                    break;


            }




    }catch (NumberFormatException e){
            System.out.println("Input Harus Berupa Angka");
        }

    }
}