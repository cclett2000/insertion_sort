/*
 * Charles Lett Jr.
 * Software Engineering
 * September 21, 2021
 * Sample implementation of insertion sort algorithm (now using HashMap!)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class insert_alg {
    public static void main(String[] args) throws FileNotFoundException {
        // misc var init
        //int[] data = {5, 3, 1, 6, 2, 4}; // sample dataset for sorting
        int str2int = 0; //store/convert str to int
        int i = 0; // loop incrementer
        int key = 0; // current val compare

        // hashmap init
        HashMap<Integer, Integer> samp_data = new HashMap<Integer, Integer>();

        // file handler
        File input = new File("FILE INPUT PATH HERE");
        Scanner reader = new Scanner(input);

        // continue to populate hashmap if file has next line
        while (reader.hasNextLine()){
            // convert string (val from file) to integer
            str2int = Integer.parseInt(reader.nextLine());
            samp_data.put(i, str2int); //populate hashmap (add val to)

            i++;
        }

        // display - before sort
        System.out.println("Unsorted data array: " + samp_data);

        // loop to shift position; j may need diff num
        // j = num to insert
        for(int j = 1; j < samp_data.size(); j++){
            key = samp_data.get(j);

            i = j - 1;

            //shift value if true; val > key
            while (i > 0 && samp_data.get(i) > key){
                // replace ind + 1 with ind in hashmap
                samp_data.replace(i + 1, samp_data.get(i));

                // decrement i
                i = i - 1;
            }

            // replace i + 1 with current val held in key
            samp_data.replace(i + 1, key);
        }

        // display - after sort
        System.out.println("Sorted data array: " + samp_data);

    }
}
