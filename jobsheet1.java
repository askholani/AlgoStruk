import java.util.Scanner;

public class jobsheet1 {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          // int nilaiTugas;
          // int nilaiUTS;
          // int nilaiUAS;
          // float nilaiAkhir;
          // String nilaiHuruf;

          // System.out.println("Input Nilai Mahasiswa");
          // System.out.println("===============");
          // System.out.print("Input nilai Tugas : ");
          // nilaiTugas = sc.nextInt();
          // System.out.print("input nilai UTS : ");
          // nilaiUTS = sc.nextInt();
          // System.out.print("input nilai UAS : ");
          // nilaiUAS = sc.nextInt();
          // nilaiAkhir = (float) (nilaiTugas * 0.2 + nilaiUTS * 0.35 + nilaiUAS * 0.45);

          // if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
          // nilaiHuruf = "A";
          // System.out.println("Nilai akhir " + nilaiAkhir);
          // System.out.println("Nilai huruf " + nilaiHuruf);
          // System.out.println("==============");
          // System.out.print("Selamat lulus");
          // } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
          // nilaiHuruf = "B+";
          // System.out.println("Nilai akhir " + nilaiAkhir);
          // System.out.println("Nilai huruf " + nilaiHuruf);
          // System.out.println("==============/");
          // System.out.print("Selamat lulus");
          // } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
          // nilaiHuruf = "B";
          // System.out.println("Nilai akhir " + nilaiAkhir);
          // System.out.println("Nilai huruf " + nilaiHuruf);
          // System.out.println("==============");
          // System.out.print("Selamat lulus");
          // } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
          // nilaiHuruf = "C+";
          // System.out.println("Nilai akhir " + nilaiAkhir);
          // System.out.println("Nilai huruf " + nilaiHuruf);
          // System.out.println("==============");
          // System.out.print("Selamat lulus");
          // } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
          // nilaiHuruf = "C";
          // System.out.println("Nilai akhir " + nilaiAkhir);
          // System.out.println("Nilai huruf " + nilaiHuruf);
          // System.out.println("==============");
          // System.out.print("Selamat lulus");
          // } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
          // nilaiHuruf = "D";
          // System.out.println("Nilai akhir " + nilaiAkhir);
          // System.out.println("Nilai huruf " + nilaiHuruf);
          // System.out.println("==============");
          // System.out.print("Selamat lulus");
          // } else if (nilaiAkhir <= 39) {
          // nilaiHuruf = "E";
          // System.out.println("Nilai akhir " + nilaiAkhir);
          // System.out.println("Nilai huruf " + nilaiHuruf);
          // System.out.println("==============");
          // System.out.print("Selamat lulus");
          // }

          // int n;
          // System.out.print("Masukkan NIM Anda : ");
          // n = sc.nextInt();
          // String nimS = Integer.toString(n);
          // nimS = nimS.substring(nimS.length() - 2);
          // n = Integer.parseInt(nimS);
          // System.out.println("maka n = " + n);
          // int o = 1;
          // int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7;

          // for (int m = 1; m <= n; m++) {
          // if (m == a) {
          // a = a + 7;
          // System.out.print("senin");
          // } else if (m == b) {
          // b = b + 7;
          // System.out.print("selasa ");
          // } else if (m == c) {
          // c = c + 7;
          // System.out.print("rabu ");
          // } else if (m == d) {
          // d = d + 7;
          // System.out.print("kamis ");
          // } else if (m == e) {
          // e = e + 7;
          // System.out.print("jum'at ");
          // } else if (m == f) {
          // f = f + 7;
          // System.out.print("sabtu ");
          // } else if (m == g) {
          // g = g + 7;
          // System.out.print("minggu ");
          // }
          // }

          for (int x = 0; x < arrInt.length; x++) {
               for (int y = 0; y < arrInt.length; y++) {
                    if (y == 0) {
                         aglonema = aglonema + arrInt[x][y];
                    } else if (y == 1) {
                         keladi = keladi + arrInt[x][y];
                    } else if (y == 2) {
                         alocasia = alocasia + arrInt[x][y];
                    } else {
                         mawar = mawar + arrInt[x][y];
                    }
                    if (x == 0) {
                         if (y == 0) {
                              algonemaK = arrInt[x][y] - 1;
                         } else if (y == 1) {
                              keladiK = arrInt[x][y] - 2;
                         } else if (y == 2) {
                              alocasiaK = arrInt[x][y];
                         } else {
                              mawarK = arrInt[x][y] - 5;
                         }
                    }
               }
          }

          // A Jumlah bunga bedasarkan cabang :
          System.out.println("Algonema : " + aglonema);
          System.out.println("Keladi : " + keladi);
          System.out.println("Alocasia  : " + alocasia);
          System.out.println("Mawar  : " + mawar);
          System.out.println("=======================");

          // B
          int totalP = (algonemaK * 75000 + keladiK * 50000 + alocasiaK * 60000 + mawarK * 10000);
          System.out.println("Total penjualan Royal Garden 1 adalah Rp" + totalP);

          // fungsi
          System.out.println("=======================");
          // A
          tampilTableStockBunga();
          System.out.println("=======================");
          // B
          tampilStok();

     }

     static void tampilStok() {
          int arrTampilStok[] = { aglonema - 1, keladi - 2, alocasia, mawar - 5 };
          for (int i = 0; i < arrTampilStok.length; i++) {
               if (i == 0) {
                    System.out.println("Algonema : " + arrTampilStok[i]);
               } else if (i == 1) {
                    System.out.println("Keladi : " + arrTampilStok[i]);
               } else if (i == 2) {
                    System.out.println("Alocasia : " + arrTampilStok[i]);
               } else if (i == 3) {
                    System.out.println("Mawar : " + arrTampilStok[i]);
               }
          }
     }

     static void tampilTableStockBunga() {
          int o = 0;
          for (int a = 0; a < arrStringData.length; a++) {
               System.out.println("");
               System.out.println(arrString[a]);
               for (int b = 0; b < arrStringData.length; b++) {
                    if (o == 0) {
                         System.out.print(arrStringData[b] + " : " + arrInt[o][b] + " \n");
                    } else if (o == 1) {
                         System.out.print(arrStringData[b] + " : " + arrInt[o][b] + " \n");
                    } else if (o == 2) {
                         System.out.print(arrStringData[b] + " : " + arrInt[o][b] + " \n");
                    } else if (o == 3) {
                         System.out.print(arrStringData[b] + " : " + arrInt[o][b] + " \n");
                    }
               }
               o++;
          }
          System.out.println();
     }

     static int algonemaK = 0, keladiK = 0, alocasiaK = 0, mawarK = 0;
     static int aglonema = 0, keladi = 0, alocasia = 0, mawar = 0;
     static int[][] arrInt = {
               { 10, 5, 15, 7 },
               { 6, 11, 9, 12 },
               { 2, 10, 10, 5 },
               { 5, 7, 12, 9 }
     };
     static String[] arrString = { "RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4" };
     static String[] arrStringData = { "Algonema", "Alocasia", "Keladi", "Mawar" };
}
