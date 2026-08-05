package secao10_arrays.application;

import java.util.Scanner;

public class MatrixExercise01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many lines and columns you want to enter? ");
        int n = sc.nextInt();
        int [][] mat = new int [n][n];
        System.out.println();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print("Enter values for line "+ (i + 1) + " Column " +(j + 1) +": ");
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

        int counter = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    counter++;
                }
            }
        }
        System.out.println("Negative numbers: " + counter);

        sc.close();

    }

}
