import java.util.Scanner;

public class jobsheet1Tugas {
     public static void main(String[] args) {

          // Laundry();

          rumus();
     }

     static void Laundry() {
          int budi = 15, bina = 6, ani = 4, cita = 11;
          int barangLaundry[] = { budi, bina, ani, cita };
          Double harga = 0.0;
          for (int i = 0; i < barangLaundry.length; i++) {
               if (barangLaundry[i] > 10) {
                    // harga = (float) harga + barangLaundry[i]+(barangLaundry[i] * 0.05);
                    harga = (Double) (harga + barangLaundry[i] * 4500) - barangLaundry[i] * 4500 * 0.05;
               }
               harga = (Double) harga + barangLaundry[i] * 4500;
          }
          System.out.print("pendapatan : Rp" + harga);
     }

     static void rumus() {
          Scanner sc = new Scanner(System.in);
          System.out.print("input jarak : ");
          int s = sc.nextInt();
          System.out.print("input waktu : ");
          int t = sc.nextInt();
          System.out.print("input kecepatan : ");
          int v = sc.nextInt();

          System.out.print("pilih rumus yang anda inginkan tekan \n 1 = kecepatan \n 2 = jarak \n 3 = waktu \n : ");
          int pilihanUser = sc.nextInt();
          if (pilihanUser == 1) {
               System.out.println("kecepatan : " + kecepatan(s, t) + " meter/sekon");
          } else if (pilihanUser == 2) {
               System.out.println("Jarak : " + jarak(v, t) + " meter");
          } else if (pilihanUser == 3) {
               System.out.println("waktu " + waktu(s, v) + " sekon");
          }
     }

     static int kecepatan(int s, int t) {
          int v = s / t;
          return v;
     }

     static int jarak(int v, int t) {
          int s = v * t;
          return s;
     }

     static int waktu(int s, int v) {
          int t = s / v;
          return t;
     }
}
