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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // adds initial numbers to the heap sorting each time it adds
        Heap.insert(15);
        Heap.insert(5);
        Heap.insert(8);
        Heap.insert(4);
        Heap.insert(9);
        Heap.insert(22);
        Heap.insert(17);
        Heap.insert(6);
        Heap.insert(14);
        
        // prints the heap in the form of an array
        Heap.print();
        
        // removes the root from the heap and sorts each time (runs twice)
        Heap.remove(2);
        
        // prints the heap in the form of an array
        Heap.print();
        
        // adds numbers to the heap sorting each time
        Heap.insert(18);
        Heap.insert(12);
        
        // prints the heap in the form of an array
        Heap.print();
        
        // removes the root from the heap and sorts each time (runs thrice)
        Heap.remove(3);
        
        // prints the heap in the form of an array
        Heap.print();
    }
    
}
