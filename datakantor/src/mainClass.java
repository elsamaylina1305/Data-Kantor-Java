
import java.util.Scanner;
import datagaji.GolA;
import datagaji.GolB;
import pekerjaan.Manajer;
import pekerjaan.Staff;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.print("Nama Pekerja : ");
        Scanner pekerja = new Scanner(System.in);
        String pkrj= pekerja.nextLine();
        System.out.print("ID Pekerja : ");
        Scanner id = new Scanner(System.in);
        int idp = id.nextInt();
        Scanner pilih = new Scanner(System.in);
        Scanner kembali = new Scanner(System.in);
        Scanner datagaji = new Scanner(System.in);
        Scanner pekerjaan = new Scanner(System.in);
         do{
               System.out.println("Menu Cek Data Gaji");
               System.out.println("1. Golongan Karyawan");
               System.out.println("2. Total Gaji Sesuai Pekerjaan");
               System.out.print("Masukkan Pilihan Anda : ");
               int pilihan = pilih.nextInt();
               System.out.println("");
               switch(pilihan)
               {
                    case 1 :
                        System.out.println("Karyawan");
                        System.out.println("1. GolA");
                        System.out.println("2. GolB");
                        System.out.print("Masukkan Pilihan Anda : ");
                        int pilihan1 = pilih.nextInt();
                        System.out.println("");
                        switch(pilihan1)
                        {
                            case 1 :
                                GolA golongan = new GolA();
                                GolA.gaji();
                            break;
                            case 2 :
                                GolB golongan2 = new GolB();
                                GolB.gaji();
                            break;
                        }
                    break;
                    case 2 :
                        System.out.println("Jabatan");
                        System.out.println("1. Manajer");
                        System.out.println("2. Staff");
                        System.out.print("Masukkan Pilihan Anda : ");
                        int pilihan2 = pilih.nextInt();
                        System.out.println("");
                        switch(pilihan2)
                        {
                            case 1 :
                                Manajer jabatan = new Manajer();
                                Manajer.masaaktifbekerja();
                            break;
                            case 2 :
                                Staff jabatan2 = new Staff();
                                Staff.masaaktifbekerja();
                            break;
                        }
                    break;
                }
            System.out.print("Apakah anda ingin kembali [Y/N] : ");
            String balik = kembali.nextLine();
            System.out.println("");
        }while(true);
                
    }
    
}