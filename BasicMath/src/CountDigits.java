public class CountDigits {
    static int count(int n){

        int count = 0;
        int temp_variable = n;
        while(temp_variable != 0){
            temp_variable = temp_variable/10;
            count++;
        }
       return count;
    }

    public static void main(String[] args){
        int n =125689;
        System.out.println("No.of digits: " + count(n));
    }
}
