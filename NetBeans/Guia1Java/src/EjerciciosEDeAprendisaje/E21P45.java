package EjerciciosEDeAprendisaje;

import java.util.Scanner;

public class E21P45 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int m[][] = new int[10][10];
        int p[][] = new int[3][3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(m[i][j] + "/");
            }
            System.out.println("");
        }
        System.out.println("Wirte an matrix 3x3 that exist in the previous matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    p[i][j] = read.nextInt();
                    if (!(p[i][j] < 10 && p[i][j] > -1)) {
                        System.out.println("wrong number it has to be below 9 and above 0");
                    }
                } while (!(p[i][j] < 10 && p[i][j] > -1));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(p[i][j] + "/");
            }
            System.out.println("");
        }
        FindMtrix(m, p);
    }

    public static void FindMtrix(int m[][], int p[][]) {
        boolean v = false;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (m[i][j] == p[0][0]) {
                    for (int k = 0; k < 3; k++) {
                        for (int h = 0; h < 3; h++) {
                            if (m[(k + i)][(h + j)] == p[k][h]) {
                                v = true;
                                n1 = i;
                                n2 = j;
                            } else {
                                v = false;
                                break;
                            }
                        }
                        if (v == false) {
                            break;
                        }
                    }
                    if (v == true) {
                        break;
                    }
                }
                if (v == true) {
                    break;
                }
            }
            if (v == true) {
                break;
            }
        }
        if (v == true) {
            System.out.println("This matrix has been found in " + (n1 + 1) + "/" + (n2 + 1));
        } else {
            System.out.println("This matrix hasn´t been found");
        }
    }
}
