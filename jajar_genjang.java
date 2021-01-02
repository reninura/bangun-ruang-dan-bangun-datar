package bangundatar;

import java.util.Scanner;
        public class jajar_genjang {

            public static void main(String[] args) {
                Scanner nilai = new Scanner (System.in);
                int alas , tinggi ;
                int Luas , Keliling ;

                System.out.println("Masukan alas = ");
                alas = nilai.nextInt();
                System.out.println("Masukan tinggi = ");
                tinggi = nilai.nextInt();

                Keliling = 2*alas + 2*tinggi;
                System.out.println("Keliling jajar genjang = "+Keliling);
                Luas = alas * tinggi;
                System.out.println("Luas jajar genjang = "+Luas);
            }

        }