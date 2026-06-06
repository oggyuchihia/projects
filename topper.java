public import java.util.Scanner;

class topper
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        String topperName = "";
        int highestMarks = 0;
        for(int i = 1; i <= n; i++)
        {
            System.out.print("Enter student name: ");
            String name = sc.next();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            if(marks > highestMarks)
            {
                highestMarks = marks;
                topperName = name;
            }
        }
        System.out.println("Topper: " + topperName);
        System.out.println("Marks: " + highestMarks);
    }
} {
    
}
