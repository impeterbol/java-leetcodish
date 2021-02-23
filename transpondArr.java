import java.net.Socket;
import java.util.Arrays;

public class AndreaTaskFeb22 {
    public static void main(String[] args){
        //    test array
        int [][] matrix = new int[][] {{  1,   2,   3,   4,   5},
        {  6,   7,   8,   9, 10}, 
        { 11, 12, 13, 14, 15}, 
        { 16, 17, 18, 19, 20}, 
        { 21, 22, 23, 24, 25}};
        // 
        
        transpond(matrix, printArr(matrix));

                                             //end of main
    }

    public static int[] printArr(int[][] someArr){
        System.out.println();
        System.out.println("ORIGINAL ARRAY ");
        System.out.println();
        int r =0;
        int c = 0;
        for(int rows=0;rows<someArr.length;rows++){
            for(int cols=0;cols<someArr[rows].length;cols++){
                c++;
                System.out.print(someArr[rows][cols]+" ");
            }
            r++;
            System.out.println(); //goign to the next row
        }
        int [] rowsCols = new int[2];
        rowsCols[0]=r;
        rowsCols[1]=c/r;
        // System.out.println("There are: rows "+r+" and cols "+c/r);
        return rowsCols;
        //end of printarr
    }


    public static int [][] transpond(int[][] someArr, int[] rowsCols){
        System.out.println();
        System.out.println("TRANSPONDED");
        System.out.println();
        int [][] transp = new int[rowsCols[1]][rowsCols[0]];

        for(int rowS=0,rowN=0;rowS<someArr.length;rowS++,rowN++){
            for(int colS=0,colN=0;colS<someArr[rowS].length;colS++,colN++){
                transp[rowN][colN]=someArr[colS][rowS];
                    System.out.print(someArr[colS][rowS]+" ");
            }
            System.out.println();
        }
     return transp;
        //end of transponded
    }
    //end of class
}
