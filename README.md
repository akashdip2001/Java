# Java-Syntax

| [Download JDK](https://www.oracle.com/in/java/technologies/downloads/) | JDK LTS 7-11-1 

package com.codewithharry;

Java Notes For Quick Reference!
1. // [comment]
Single line comment.

```java
// Hi, i am Akashdip
```

2. /* [comment] */
Multi line comment.

```java
/*
 Hi, i am Akashdip
4th Year Colledge student
*/
```

3. `public`
This can be imported publically.

```java
public class Main {
}
```

5. import [object].*
Imports everything in object.

6. static
Going to be shared by every [object].

7. final
Cannot be changed; common to be defined with all uppercase.

8. double
Integer with numbers that can have decimals.

9. ;
Put after every command.

10. String
Just a string of characters.

11. Private
Can only be changed by a method.

12. int
Can store numbers from 2^-31 to 2^31.

13. fields are attributes

14. boolean
Can have true or false as the value.

15. { }
These are used to start and end a function, class, etc.

16. byte
These can store from -127 - 128.

17. long
Can store numbers from 2^127 to 2^-127.

18. char
Just lets you put in one chracter.

19. double
64-bit number with decimals.

20. float
32-bit number with decimals.

21. protected
Can only be accessed by other code in the package.

22. Scanner
This lets you get user input.

23. new [object constructor]
This will let you create a new object.

24. System.in
This lets you get data from the keyboard.

25. public [class]()
This will be the constructor, you use it to create new objects.

26. super()
This will create the superclass (the class it's inheriting).

27. extends [class]
Makes the object a subclass of [object], [object] must be a superclass.

28. ++
Will increment the amount.

29. --
Will decrement the amount.

30. += [amount]
Increment by [amount]

31. -= [amount]
Decrement by [amount]

32. *= [amount]
Multiply by [amount]

33. /= [amount]
Divide by [amount]

34. System.out.println([text])
Will print something to the output console.

35. +
Can be used for concatenation. (ex. "6" + [var_here])

36. public static void main(String[] args)
This is your main function and your project will start in here.

37. System.out.print([text])
This prints stuff but there is no line break. (/n)

38. \n
Called a line break; will print a new line.

39. \t
This will print a tab.

40. if ([condition])
This will make it so if [condition] is true then it'll keep going.

41. &&
This means and.

42. !
This means not.

43. ||
This means or.

44. ==
This means equal to.

45. <
This means less than.

46. >
This means greater than.

47. >=
This means greater than or equal to.

48. [inputVarHere].hasNextLine()
This will return if there is a next line in the input.

49. this
Refer to the class that you are in.

50. [caller].next[datatype]()
This will get the [datatype] that you somehow inputted.

51. Create getters and setters
This will create the get methods and set methods for every checked variable.

52. [caller].hasNext[datatype]()
This will return if it has the correct datatype within the input.

53. overloading
If you have different parameters you can call them whatever way you want.

54. parameters
These are the inputs of your function.

55. ([datatype])[variable]
This will convert [variable] into [datatype]. Also known as casting.

56. Math.random()
Generate an extremely percise string of numbers between 0 and 1.

57. Primitives
Just the basic data types which are not objects.

58. [x].toString()
Will convert [x] into a string.

59. [number].parse[numbertype]([string])
This will parse [number] into the [numbertype] with [string].

60. ^
Return true if there is one true and one false.

61. !=
Not equal too. (NEQ)

62. ([condition]) ? [amount] : [var]
This will be like a shortcut way to an if statement.

63. switch([variable])
This will do stuff with specific cases. (e.g. switch(hi){ case 2: (do stuff)})

64. case [value]:
This will do stuff if the case is the case.

65. break
Put that when you want to leave the loop/switch; should be at end of case.

66. default [value]:
This will do stuff if none of the cases in the switch statement was made.

67. for ([number]; [condition]; [operation])
This will start at [number] and then do [operation] until [condition] is met.

68. continue
This will just go back to the enclosing loop before reaching other code.

69. while ([condition])
This will basically do something while [condition] is true.

70. void
This means no return type.

71. return
This will return something when you call it to where it was called from .

72. do { } while ([condition])
Guarantees it will execute once even if [condition] isn't met.

73. printf("%[type] stuff here bah bla", [variable here])
This will let you use [variable here] with %s being where.

74. System.out.printf([text])
Another way to print? // didn't quite get but ok then

75. [type] [returntype] [name]([parameters]) {
This is a way to create a method.

76. [type][[indexes]]
This will create an array with [indexes] amount of indexes; default infinite.

77. int[] something = new int[20];
This will just make an array of ints with 20 ints in it.

78. for ([object] [nameOfObject] : [arrayOfObject]) {
This will iterate through all of the arrayOfObject with object in use incrementing by 1 until done.

79. [object][[1]][[2]][[3]] [name] = {[value] [value] [value] \n [value] [value] [value]}
[1] is how many down in array, [2] how many accross in array, [3] how many groups

80. .length
This will get how long something is, text, amount of indexes in array, etc.

81. Arrays.copy0f([array], indexes);
This will copy the array and how many indexes into another array.

82. Arrays.toString([array])
Convert the whole array into one huge string.

83. Arrays.binarySearch([array], [object])
This will search for [object] in [array].

```java
import java.util.Scanner;

public class Main {

    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
	 // Write your code here
//        System.out.println("Hello World");
     /* Variables
     Just Like:
        -Water - Bucket
        -Masala - box
        -Lunch - LunchBox
     In Java:
     Variables are containers which store data values
     String, int, float, char, boolean
     How to declare variables:
     syntax - <dataType> <variableName> = <value>;
      */
     String name = "Harry";
     String channel = "CodeWithHarry";
//     System.out.println(name);
//     System.out.println(name.length());
//     System.out.println(name.toUpperCase());
//     System.out.println(name.toLowerCase());
//     System.out.println(name + " from\" " + channel);
//     System.out.println(name + " from\\ " + channel);
//     System.out.println(name + " from\t " + channel);
//     System.out.println(name + " from\n " + channel);

//        System.out.println(name.contains("Har"));
//        System.out.println(name.charAt(2));
//        System.out.println(name.endsWith("ry"));
//        System.out.println(name.indexOf("rry"));

        int numb1 = 4, numb2 = 7;
//        System.out.println(Math.max(numb1, numb2));
//        System.out.println(Math.min(numb1, numb2));
//        System.out.println(Math.sqrt(36));
//        System.out.println(Math.abs(-36));
//        System.out.println(Math.abs(6));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());


     int a = 45, x=56, y=67;
     float b = 45.22f;
     boolean isAdult = false;
//     System.out.println(x);
//     System.out.println(b);
//     System.out.println(isAdult);

    /* Rules for constructing name of variables in Java
        1. Can contain digits, underscores, dollar signs, letters
        2. Should begin with a letter, $ or _
        3. Java is case sensitive language which means that
           harry and Harry are two different variables altogether.
        4. Should not contain whitespaces
        5. You cannot use reserved keywords from Java
     */
    /*
    Two types of Java Data Types:
        1. Primitive - byte (1 byte), short (2 bytes), int(4 bytes), long (8 bytes), float(4 bytes),
           double (8 bytes), boolean(1 bit), char (2 bytes).
        2. Non Primitive or Reference Data Type -
    */
    byte u = -56;
    double d = 45.635435345d;
//    System.out.println(d);
    char grade = 'A';
//    System.out.println(grade);

    /* Operators in Java

        Operand, operator, Operand  =  Result
        4           +           7   =  11

        Types of operators in Java
        Arithmetic operators
        Assignment operators
        Logical Operators
        Comparison Operators
     */
    int num1 = 45, num2=78;
    num1 += 3;
    num2 -= 8;
    // Explore these operators - *=, /=, %=
//        System.out.print("The value of num1 + num2 is ");
//        System.out.println(num1 + num2);
//
//        System.out.print("The value of num1 - num2 is ");
//        System.out.println(num1 - num2);
//
//        System.out.print("The value of num1 * num2 is ");
//        System.out.println(num1 * num2);
//
//        System.out.print("The value of num1 / num2 is ");
//        System.out.println(num1 / num2);
//
//        System.out.print("The value of num1 % num2 is ");
//        System.out.println(num1 % num2);
//        System.out.println(num2++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);

    /*
    * Comparison Operators:
    * 1. == : checks for equality of two values
    * 2. != : checks if two values are not equal
    * 3. <
    * 4. >
    * 5. <=
    * 6. >=
    *
    * Logical Operators:
    * 1. && - Logical and operator - returns true only if both conditions are true
    * 2. || - Logical or operator - returns true if any one condition is true
    * 3. ! - Logical not - Reverse the result from true to false and vice versa
    * */

    // Taking user input in Java
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Your Age");
//        int age = scan.nextInt();
//        System.out.println(input);

    // If-else conditionals
//        if(age>20){
//
//            System.out.println("You are an adult");
//        }
//        else if(age>5){
//            System.out.println("You are not a kid");
//
//        }
//        else{
//            System.out.println("You are a kid");
//        }
    //   Switch statement in Java

//        switch (age){
//            case 12:
//                System.out.println("You are 12 years old");
//                break;
//            case 56:
//                System.out.println("You are 56 years old");
//                break;
//            case 16:
//                System.out.println("You are 16 years old");
//                break;
//            default:
//                System.out.println("You did not match any of the cases");
//        }
    // Quick Quiz: print sunday to saturday based on numbers 1 to 7 typed by the user

        // Loops
        /*
        While Loop
        while(condition){
            // This code will keep executing until the condition is true
        }
         */
//        int i = 0;
//        while(i<100){
//            System.out.println(i);
//            i += 1;
//        }

        /*
        Do While Loop
        do{
            // This code will keep executing until the condition is true
        }while(condition)
         */
//        int j = 0;
//        do{
//            System.out.println(j);
//            j += 1;
//        }while(j>100);

        /*
        For Loop
        for(st1;st2;st3){
            //Code to be executed
            }
         */
//
//        for(int i=0;i<=10;i++){
//            if(i==2){
//                continue;
//            }
////            else{
////                System.out.println(i);
////            }
//            System.out.println(i);
//        }

    // Java Arrays
//        int [] marks = {1,2,3,5};
//        marks[3] = 34; // this will update marks[3]
//        System.out.println(marks[0]);
//        System.out.println(marks[3]);
//
//        // Classical way to iterate an array
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        System.out.println("This is for each loop:");
//
//        // For each loop
//        for(int value:marks){
//            System.out.println(value);
//        }
//
//        int [][] matrix = {{1,2,3},
//                            {4,5,6}};
//        System.out.println(matrix[0][1]);
//
//        String [] cars = {"Maruti Harry", "Maruti", "Suzuki", "Innova", "Ford Titanium"};
//        for(String value:cars){
//            System.out.println(value);
//        }

        // Try - Catch
//        String [] cars = {"Maruti Harry", "Maruti", "Suzuki", "Innova", "Ford Titanium"};
//
//        try{
//            System.out.println(cars[3]);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//
//        System.out.println("Masoom");
//        System.out.println(sum(5, 7));

        float number_1, number_2;
        System.out.println("Enter first number");

        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();

        System.out.println("Enter second number");
//        Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for " +
                        "subtraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Dividing these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 / number_2);
                break;

            default:
                System.out.println("Invalid input");

        }


    }
}
```
