

class SelectionSort {

    static int[] arr = new int[]{7,6,4,5,1,3,2};
    public static void selectionSort(){
       int out, in, min;
        for(out = 0; out< arr.length -1; out++){
            min = out;
            for (in = out + 1; in < arr.length; in++) {
                if (arr[in] < arr[min])
                    min = in;
            }
                swap(out, min);
        }

    }

    public static void swap(int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void display(){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }



    public static void main(String[] args) {

        selectionSort();
        display();
    }
}
