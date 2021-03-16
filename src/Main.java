// Program to illustrate a simple Bubble Sort
//
// David John
// November 14, 2017
//
// Simplified parameters
// Included Random class
// Added populate()
// March 2021

import java.util.Random;

public class Main {

    private static Random rand;
    private static int count;

    // routine to initialize an array of doubles
    // to random values
    private static double[] populate(int N){
        double [] temp = new double[N];
        for(int i=0; i<N;i++){
            temp[i] = rand.nextDouble();
        }
        return temp;
    }

    // create array, call bubble, dump result to screen
    public static void main(String[] args) {



        rand = new Random();


        double [] myValues = populate(16);

        count = 0;

        bubble(myValues);

        System.out.println("\n\nBubble sort completed using "+count+" comparisons\n");

        Dump(myValues);
    }

    // method to dump result to the screen
    public static void Dump(double [] XXX)
    {
        for(double xxx : XXX)
        {
            System.out.println( xxx);
        }

        return;
    }

    // Simple bubble sort -- puts array into descending
    // order
    public static void bubble(double [] ABC)
    {

        // fill the cells in the order 0, 1, ..., ABCsize-1
        for(int celltofill = 0; celltofill< ABC.length-2; celltofill++)
        {

            // filling in ABC[celltofill] with largest of
            // ABC[celltofill ... ABCSize-1]
            for(int current = ABC.length-1; current>celltofill;current--)
            {

                // if these two adjacent cells are in the
                // wrong order then swap them
                count++;
                if (ABC[current] >  ABC[current-1])
                {
                    double temp = ABC[current];
                    ABC[current] = ABC[current-1];
                    ABC[current-1] = temp;

                }
            }


        }

        return;

    }
}
