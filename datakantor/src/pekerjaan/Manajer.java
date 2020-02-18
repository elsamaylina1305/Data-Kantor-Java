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
public class Manajer {
    public static void masaaktifbekerja()
    {

            int gaji = 1500000;
            int masaaktifbekerja = 10;
            double naik = 0.2*gaji;
            double naik_gaji = (naik+gaji);
            double kurs = naik_gaji/500;
            System.out.println("Jabatan Manajer");
            System.out.println("Golongan = GolA");
            System.out.println("Gaji = Rp 1.500.000");
            System.out.println("Masa Aktif Bekerja = 10 Tahun");
            System.out.println("Kenaikan Gaji = Rp"+naik);
            System.out.println("Total Gaji = Rp"+naik_gaji);
            System.out.println("Kurs = $"+kurs);
            
    }
}
