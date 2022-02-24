/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaifaktorial;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
 
public class GajiKaryawan1
{
public static void main (String[]args)
{
    Scanner input=new Scanner(System.in);
    String nama;
    int gol,jabatan, pokok, tunjangan,Pajak, bonus, totgaji;
     System.out.println("PROGRAM MENGHITUNG GAJI KARYAWAN");
     System.out.println("Masukan Nama dan golongan");
     System.out.println("Golongan 1 Gaji >15000000");
     System.out.println("Golongan 2 Gaji >=15000000");       
     System.out.println("Golongan 3 Gaji >=12600000");
     System.out.println("Golongan 4 Gaji >10000000");
     System.out.println("Golongan 5 Gaji <10000000");
  System.out.println("Nama\t\t\t\t= ");
  nama = input.next();
  System.out.println("Golongan = ");
  gol = input.nextInt();
 
  if (gol == 1) 
  {
   pokok = 25000000;
   tunjangan = 25000000/100 * 10 ;
   bonus = 250000;
   Pajak = (int) (25000000/100 * 2.5);
   totgaji = pokok + tunjangan + bonus - Pajak ;
   System.out.println("Gaji Pokok\t\t\t= "+pokok);
   System.out.println("Tunjangan = "+tunjangan);
   System.out.println("Jumlah Bonus = " + bonus);
   System.out.println("Pajak = " + Pajak);
   System.out.println("==================================");
   System.out.println("Total Gaji\t\t\t= "+totgaji);
   System.out.println("==================================");
  }
  else if (gol == 2) 
  {
   pokok = 15000000;
   tunjangan = 15000000/100 * 12;
   bonus = 175000;
   Pajak = 15000000/100 * 2;
   totgaji = pokok + tunjangan + bonus - Pajak ;
   System.out.println("Gaji Pokok\t\t\t= "+pokok);
   System.out.println("Tunjangan Kehadiran = "+tunjangan);
   System.out.println("Jumlah Bonus = " + bonus);
   System.out.println("Pajak = " + Pajak);
   System.out.println("==================================");
   System.out.println("Total Gaji\t\t\t= "+totgaji);
   System.out.println("==================================");
  }
  else if (gol == 3) 
  {
   pokok = 13000000;
   tunjangan = (12*100)/13000000;
   bonus = 125000;
   Pajak = (int)(13000000/100 *2.5);
   totgaji = pokok + tunjangan + bonus - Pajak ;
   System.out.println("Gaji Pokok\t\t\t= "+pokok);
   System.out.println("Tunjangan Kehadiran = "+tunjangan);
   System.out.println("Jumlah Bonus = " + bonus);
   System.out.println("Pajak = " + Pajak);
   System.out.println("==================================");
   System.out.println("Total Gaji\t\t\t= "+totgaji);
   System.out.println("==================================");
  }
  else if (gol == 4) 
  {
   pokok = 12500000;
   tunjangan =12500000/100 * 12;
   bonus = 125000;
   Pajak = 12500000/100 * 2;
   totgaji = pokok + tunjangan + bonus - Pajak ;
   System.out.println("Gaji Pokok\t\t\t= "+pokok);
   System.out.println("Tunjangan Kehadiran = "+tunjangan);
   System.out.println("Jumlah Bonus = " + bonus);
   System.out.println("Pajak = " + Pajak);
   System.out.println("==================================");
   System.out.println("Total Gaji\t\t\t= "+totgaji);
   System.out.println("==================================");
  }
   else if (gol == 5) 
  {
   pokok = 8000000;
   tunjangan =8000000 / 100 * 15;
   bonus = 100000;
   Pajak = (int) (8000000/100*1.8);
   totgaji = pokok + tunjangan + bonus - Pajak ;
   System.out.println("Gaji Pokok\t\t\t= "+pokok);
   System.out.println("Tunjangan Kehadiran = "+tunjangan);
   System.out.println("Jumlah Bonus = " + bonus);
   System.out.println("Pajak = " + Pajak);
   System.out.println("==================================");
   System.out.println("Total Gaji\t\t\t= "+totgaji);
   System.out.println("==================================");
  }
  else
  {
   System.out.println("Golongan\t\t\t= Golongan Salah !!");
  }

} 
}
