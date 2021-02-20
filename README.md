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
// Standard Ternary Operatos structure
(boolean_expression) ? code_if_expression_is_true : code_if_expression_is_false;
```

todo
