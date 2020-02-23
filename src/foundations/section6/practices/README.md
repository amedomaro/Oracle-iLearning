# Practices - Section 5
### Problem 1: Validate a Bank PIN
###### Overview
Develop a java program to validate bank PIN of a customer. Use a `while` loop to repeat code until a valid PIN 
is entered.

###### Task
1.Declare a valid integer PIN.

2.Prompt the user to enter the PIN.

3.In a `while` loop, perform the following steps:

- Compare the user-entered PIN with the already declared PIN. 
- If the entered PIN is not the same, prompt the user to enter the PIN again.
- Repeat the loop until the correct PIN is entered.

4.Print a message confirming that the correct PIN has been entered and that the user now has access to their 
account.

### Problem 2: Displaying Multiples of a Number
###### Overview
Develop a java program to calculate the multiples of a given number using a `for` loop.

###### Task
Have the user enter a number, and then use a `for` loop to display all the multiples of that number from 
1 to 12.Expected Output:
~~~~
Select number: 7

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
7 x 11 = 77
7 x 12 = 84
~~~~

### Problem 3: Programmatic ASCII Art 
###### Overview
Using text to create a picture is known as ASCII art.  In section 2, we made an ASCII art cat.  This required 
us to type every character in the art we wanted to create.  In this practice, you’ll find a way to draw basic 
shapes programmatically in customizable sizes.
~~~~
        #####
        #   #   5x4 Rectangle
        #   #
        #####

        #
        ##      5x5 Isosceles Right Triangle
        # #
        #  #
        #####
~~~~
###### Task
Complete the following two methods in `LoopShape.java`:
- `createRectangle()`: This method accepts two arguments for width and height which should be used to print 
a rectangle
- `createTriangle()`: This method accepts one argument for the size of a leg, which should be used to print 
an isosceles right triangle

Try changing the value of the arguments you’re supplying these two methods from the main method.  Make sure 
your program can successfully draw each shape to a custom size. Additionally, your program must:
- Refuse to draw shapes with any dimension less than 1
- Be able to draw shapes with any dimension equal to 1 (a 1x1 shape should print just a single character)

If the problem seems difficult, remember to break it into smaller challenges such as:
- How do I print a single line that is a variable number of “#” characters wide?
- How do I create a String that begins and ends with a “#”, but has a variable number of spaces in between?

Finishing each smaller challenge is an accomplishment.  This problem is as much about understanding loops as 
it’s about understanding how to break a big problem into smaller tasks.

The knowledge you’ve gained in this 
section on loops will be very helpful in completing this program.  You’re free to use whichever type of loop 
statements you feel would be best.  You’ll also need to remember a few concepts from previous sections.

The ProblemSet6_3 project is available to help you get started.