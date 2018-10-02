

class BubbleSort {

    static int[] arr = new int[]{7,6,4,5,1,3,2};
    public static void SortByBubbleSort(){
       int i,j;
        for(i =arr.length-1; i>1; i-- )
            for (j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(j, j + 1);
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

        SortByBubbleSort();
        display();
    }
}
