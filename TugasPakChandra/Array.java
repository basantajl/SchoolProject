package com.mycompany.soal3pakcha;
public class Array {
    public static void main(String[] args) {
        int m = 5;
        int n = 8;
        int[][] result = fillTwoDList(m, n);
        printTwoDList(result);
    }
    
    public static int[][] fillTwoDList(int m, int n) {
        int[][] result = new int[n][m];
        
     
        for (int i = 0; i < m; i++) {
            result[0][i] = 1;
            result[n - 1][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            result[i][0] = 1;
            result[i][m - 1] = 1;
        }
        
        
        int num = 2;
        int rowStart = 1;
        int rowEnd = n - 2;
        int colStart = 1;
        int colEnd = m - 2;
        while (rowStart <= rowEnd && colStart <= colEnd) {
           
            for (int i = colStart; i <= colEnd; i++) {
                result[rowStart][i] = num;
                result[rowEnd][i] = num;
            }
           
            for (int i = rowStart + 1; i < rowEnd; i++) {
                result[i][colStart] = num;
                result[i][colEnd] = num;
            }
            
            num++;
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        
        return result;
    }
    
    public static void printTwoDList(int[][] list) {
        for (int[] row : list) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

