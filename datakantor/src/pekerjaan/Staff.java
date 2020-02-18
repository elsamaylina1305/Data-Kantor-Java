/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pekerjaan;

/**
 *
 * @author acer
 */
public class Staff {
    public static void masaaktifbekerja()
    {

            int gaji2 = 1000000;
            int masaaktifbekerja2 = 10;
            double naik2 = 0.2*gaji2;
            double naik_gaji2 = (naik2+gaji2);
            double kurs2 = naik_gaji2/500;
            System.out.println("Jabatan Manajer");
            System.out.println("Golongan = GolB");
            System.out.println("Gaji = Rp 1.500.000");
            System.out.println("Masa Aktif Bekerja = 10 Tahun");
            System.out.println("Kenaikan Gaji = Rp"+naik2);
            System.out.println("Total Gaji = Rp"+naik_gaji2);
            System.out.println("Kurs = $"+kurs2);
            
    }
}
