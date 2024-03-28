class IterateArray {
    public static void main(String[]ar){
        int []arr={1,2,3,4,5,6,7};
        System.out.println("The elements are:");
        for(int i:arr){
            System.out.println(i);

        }
        ComArray co = new ComArray();
        System.out.println("The elements of next class are");
        for (int i:co.arr3){
            System.out.printf("%d\t",i);
        }

    }

    
}