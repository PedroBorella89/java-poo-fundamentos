package secao10_arrays.application;

import java.util.Scanner;

public class MatrixExercise02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many lines you want to enter? ");
        int lines = sc.nextInt();
        System.out.print("How many columns you want to enter? ");
        int columns = sc.nextInt();
        int [][] mat = new int [lines][columns];
        System.out.println();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Line " + (i + 1) + " Column " + (j + 1) + ":");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Matrix");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int even = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] % 2 == 0){
                    even++;
                }
            }
        }

        int odd = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] % 2 != 0){
                    odd++;
                }
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        sc.close();

    }
}
