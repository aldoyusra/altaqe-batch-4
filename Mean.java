public class Mean {
    public static float Mean(float[] number){

        float sum = 0;
        for(int i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        float rata_rata = sum / number.length;
                return rata_rata;
    }

    public static void main(String[] args) {
        float[] array = {1,2,3,4};
        System.out.println(Mean(array));
    }
}