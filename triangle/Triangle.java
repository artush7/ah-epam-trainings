public class Triangle
{
    static public void triangleOne()
    {
        for(int i = 1;i < 6;i++)
        {
            for(int k = 1;k <= i;k++)
            {
                System.out.print("*");
            }
            
            System.out.print("\n");
            
        }
    }

    static public void triangleTwo()
    {
        for(int i = 0;i < 5;i++)
        {
            for(int k = 5;k > i;k--)
            {
                System.out.print("*");
            }

            System.out.print("\n");
            
        }
    }

    
    static public void triangleThree()
    {
        int g = 1;

        for(int i = 1;i <= 5;i++)
        {
            for(int k = 4;k >= i;k--)
            {
                System.out.print(" ");
            }

            for(int j = 1;j <= g;j++)
            {
                System.out.print("*");
            }
            g = g + 2;

            System.out.print("\n");
            
        }
    }
    public static void main(String[] args) 
    {
        triangleOne();
        System.out.print("\n");
        triangleTwo();
        System.out.print("\n");
        triangleThree();

    }
}