import java.util.ArrayList;
import java.util.List;

public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        int size = mat.length * mat[0].length;
        double sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
        }
        double mean = sum / size;
        return mean;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) {
        // Convert the 2d array list to a double arraylist
        List<Double> list = new ArrayList<Double> (); 
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                list.add(mat[i][j]);
            }
        }
        int size = list.size();
        // locate the index of the middle number
        int middle = size / 2;
        double median = 0.0;
        // Check to see if the arraylist is odd or even
        // and then find the median(middle number)
        if (size % 2 == 1) {
            median = list.get(middle);
        }
        else if (size % 2 == 0) {
            median = (list.get(middle - 1) + list.get(middle)) / 2;
        }
        return median;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // Set up the frequncy of the number appear in the array
        int [] frequency_of_num = new int [100];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int val = (int) mat[i][j];
                frequency_of_num[val] += 1;
            }
        }
        // Check to find the most repeated number
        int biggest_num = 0;
        int mode = -1;
        for (int i = 1; i < 100; i++) {
            if (frequency_of_num[i] < biggest_num) {
                biggest_num = frequency_of_num[i];
                mode = i;
            }
        }
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
