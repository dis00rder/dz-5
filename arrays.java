public class arrays {
    public static void main(String[] args) {
        int arrays [] = {8,2,3,4,5,6,7};
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] %2 == 0) {
                sum += arrays[i];
            }

        }
        System.out.println(sum);
    }

}


