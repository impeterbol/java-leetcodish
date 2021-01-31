// Find all numbers between 100 and 999 that are equal to the sum of the cubes of their digits.  Print out all of your answers in this format:
// 153 = 1^3 + 5^3 + 3^3

import java.util.LinkedList;

public class cubesForNums{
    public static void main(String[] args){

        cubeOfDigits();;
        //end of main
    }

    public static void cubeOfDigits(){
        for(int i = 100;i<=999;i++){
            intToDigits(i);
        }
    }

    public static void intToDigits(int userNum){
       
        int cube;
        int sum=0;
        int j = userNum;

        LinkedList<Integer> stack = new LinkedList<Integer>();
        LinkedList<Integer> cubes = new LinkedList<Integer>();
        
            while (j>0){
                stack.push(j%10);
                j = j/10;
            }
            
            // System.out.println(stack.size());

            for(int i=0;i<stack.size();i++){
                cube=(int) Math.pow(stack.get(i),3);
                cubes.push(cube);
           }

           for(int i =0;i<cubes.size();i++){
               sum = sum+cubes.get(i);
           }
            // System.out.println("This is cubes " + cubes);
            // System.out.println("This is sum " + sum);
            // System.out.println("This is userNum"+userNum);
            if(sum==userNum){
                System.out.println(userNum + " = " + 
                stack.get(0)+"^3 + " +
                stack.get(1)+"^3 + "+ 
                stack.get(2)+"^3 "  );
            }

            //end of into digits
    }
    //end of class
}
