
public class BubbleSort {
    public static void main(String[] args) {
        int x [] = {38,23,32,14,7};
        int temp;
        for (int i = 0; i<x.length-1; i++) {
            for (int j=0; j<x.length-1; j++) {
                if (x[j] > x[j+1]) {
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        for (int i : x) {
            System.out.print(i + " ");
        }
    }
}

