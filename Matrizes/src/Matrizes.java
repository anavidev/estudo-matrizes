public class Matrizes {

    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];

        matriz1[0][0] = 1;
        matriz1[0][1] = 2;
        matriz1[1][0] = 3;
        matriz1[1][1] = 4;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] matriz2 = new int[3][3];

        matriz2[0][0] = 1;
        matriz2[0][1] = 2;
        matriz2[0][2] = 3;
        matriz2[1][0] = 4;
        matriz2[1][1] = 5;
        matriz2[1][2] = 6;
        matriz2[2][0] = 7;
        matriz2[2][1] = 8;
        matriz2[2][2] = 9;

        for (int a = 0; a < matriz2.length; a++) {
            for (int b = 0; b < matriz2[a].length; b++) {
                System.out.print(matriz2[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

}