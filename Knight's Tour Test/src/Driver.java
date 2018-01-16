import java.io.*;
import java.util.*;

/*
public class Driver {
	
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter board size (8 for 8x8):");
		int size = in.nextInt();
		
		System.out.print("Enter beginning square (1 to " + (size * size) + "):");
		int start = in.nextInt();
		int startX = start / size;
		int startY = start % size;
		Dfs attempt = new Dfs(startX, startY, size);
	}
	
	
}

class Dfs{
	Coordinate root;
	Coordinate current;
	Coordinate after;
	ArrayList workList;
	int board[][];
	int size;
	
	public Dfs(int indexX, int indexY, int inSize){
		root = new Coordinate(indexX, indexY, null);
		size = inSize;
		board = new int[size][size];
		processKnightTour(indexX, indexY);
	}
	
	public void processKnightTour(int indexX, int indexY){
	    System.out.println(indexX);
	    System.out.println(indexY);
	    int[] x={2,2,-2,-2,1,1,-1,-1};
	    int[] y={1,-1,1,-1,2,-2,2,-2};
	    int countPath=0;
	    workList = new ArrayList();
	    board[indexX][indexY] = 1;
	    workList.add(new Coordinate(indexX, indexY, null));
	    current =(Coordinate) workList.get(workList.size()-1);
	    boolean statusChild;
	    while(board[current.row][current.column] != (size * size)){
	        statusChild = false;
	        for(int loop=0; loop<8; loop++){
	            if(current.row+x[loop]>=0 && current.row+x[loop]<=size && current.column+y[loop]>=0 && current.column+y[loop]<=size){
	                if(board[(current.row+x[loop])][(current.column+y[loop])]==0){
	                    workList.add(new Coordinate(current.row+x[loop], current.column+y[loop], current));
	                    statusChild = true;
	                }                    
	            }
	        }
	        if(statusChild == true){
	            workList.remove(workList.indexOf(current));
	        }else{
	            if(workList.size()-2 >= 0){
	                after = (Coordinate) workList.get(workList.size()-2);
	                if(current.boardParent.equals(after.boardParent)){

	                }else{
	                    board[current.boardParent.row][current.boardParent.column] = 0;
	                }
	            }
	            board[current.row][current.column] = 0;                
	            workList.remove(workList.size()-1);
	        }
	        current = (Coordinate) workList.get(workList.size()-1);
	        board[current.row][current.column] = (board[current.getParent().row][current.getParent().column])+1;
	        countPath++;
	        System.out.println(current.row + ", " + current.column);
	        //System.out.println(countPath+", "+workList.size()+", "+board[current.column][current.row]);
	    }
	}
}

class Coordinate{
	int row;
	int column;
	Coordinate boardParent;
	
	public Coordinate(int inX, int inY, Coordinate inboard){
		row = inX;
		column = inY;
		boardParent = inboard;
	}
	
	public Coordinate getParent(){
		return boardParent;
	}
}
*/

class Driver {
    static int N = 8;
 
    /* A utility function to check if i,j are
       valid indexes for N*N chessboard */
    static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0 &&
                y < N && sol[x][y] == -1);
    }
 
    /* A utility function to print solution
       matrix sol[N][N] */
    static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++)
                System.out.print(sol[x][y] + " ");
            System.out.println();
        }
    }
 
    /* This function solves the Knight Tour problem
       using Backtracking.  This  function mainly
       uses solveKTUtil() to solve the problem. It
       returns false if no complete tour is possible,
       otherwise return true and prints the tour.
       Please note that there may be more than one
       solutions, this function prints one of the
       feasible solutions.  */
    static boolean solveKT() {
        int sol[][] = new int[8][8];
 
        /* Initialization of solution matrix */
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;
 
       /* xMove[] and yMove[] define next move of Knight.
          xMove[] is for next value of x coordinate
          yMove[] is for next value of y coordinate */
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
 
        // Since the Knight is initially at the first block
        sol[0][0] = 0;
 
        /* Start from 0,0 and explore all tours using
           solveKTUtil() */
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        } else
            printSolution(sol);
 
        return true;
    }
 
    /* A recursive utility function to solve Knight
       Tour problem */
    static boolean solveKTUtil(int x, int y, int movei,
                               int sol[][], int xMove[],
                               int yMove[]) {
        int k, next_x, next_y;
        if (movei == N * N)
            return true;
 
        /* Try all next moves from the current coordinate
            x, y */
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1,
                                sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y] = -1;// backtracking
            }
        }
 
        return false;
    }
 
    /* Driver program to test above functions */
    public static void main(String args[]) {
        solveKT();
    }
}
