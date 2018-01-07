// Save the following program as Grades.java// For this program, we’ll let Exams count for 50% of the grade // Quizzes count as 20% and Assignments count as 30%// Import any needed package(s)//Start the Grades class   // Start the main method// Declare and assign local variables// Please note that for this program we have 5 students// For now, let’s also have 5 variables for Exams, such as Exam1, Exam2, // Similarly, Have 5 variables for Quizzes, such as Quiz1, Quiz2, .....// Five Assignment variables and 5 Grade variables// Starting with Student1, prompt the user for Exam1, Quiz1, and Assignment1 // Print the proper header line// Prompt the user for input values// Calculate Grade1 and print the name and grades for Student1      // Repeat the above process for each Student   // End main method// End class
import java.util.Scanner;
public class Grades
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
String student1;
double exam1;
double quiz1;
double assignment1;
System.out.print("Please enter Student1's name: ");
student1 = input.next();
System.out.print("Now, please enter Student1's Exam Grade: ");
exam1 = input.nextDouble();
System.out.print("Now, please enter Student1's Quiz Grade: ");
quiz1 = input.nextDouble();
System.out.print("Finally, enter Student1's Assignment Grade: ");
assignment1 = input.nextDouble();
System.out.println("Name \t\t Exam \t\t Quizzes \t\t Assignment \t Class Grade");
System.out.printf("%s \t %.0f \t\t %.0f \t\t\t %.0f \t\t %.2f \n", student1, exam1, quiz1, assignment1, ((.5 * exam1) + (.2 * quiz1) + (.3 * assignment1)));

String student2;
double exam2;
double quiz2;
double assignment2;
System.out.print("Please enter Student2's name: ");
student2 = input.next();
System.out.print("Now, please enter Student2's Exam Grade: ");
exam2 = input.nextDouble();
System.out.print("Now, please enter Student2's Quiz Grade: ");
quiz2 = input.nextDouble();
System.out.print("Finally, enter Student2's Assignment Grade: ");
assignment2 = input.nextDouble();
System.out.println("Name \t\t Exam \t\t Quizzes \t\t Assignment \t Class Grade");
System.out.printf("%s \t %.0f \t\t %.0f \t\t\t %.0f \t\t %.2f \n", student2, exam2, quiz2, assignment2, ((.5 * exam2) + (.2 * quiz2) + (.3 * assignment2)));

String student3;
double exam3;
double quiz3;
double assignment3;
System.out.print("Please enter Student3's name: ");
student3 = input.next();
System.out.print("Now, please enter Student3's Exam Grade: ");
exam3 = input.nextDouble();
System.out.print("Now, please enter Student3's Quiz Grade: ");
quiz3 = input.nextDouble();
System.out.print("Finally, enter Student3's Assignment Grade: ");
assignment3 = input.nextDouble();
System.out.println("Name \t\t Exam \t\t Quizzes \t\t Assignment \t Class Grade");
System.out.printf("%s \t %.0f \t\t %.0f \t\t\t %.0f \t\t %.2f \n", student3, exam3, quiz3, assignment3, ((.5 * exam3) + (.2 * quiz3) + (.3 * assignment3)));

String student4;
double exam4;
double quiz4;
double assignment4;
System.out.print("Please enter Student4's name: ");
student4 = input.next();
System.out.print("Now, please enter Student4's Exam Grade: ");
exam4 = input.nextDouble();
System.out.print("Now, please enter Student4's Quiz Grade: ");
quiz4 = input.nextDouble();
System.out.print("Finally, enter Student4's Assignment Grade: ");
assignment4 = input.nextDouble();
System.out.println("Name \t\t Exam \t\t Quizzes \t\t Assignment \t Class Grade");
System.out.printf("%s \t %.0f \t\t %.0f \t\t\t %.0f \t\t %.2f \n", student4, exam4, quiz4, assignment4, ((.5 * exam4) + (.2 * quiz4) + (.3 * assignment4)));

String student5;
double exam5;
double quiz5;
double assignment5;
System.out.print("Please enter Student5's name: ");
student5 = input.next();
System.out.print("Now, please enter Student5's Exam Grade: ");
exam5 = input.nextDouble();
System.out.print("Now, please enter Student5's Quiz Grade: ");
quiz5 = input.nextDouble();
System.out.print("Finally, enter Student5's Assignment Grade: ");
assignment5 = input.nextDouble();
System.out.println("Name \t\t Exam \t\t Quizzes \t\t Assignment \t Class Grade");
System.out.printf("%s \t %.0f \t\t %.0f \t\t\t %.0f \t\t %.2f \n", student5, exam5, quiz5, assignment5, ((.5 * exam5) + (.2 * quiz5) + (.3 * assignment5)));
}
}