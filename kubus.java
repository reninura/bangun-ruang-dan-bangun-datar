package bangunruang;

import java.util.Scanner;
        public class kubus {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Menghitung Volume dan Luas Kubus");
                System.out.print("sisi           : ");
                int s = input.nextInt();
                System.out.print("Luas permukaan    : "+ (6*s*s) + "\n");
                System.out.println("Volume          : " + (s*s*s));


            }
        }
