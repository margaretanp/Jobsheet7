import java.util.Scanner;

public class DoWhileCuti19_2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
    String konfirmasi;

    System.out.print("Jatah Cuti: ");
    jatahCuti = sc.nextInt();

    do {
        System.out.print("Apakah Anda ingin mengambil cuti (ya/tidak)? ");
        konfirmasi = sc.next();

        if (konfirmasi.equalsIgnoreCase("ya")) {
            System.out.print("Jumlah Hari: ");
            jumlahHari = sc.nextInt();

            if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa Jatah Cuti: " + jatahCuti);
            } else {
                System.out.println("Sisa jatah cuti Anda tidak mencukupi");
            }
        }else {
            break;
        }
    } while (jatahCuti > 0);
    }
}  
