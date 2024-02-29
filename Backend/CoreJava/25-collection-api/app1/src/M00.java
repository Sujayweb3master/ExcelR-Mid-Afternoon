class M00 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 22};

        int[] arr1 = new int[10];

        for(int i : arr1 ) {
            System.out.println(i);
        }

        arr1[0] = 23;

        System.out.println(arr[0]);
    }
}