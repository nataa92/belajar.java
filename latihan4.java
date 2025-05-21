import java.util.Scanner;

public class latihan4 {
   public static void main(String[] args) {
    //Menggunakan Class Scanner
     int idPasien;
     String namaPasien, alamatPasien, keluhan;
     @SuppressWarnings("resource")
   Scanner keyboard = new Scanner(System.in);
     System.out.println("Imput Data Pasien");
     System.out.println("-----------------");
     System.out.println("Id Pasien : ");
     idPasien = keyboard.nextInt();
     System.out.println("Nama Pasien : ");
     namaPasien = keyboard.next();
     System.out.println("Alamat Pasien");
     alamatPasien = keyboard.next();
     System.out.println("Keluhan :");
     keluhan = keyboard.next();
     //Menampilkan  data pasien
     System.out.println("Output Data Pasien");
     System.out.println("------------------");
     System.out.println("Id Pasien : " + idPasien);
     System.out.println ("Nama Pasien : " + namaPasien);
     System.out.println("Alamat Pasien : " + alamatPasien);
     System.out.println("Keluhan : " + keluhan);

   } 
}
