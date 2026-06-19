package triangle;

public class Triangle
{
    public static void triangleOne()
    {
        for(int i = 0;i < 5;i++)
        {
            for(int k = 1;k <= i;k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
            
        }
    }

    public static void triangleTwo()
    {
        for(int i = 0;i < 5;i++)
        {
            for(int k = 5;k > i;k--)
            {
                System.out.print("*");
            }

            System.out.println();
            
        }
    }

    
    public static void triangleThree()
    {

        for(int i = 1;i <= 5;i++)
        {
            for(int k = 4;k >= i;k--)
            {
                System.out.print(" ");
            }

            for(int j = 1;j <= ((2 * i) - 1);j++)
            {
                System.out.print("*");
            }

            System.out.println();
            
        }
    }
    public static void main(String[] args) 
    {
        triangleOne();
        System.out.println();
        triangleTwo();
        System.out.println();
        triangleThree();
        

    }
}
