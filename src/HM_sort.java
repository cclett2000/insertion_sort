import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class HM_sort {
        void run(String file) throws FileNotFoundException {
            // misc var init
            //int[] data = {5, 3, 1, 6, 2, 4}; // sample dataset for sorting
            int val_counter = 0;

            int i = 0; // loop incrementer
            int key; // current val compare

            // hashmap init
            HashMap<Integer, Integer> samp_data = new HashMap<>();

            // file handler
            File input = new File(file);
            Scanner reader = new Scanner(input);

            // continue to populate hashmap if file has next line
            while (reader.hasNextLine()) {
                // convert string (val from file) to integer
                samp_data.put(i, Integer.parseInt(reader.nextLine())); //populate hashmap (add val to)

                val_counter += 1;
                i++;
            }

            // display - before sort
            System.out.println("[ARRAY]");
            System.out.println("Unsorted data array: \n > " + samp_data);


            // loop to shift position; j may need diff num
            // j = num to insert
            for (int j = 1; j < samp_data.size(); j++) {
                key = samp_data.get(j);

                i = j - 1;

                //shift value if true; val > key
                while (i >= 0 && samp_data.get(i) > key) {
                    // replace ind + 1 with ind in hashmap
                    // TODO: read more into how insertion sort works
                    samp_data.replace(i + 1, samp_data.get(i));

                    // decrement i
                    i = i - 1;
                }

                // replace i + 1 with current val held in key
                samp_data.replace(i + 1, key);
            }

            // display - after sort
            System.out.println("Sorted data array: \n > " + samp_data);

            // info
            System.out.println("\n[INFO]");
            System.out.println(">>> Value Count: " + val_counter);
            System.out.println(">>> " + samp_data.getClass());

        }
    }
