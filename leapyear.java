import java.util.Scanner;

class leapyear
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        int febDays;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            febDays = 29;
        else
            febDays = 28;

        System.out.println("Number of days in February = " + febDays);
    }
}
