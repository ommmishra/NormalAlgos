
class BinarySearch {

    public static int findByBinarySearch(int[] arr, int n, int key){
        int lowerBound = 0;
        int upperBound = n-1;
        while (true) {
            int current = (lowerBound+upperBound)/2;
            if (arr[current]==key)
                return current+1; //This here is done to return the exact position of the element.
            else if(lowerBound>current)
                return -1;
            else
                if(arr[current]<key)
                    lowerBound = current+1;
                else
                    upperBound = current -1;
        }
        }





    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(findBybinarySearch(arr, arr.length, 7));

    }
}
