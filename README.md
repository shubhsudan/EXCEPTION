# EXCEPTION
EXCEPTION IS DIVIDED INTO 2 PARTS

Part 1: Java Program to find the factorial of 'n' integers
Class Definitions
FactorialException
A user-defined exception class that extends the built-in Exception class. It has one instance variable number and two methods:

FactorialException(int number): a constructor that takes an integer as an argument and initializes the instance variable number.
toString(): an overridden method that returns a string representation of the exception message. It displays the invalid input number that had generated the exception.
ExceptionDemo
The main class that contains the main method. It takes command-line arguments as input and calls the factorial() method to calculate the factorial of each input number. It has one method:

factorial(int n): a static method that calculates the factorial of an integer n using recursion.
Method Definitions
main(String[] args)
The main method that takes command-line arguments as input and calls the factorial() method to calculate the factorial of each input number. It has two catch blocks to handle two types of exceptions:

NumberFormatException: thrown when the command-line argument is not a valid integer.
FactorialException: a user-defined exception that is thrown when the input number is not between 0 and 15.
factorial(int n)
A static method that calculates the factorial of an integer n using recursion. It returns a long integer.

Part 2: Demo program to use the user-defined exception NOMATCHEXCP
Class Definitions
NOMATCHEXCP
A user-defined exception class that extends the built-in Exception class. It has one instance variable inputString and two methods:

NOMATCHEXCP(int lineNumber, String inputString): a parameterized constructor that takes the line number and the erroneous string inputted by the user as arguments and initializes the instance variable inputString.
getMessage(): an overridden method that returns a string representation of the exception message. It displays the line number and the erroneous string that was inputted by the user.
NOMATCHEXCPDemo
The main class that contains the main method. It takes input from the user and throws the NOMATCHEXCP exception if the input string is not equal to "India".

Method Definitions
main(String[] args)
The main method that takes user input and throws the NOMATCHEXCP exception if the input string is not equal to "India". It has one catch block to handle the NOMATCHEXCP exception.
