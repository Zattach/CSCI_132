/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author zach
 */
public class Heap {
    // creates array to store heap
    static int hp[] = new int[25];
    static int k = 0;
    
    // insert method takes in which number to add and sorts each time it
    // takes in a new number
    public static void insert(int add){
        if(hp[k] != 0){
            k++;
            insert(add);
        } else {
            hp[k] = add;
        }
        while(hp[k] > hp[(k-1)/2]){
            int temp = hp[k];
            hp[k] = hp[(k-1)/2];
            hp[(k-1)/2] = temp;
            k = (k-1)/2;
        }
        k = 0;
    }
    
    // remove method takes input for how many times to run method, 
    // removes one number at a time, and sorts the heap each time it runs
    public static void remove(int run){
        int times = 0;
        do{
            while(hp[k] != 0){
                k++;
            }
            hp[0] = hp[k - 1];
            hp[k - 1] = 0;
            k = 0;
            while(hp[k] < hp[2 * k+1] || hp[k] < hp[2 * k+2]){
                if(hp[2 * k + 2] < hp[2 * k+1]){
                    int temp = hp[k];
                    hp[k] = hp[2 * k+1];
                    hp[2 * k+1] = temp;
                    k = 2 * k + 1;
                }else if(hp[2 * k + 1] < hp[2 * k+2]){
                    int temp = hp[k];
                    hp[k] = hp[2 * k+2];
                    hp[2 * k+2] = temp;
                    k = 2 * k + 2;
                }
            }
        times++;
        } while(times < run);
    }
    
    // prints out heap in the form of an array
    public static void print(){
        int i;
        for(i = 0; hp[i+1] != 0; i++){
            System.out.print(hp[i] + ", ");
        }
        System.out.println(hp[i]);
    }
}
