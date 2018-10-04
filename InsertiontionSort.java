

class InsertionSort {

    static int[] arr = new int[]{7,6,4,5,1,3,2};
    public static void insertionSort(){
       int out, in;
        for(out = 1; out< arr.length; out++){
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in-1] >= temp) {

                arr[in] = arr[in-1];

                --in;
            }
                System.out.println(in);
               arr[in] = temp;

            }

        }



    public static void display(){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }



    public static void main(String[] args) {

        insertionSort();
        display();
    }
}
