/*
 * Charles Lett Jr.
 * Software Engineering
 * September 21, 2021
 * Sample implementation of insertion sort algorithm (now using HashMap!)
 */

import java.io.FileNotFoundException;
import java.text.DecimalFormat;

class run {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Starting Program...\n");

        // init
        long startTime = System.currentTimeMillis();
        HT_sort HT = new HT_sort();
        HM_sort HM = new HM_sort();

        // 0 == HashTable, 1 == HashMap
        int dType = 1;

        // specify which method to use
        // file to use:
        // - valid names: 'sample_9.txt', 'sample_500.txt', 'sample_662978.txt'
        String file = "sample_500.txt";
        int val_count;
        switch (dType) {
            case 0 -> HT.run(file);
            case 1 -> HM.run(file);
        }

        //end runtime record
        long endTime = System.currentTimeMillis();

        // format/display final stat message(s)
        DecimalFormat f = new DecimalFormat("#.00");
        long runtime = (endTime - startTime);
        double used_mem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println(">>> Runtime: " + runtime + " ms");
        System.out.println(">>> Memory Usage: " + f.format(used_mem / Math.pow(10, 6)) + " MB");

        System.out.println("\nDone.");

        }
    }