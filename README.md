# becoming_developer
Repository with study function and insertion at the job market as a junior developer.

# Being part of the project

## GitHub - first part, cloning and creating your learning branch

First of all you need to create a GitHub account and install Git at your computer.

To start see this contents at your computer you need to clone this repo at your machine, cloning is literally copy this repository to your computer.

Starting clone, go to the repository and copy the link (use the link type you want).

![git-clone](https://user-images.githubusercontent.com/39606289/107230034-4c23f780-69fd-11eb-97b7-24943cfa0736.png)

Enter at the directory you want to save the repository, and in this folder at the Command Prompt (or Git Bash if you want to), type the command and paste the link you clipped.

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

This initial topic, will give to you some crucial insights, directly influencing the flow of execution of your code, being able to follow a line of reasoning during execution, being able to skip excerpts of code or make different decisions.
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

*REMEMBER* at the moment we are not focusing on learning a programming language, but on control structures, because in all languages there are, with only syntax differences but the functioning being the same. Each thing at his time ...

*“Patience you must have my young Padawan...”*
  
### Loops

Known as repetition loops this Control Structure works as simple as the name loop, it repeats a specific block of code a number of times.

Were created to save time and code, imagine you're working on a big project with hundreds of data, and need to make the same routine for each one of those, it will take bunch of time, right? In addition, we would have an extremely large and repetitive code, with equal commands to do the same things.

So thinking in a way to solve these problems repetition loops were created, making the codes more compact, more readable and faster to be developed.

### For
Now talking specifically about the for loop... to do 
