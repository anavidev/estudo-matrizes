import java.util.Scanner;

public class PreenchendoMatrizes {
    public static void main(String[] args) throws Exception {

        // preenchendo matriz 2x2
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int[][] matriz3 = new int[2][2];

        System.out.print("Informe n1: ");
        int resp1 = sc.nextInt();
        System.out.print("Informe n2: ");
        int resp2 = sc.nextInt();
        System.out.print("Informe n3: ");
        int resp3 = sc.nextInt();
        System.out.print("Informe n4: ");
        int resp4 = sc.nextInt();

        matriz3[0][0] = resp1;
        matriz3[0][1] = resp2;
        matriz3[1][0] = resp3;
        matriz3[1][1] = resp4;

        for (int x = 0; x < matriz3.length; x++) {
            for (int y = 0; y < matriz3[x].length; y++) {
                System.out.print(matriz3[x][y] + " ");
            }
            System.out.println();
        }
        sc.close();

    }

}
