# becoming_developer
Repository with study function and insertion at the job market as a junior developer.

# Being part of the project

## GitHub - first part, cloning and creating your learning branch

First of all you need to create a GitHub account and install Git at your computer.

To start see this contents at your computer you need to clone this repo at your machine, cloning is literally copy this repository to your computer.

Starting clone, go to the repository and copy the link (use the link type you want).

![git-clone](https://user-images.githubusercontent.com/39606289/107230034-4c23f780-69fd-11eb-97b7-24943cfa0736.png)

Enter at the directory you want to save the repository, and in this folder at the Command Prompt (or Git Bash if you want to), type the command and paste
the link you clipped.

```
git clone https://github.com/LeoManzini/becoming_developer.git
```
![git_clone](https://user-images.githubusercontent.com/39606289/107364676-86070380-6aba-11eb-833e-924a5eeceef8.png)

Now that you have this repository at your computer, let's work on it!

To put your hands on code, you need to create your own branch, at the command prompt (or git bash again), enter with the command

```
git branch your_branch_name
```
![git_branch_name](https://user-images.githubusercontent.com/39606289/107364282-00835380-6aba-11eb-964e-498d66603cd8.png)

Doing that you create a branch with the name you gave to it! To see all the branches just type

``` 
git branch
```
![git_branch_list](https://user-images.githubusercontent.com/39606289/107361614-6a99f980-6ab6-11eb-9d07-ceb64b8b6c14.png)

The star (\*) show to you your current branch. Master branch is the principal branch, with all this content inside. 
To navigate between the branches use the command:

``` 
git checkout branch_name
```
![git_branch_switch](https://user-images.githubusercontent.com/39606289/107361800-ae8cfe80-6ab6-11eb-9867-e95db3c9f97e.png)

This command allow you to switch your current branch to the one you specified. 

Now at your branch we start learning!

## Control Structures

This initial topic, will give to you some crucial insights, directly influencing the flow of execution of your code, being able to follow a line of 
reasoning during execution, being able to skip excerpts of code or make different decisions.
At this topic we will see:
  - For
  - While
  - Do while
  - If else
  - Switch
  - Break
  - Continue
  - Try, catch and finally
  - Throw and throws
  
At the folder control_structures we start to learn about them.

![control_structures](https://user-images.githubusercontent.com/39606289/107361918-daa87f80-6ab6-11eb-8237-94b5da5b06a2.png)

*REMEMBER* at the moment we are not focusing on learning a programming language, but on control structures, because in all languages there are, 
with only syntax differences but the functioning being the same. Each thing at his time ...

*“Patience you must have my young Padawan...”*
  
### Loops

Known as repetition loops this Control Structure works as simple as the name loop, it repeats a specific block of code a number of times.

Were created to save time and code, imagine you're working on a big project with hundreds of data, and need to make the same routine for each one of those, 
it will take bunch of time, right? In addition, we would have an extremely large and repetitive code, with equal commands to do the same things.

So thinking in a way to solve these problems repetition loops were created, making the codes more compact, more readable and faster to be developed.

### For
Now talking specifically about the for loop that is used for execute a block of codes X number of times. 
You choose to use For when you known how many times you want to execute the code block.

``` java
// For loop standard scope
for(initializing_variable; conditional_expression; iteration_expression) {
    // Here goes the code block to execute at each iteration
}
```
The For loop consists of three essential elements: 
- Declaring and initializing variables;

The first part of the loop, where we can declare one or more variables (variables are just a computer memory space that hold a value). 
They stay between parentheses after the For expression, and when we have more than one, we separete they with a comma.

``` java
// For loop variable declaration and initialization
// You can declare the variable outside or inside the loop

int variable_outside = 1;
for(variable_outside; ;) {
    // Here goes the code block to execute at each iteration
}

for(int variable_inside = 0; ; ) {
    // Here goes the code block to execute at each iteration
}

int variable1 = 0;
int variable2 = 1;
for(variable1, variable2; ;) {
    // Here goes the code block to execute at each iteration
}

for(int variable3, variable4; ;) {
    // Here goes the code block to execute at each iteration
}
```
The declaration and the initialization, happens just one time at the loop.

- Conditional expression;

At the second loop part, we have the conditional expression. It's make a reference to a test that will be executed and should return a boolean value.
By this motive the condition should be a logical expression.

Logical expressions are those whose value can only be true or false. We use them between the logical operators.

``` java
Logical Operators

Higher than >                 // Compare if something is higher than other
Lower than <                  // Compare if something is lower than other
Higher or equal then >=       // Compare if something is higher or equal than other
Lower or equal than <=        // Compare if something is lower or equal than other
Equal ==                      // Compare if something is equal than other
Conective AND &&              // Compare if two tests are true
Conective OR ||               // Compare if one test is true
Negative !                    // Invert the result of a expression, true become false and false become true
```

It's important to say that a logical expression can be complex, and have that use a connective expression to use more than one.

``` java
// First part declaration and initialization; conditional expression
// Correct test
for(int variable1 = 0, variable2 = 10; (variable1 < 10) && (variable2 > 5); ) {
    // Here goes the code block to execute at each iteration
}

// Wrong test
for(int variable1 = 0, variable2 = 10; (variable1 < 10), (variable2 > 5); ) {
    // Here goes the code block to execute at each iteration
}
```
The conditional expression happen at each loop iteration.

- Iteration expression;

At the iteration expression, we indicate what should happen with the variables after each loop execution. Ever should be processed after the loop be executed,
and ever be the last For instruction.

We use to increment or decrement the our variable initialized at the first For part and verified at the conditional expression.

``` java
Ways to increment or decrement a var

variable++              // After increment, use the variable and after increase her value by one
++variable              // Before increment, increase her value and after use the variable
variable--              // After decrement, use the variable and after decrease her value by one
--variable              // Before decrement, decrease her value and after use the variable
variable += 1           // Sum a number (at this case 1) to the variable 
variable -= 1           // Subtract a number (at this case 1) to the variable 
variable *= 1           // Multiplies a number (at this case 1) to the variable 
variable /= 1           // Divide a number (at this case 1) to the variable
variable %= 1           // Divide a number (at this case 1), and the exact rest go to the variable
```
The iteration expression is executed at each loop iteration.
``` java
// Corrects For examples
for(int variable = 0; variable < 10; variable++) {
    // Here goes the code block to execute at each iteration
}

for(int variable = 0, variable1 = 10; (variable < 10) && (variable1 > 5); variable++) {
    // Here goes the code block to execute at each iteration
}

for(int variable = 0; variable < 10; variable+=2) {
    // Here goes the code block to execute at each iteration
}
```
So the loop for is compose of:

``` java
for(int variable = 1; variable < 5; variable++) {
    int           // Type of the variable;
    variable = 1  // Declaring and initializing the variable;
    variable < 5  // Boolean test made at the variable;
    variable++    // Variable iteration, what happens to it.
}
```
But we can manipulate more the For structure, mading it runs infinitely or just be like others loops we'll see.

``` java
int counter = 0;
for( ; counter < 10; )        // This For loop behaves like the While loop, 
                              // because this boolean test is always truth

for( ; ; )                    // This For loop runs infinitely, until an external force stop it
```

We can use them nested and give them names too. This name function is called labeled loops.
``` java
external: for( ; ; ) {
              internal: for( ; ; ) {
              }
          }
```
Now, at the control structures_folder, inside the src folder, we have a Java program called For.java, it have examples of the For uses. 
Read and try to rewrite them and understand, after this we continue with the next chapter!

### While

The While loop is a repetition structure like the For one, but it works in a different way. While the For loop works a determinated number of times, 
the While loop works until a condition be false, while the condition is true!

``` java
// Standard While structure
while(condition) {
    // Block of code
}
```
The condition that makes the While loop repeat itself should return a boolean value like at the For loop (See the conditional expression at the For session).

So, practically, the While loop checks if the conditional test is true, if it is, repeat this block of code.

``` java
double salary = 2000;

// This code makes simple to understand the While loop,
// while your salary be lower than 5000, increase it by the expression!
while (salary < 5000) {
    salary *= 100;
}
```

But we have a problem at the While loop, if your test start as false, and you need to execute the block of code at least one time, 
it will not even enter the loop who wish to execute the code block... But we have a solution to this, the Do While loop!

### Do While

As stated above, the Do While loop works very similar to the While loop, with only one difference, this loop executes the code block at least once,
even with the conditional test being false. 
It happens because we have the Do expression, that is basically saying do this (first), while this condition is true.

``` java
// Standard Do While structure
do {
    // Code block
} while(condition);
```

Because of the Do expression, we enter at the code block at least once, even the condition is false.

Now, at the control structures_folder, inside the src folder, we have a Java program called While.java and DoWHile.java, it have examples of the While 
and Do While uses. Read and try to rewrite them and understand, after this we continue with the next chapter!

### Continue

The Continue command is like another kind of code control within your loop, and once used the loop immediately returns to its conditional test.
As if that were not enough, Continue can be used in all repetition loops.

``` java
// Continue use sample with while
while(condition) {
    // Block of code
    continue;
    // Block of code that will be ignored, because the continue makes the loop go to the test again
}

// Continue use sample with for
for(int counter = 0; counter < 10; counter++) {
    // Block of code
    continue;
    // Block of code that will be ignored, because the continue makes the loop go to the test again
}

// Continue use sample with do while
do {
    // Block of code
    continue;
    // Block of code that will be ignored, because the continue makes the loop go to the test again
} while(condition);
```

### Break 

The Break command, equals the Continue, is like another kind of code control within your loop, and once used we exit from the loop immediately,
executing the next line of code and continuing the execution of your code outside the loop.
As if that were not enough, Continue can be used in all repetition loops.

``` java
// Break use sample with while
while(condition) {
    // Block of code
    break;
    // Block of code that will be ignored, because the break makes the loop exit
}

// Break use sample with for
for(int counter = 0; counter < 10; counter++) {
    // Block of code
    break;
    // Block of code that will be ignored, because the break makes the loop exit
}

// Break use sample with do while
do {
    // Block of code
    break;
    // Block of code that will be ignored, because the break makes the loop exit
} while(condition);
```

Now, at the control structures_folder, inside the src folder, we have a Java program called LoopControl.java, it have examples of the Continue and 
Break uses. Read and try to rewrite them and understand, after this we continue with the next chapter!

### If Else

The conditional structures allow the code take some decisions and follow a right way or another at your code. 
Through they we can say to the system execute some block of code, case one condition is satisfied or won't.

The If Else structure allow your program evaluate if a determined expression is true or false, and according to the test results,
take a path in the code or another.

``` java
// Standard If Else structure
if (boolean_condition) {
    // Block of code
} else {
    // Block of code
}
```

#### If

The If part of the code, has a check that accepts a Boolean test and checks if the result of it is true, if it is the code, enter the If block.

``` java
if (condition == value) {
    // Sometimes even this test is unecessary, if we already compare a boolean value
}

if (contition) {
    // Like here, the condition already have a boolean value
}
```

#### Else

The Else part of code is ever linked to a If, never forget this the If exist without an Else structure, but an Else not.
Because this the Else structure doesn't have a conditional test, it is dependent of the If test, if the test is true execute the If block of code,
if is false execute the Else, is so much simple, If is for true and Else for false.

``` java
if (condition) {
    // If the condition is true, enter the If structure and execute this block
} else {
    // If the condition tested at the If is false, 
    // automatically enter the Else structure and execute this block
    // because that the else doesn't have a test it can't exist without an If
}
```

#### Else If

If you want to have more than one test on a value, it is customary to use Else If to do this, since it is an extension of If with conditional testing.

``` java
if (condition) {
    // Block of code
} else if (another_condition) {      // Standard Else If structure
    // Block of code
} else {
    // Block of code
}
```

That way if more than one test is needed, we can run the tests in that format. 
If the test of the first If goes false, the code flow leads to test the Else If, which works just like an If, actually as if they were nested Ifs.

Is ever linked to a If structure as well, but unlike Else, wich we can have only one as a standard execution if you don't enter any tests, 
we can have several Else If, however no matter how many checks there are, once the program enters one, it will not enter another one.

Now, at the control structures_folder, inside the src folder, we have a Java program called IfElse.java, it have examples of the If, Else and Else If uses. 
Read and try to rewrite them and understand, after this we continue with the next chapter!

### Ternary Operator

A feature similar to If Else for decision making, but coded in one line.

``` java
// Standard Ternary Operator structure
(boolean_expression) ? code_if_expression_is_true : code_if_expression_is_false;
```
When evaluating the Boolean expression, after the question mark, there is the code block that will be executed if the condition is true, 
after the colon there is the false expression code.

The ternary operator is a more "economical" way of making decisions, with one line having an if and an else and the code for both. 
However, for better evaluated decisions, this method does not serve, because it only solves the problem for something true or false in this test.

Now, at the control structures_folder, inside the src folder, we have a Java program called TernaryOperator.java, it have examples of the Ternary
Operator use. Read and try to rewrite them and understand, after this we continue with the next chapter!

### Switch

Is a conditional structure that test some variable value, and intent of the value inside the variable allow execute one between the multiple
actions, being able to replace chained Ifs with a "simpler" code.

``` java
// Standard Switch structure
switch (variable) {
    case value :
        // Block of code to execute if the variable have this value
    case another_value :
        // Other block of code to this other value
}
```

But something interesting happens in the Cases of the switch, because even if it enters in any, it will continue to check if there are more cases that 
match, to execute only one of the cases we have to use the keyword Break, as we saw above.

``` java
// Standard Switch structure
switch (variable) {
    case value :
        // Block of code to execute if the variable have this value
        break;  // Now just execute this case if is equal 
    case another_value :
        // Other block of code to this other value
        break;
}
```

The Switch has a default case to enter if nothing of the others cases don't match to the variable value.


``` java
// Standard Switch structure
switch (variable) {
    case value :
        // Block of code to execute if the variable have this value
        break;  // Now just execute this case if is equal 
    case another_value :
        // Other block of code to this other value
        break;
    default :
        // Code executed if nothing match previously
}
```

Now, at the control structures_folder, inside the src folder, we have a Java program called Switch.java, it have examples of the Switch
use. Read and try to rewrite them and understand, after this we continue with the next chapter!

### Try Catch

The Try block is used in code snippets with the tendency to generate errors, and so instead of the system crashing, it tries to make a deal with it.

``` java
// Standard Try structure
try {
    // Block of code that can generate errors
}
```

We have linked with the Try structure a Catch structure, which inside the parentheses have the code error you want to treat.
Each Try block can have zero or more Catchs, with each one have one error to treat.

``` java
// Standard Try with Catch structure
try {
    // Block of code that can generate errors
} catch (exception x) {
    // Block of code to treat the x exception
} catch (exception y) {
    // Block of code to treat the y exception
}
```

The exceptions at the Catch structure and they respectives names, are specific to each programming language, but one exception have at least
one string that describe the error. At java we can obtain the description using the ```getMessage()``` function.

Since exceptions are part of a class hierarchy, the more general exceptions (closer to the top of the hierarchy) encompass a variety of exceptions.

``` java
// Standard Try with the most generic Catch structure
try {
    // Block of code that can generate errors
} catch (Exception e) {
    // Block of code to treat the exception
} 
```

The order in which we make exceptions available in the Catch blocks matters a lot, as we need to do from the most specific to the most generic,
making it so that if there is a specific error we can deal with it more specifically instead of the generic.

``` java
// Standard Try with Catch structure ordered by most specifically exception
try {
    // Block of code that can generate errors
} catch (NullPointerException e) {
    // Block of code to treat a most specifically exception
} catch (Exception e) {
    // Block of code to treat the most generic exception
}
```

We have an optional block to add to the Try Catch structure that is the Finally. The Finally structure isn't mandatory for the proper functioning of the
Try Catch, but when we have a Finally structure it will execute regardless of whether it worked or failed in the code block inside Try structure.


``` java
// Standard Try with Catch and Finally structure
try {
    // Block of code that can generate errors
} catch (exception x) {
    // Block of code to treat the x exception
} catch (exception y) {
    // Block of code to treat the y exception
} finally {
    // Block of code that will execute regardless of whether it worked or failed
}
```

### Throw and throws

When we don't want an exception to be handled in the method or class itself, but in another one that calls it, we use the Throws command, 
which practically sets an error in your class or method.

``` java
// Standard way to set an exception using Throws
private static void increaseLetters() throws NullPointerException {
    // Block of code that will be executed and will throw the exception
}
public static void main (String args []) {
    try {
        increaseLetters();  // Try to use that function, but it will throws the exception
    } catch (NullPointerException e) {
        // Treat for the exception
    }
}
```

We can change the exception we throw, forcing the code to use the exception we are saying to use.

``` java
// Standard way to set an exception using Throws and Throw another exception
private static void increaseLettersThrowingGenericException() throws Exception // Forcing a generic exception {
    try {
	      // Block of code that will try to execute
	  } catch(NullPointerException e) { // Treating the error that gave
	        throw new Exception(e); // Forcing a new exception
    }
}
```

We can create our exceptions too, just need to create a class in java that extends the Exception class and override the method ```getMessage()```
to show the message we want.

``` java
// Standard way to create your exception
public class myException extends Exception {
    @Override
    public String getMessage () {
        return "The error message goes here.";
    }
}
```

``` java
// Standard way call and use your exception
public class ExceptionTest {
    public static void main (String args []) throws myException {
        throw new myException();
    }
}
```

Now, at the control structures_folder, inside the src folder, we have a Java program called TryCatch.java and WithoutBExeption.java, 
it have examples of the Try Catch and Throw use. Read and try to rewrite them and understand, after this we continue with the next chapter!

## Data Structures

### Vector

They are data structures that store a fixed amount of a certain type of data. For this reason, they are also known as homogeneous data structures.
Internally, a vector stores several values, each associated with a position within the vector.
It is as if the vector was a dresser with several drawers (indexes) and in each drawer you have saved a certain data!

You can access each vector by her data using the position you store the data, they are random data structures. Its size say to us the number of positions it
have.

``` java
// Standard vector declaration
vector_type vector_name[] = new vector_type [vector_size];

int vector[] = new int [10];
```

We count the size of the vector starting from zero, so a vector of ten positions will always be 0 untill 9, that is, a vector will always have
od indices marked by 0 untill Number -1. 
The vectors can be of any type we want, but since it is declared of a type, it will only have data of that type.
We can start the vectors with default values too.

``` java
// Default values for a vector
String vector[] = {"Jhon", "Mary Poppins", "Mattew"};
```

Note that when we start the vectors with a default value, we do not use the word new to start the vector, and each vector position is separated with commas
",".

To access any value position, just use your name and the position you want to access

``` java
// Acessing the vector data
int vector[] = new int [5];

vector[0] = 1;
vector[1] = 2;
vector[2] = 3;
vector[3] = 4;
vector[4] = 5;
```

But do this for a vector with thousands of positions will take forever! So we use a for loop to fill the vector "automatically".

``` java
// Filling the vector with a For loop
int vector[] = new int [5];

for(int position = 0; position < vector.length; position++) {
	vector[position] = position;
}
```

That strange syntax! ```vector.length```? What this does? It's simple, it return the size of our vector, in this case the integer number nine.

All right we filled the vector, but now how we see all his content? Right question and here we go with the right answer, using the For loop or a special For
called For each.

``` java
// Walking through the vector with a normal For
for(int position = 0; position < vector.length; position++) {
	System.out.println("Data at this vector position: " + vector[position]);
}

// Walking through the vector with the For each
for(int number_at_this_position : vector) {
	System.out.println("Data at this vector position: " + number_at_this_position);
}
```

It works in a very similar way to For, but with one difference, it makes iterations with a variable of the same type as the vector, 
and each time the loop runs, this variable has the value of the content of the current position of the vector! Fantastic right? 
Even better, we don't even need to specify a stop condition, as this loop runs through the entire vector until it reaches its end!

Now, at the control structures_folder, inside the src folder, we have a Java program called Vector.java, 
it have examples of the vectors use. Read and try to rewrite them and understand, after this we continue with the next chapter!

### Matrix

TODO
