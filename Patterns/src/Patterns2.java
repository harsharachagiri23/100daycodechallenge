public class Patterns2 {
    static void Pattern2(int n){

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        int n =3;
        Pattern2(n);
    }
}
