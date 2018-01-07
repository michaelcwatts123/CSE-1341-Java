// Save the following program as AsciiValues.java // Import any needed package(s)// Start the AsciiValues class// Start the main method ---// Declare and assign local variable(s), such as int iDecimal = 0/*Print the header line using the escape character \t as a tab ---Such as .....println(“Character \t Decimal \t Binary \t Octal \t //Hexadecimal \t\t\t Character \t Decimal \t Binary \t Octal \tHexadecimal”);*//*For Characters A though F and a through f print out the character, decimal //value, binary value, octal value and Hex value for the character in capital and lower case Note: Use casting to convert a char character to an int representing its ASCII Value. E.g., (int)’<character>’For the Binary use Integer.toBinaryString(iDecimal)For the Octal use Intege.toOctalString(iDecimal)For the Hex use Integer.toHexString(iDecimal)*/// End main method// End classpublic class AsciiValues
{public static void main(String[] args)
{
int A = (int) 'A';
int B = (int) 'B';
int C = (int) 'C';
int D = (int) 'D';
int E = (int) 'E';
int F = (int) 'F';

int a = (int) 'a';
int b = (int) 'b';
int c = (int) 'c';
int d = (int) 'd';
int e = (int) 'e';
int f = (int) 'f';
System.out.println("Character \t Decimal \t Binary \t Octal \t Hexadecimal \t\t\t Character \t Decimal \t Binary \t Octal \t Hexadecimal");
System.out.printf("A \t\t %d \t\t %s \t %s \t %s \t\t\t\t a \t\t %d \t\t %s \t %s \t %s \n", A, Integer.toBinaryString(A), Integer.toOctalString(A), Integer.toHexString(A), a, Integer.toBinaryString(a), Integer.toOctalString(a), Integer.toHexString(a));

System.out.printf("B \t\t %d \t\t %s \t %s \t %s \t\t\t\t b \t\t %d \t\t %s \t %s \t %s \n", B, Integer.toBinaryString(B), Integer.toOctalString(B), Integer.toHexString(B), b, Integer.toBinaryString(b), Integer.toOctalString(b), Integer.toHexString(b));

System.out.printf("C \t\t %d \t\t %s \t %s \t %s \t\t\t\t c \t\t %d \t\t %s \t %s \t %s \n", C, Integer.toBinaryString(C), Integer.toOctalString(C), Integer.toHexString(C), c, Integer.toBinaryString(c), Integer.toOctalString(c), Integer.toHexString(c));

System.out.printf("D \t\t %d \t\t %s \t %s \t %s \t\t\t\t d \t\t %d \t\t %s \t %s \t %s \n", d, Integer.toBinaryString(D), Integer.toOctalString(D), Integer.toHexString(D), d, Integer.toBinaryString(d), Integer.toOctalString(d), Integer.toHexString(d));

System.out.printf("E \t\t %d \t\t %s \t %s \t %s \t\t\t\t e \t\t %d \t\t %s \t %s \t %s \n", E, Integer.toBinaryString(E), Integer.toOctalString(E), Integer.toHexString(E), e, Integer.toBinaryString(e), Integer.toOctalString(e), Integer.toHexString(e));

System.out.printf("F \t\t %d \t\t %s \t %s \t %s \t\t\t\t f \t\t %d \t\t %s \t %s \t %s \n", F, Integer.toBinaryString(F), Integer.toOctalString(F), Integer.toHexString(F), f, Integer.toBinaryString(f), Integer.toOctalString(f), Integer.toHexString(f));




}
}