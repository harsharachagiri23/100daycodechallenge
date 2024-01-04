public class Patterns5 {
    static void Pattern5(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = n; j > i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        int n = 6;
        Pattern5(n);
    }
}
