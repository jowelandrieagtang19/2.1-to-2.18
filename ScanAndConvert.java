//Jowel Andrie Agtang
//BSIT NETSEC 1-1
package scanandconvert;
import java.util.Scanner;
public class ScanAndConvert 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Java grade: ");
        double javaGrade = input.nextDouble();
        System.out.print("Enter C++ grade: ");
        double cppGrade = input.nextDouble();
        System.out.print("Enter C# grade: ");

        double csharpGrade = input.nextDouble();
        double average = (javaGrade + cppGrade + csharpGrade) / 3;
        System.out.println("Java grade: " + javaGrade);
        System.out.println("C++ grade: " + cppGrade);
        System.out.println("C# grade: " + csharpGrade);
        System.out.println("Total average: " + average);
    }
}