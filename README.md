[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22504611)
# testingObjects

## Questions
Q1: Printing an object with no `toString` shows the name of the class plus a hex hash. This is because this is the default answer if there is no defined `toString` method. The hex hash is the memory address of the object.  
Q2: The default Strings printed as `null`, while the deafult interger printed as `0`. The integer is the primitive type, while the strings are reference types because they are objects, and since they point to nothing, they return null.  
Q3: Constructors allow the programmer to allocate memory themselves rather than having programm doing that itself.  
Q4: The difference is that in the new print out using the `toString` method yielded a human readable output, while the first printout had human-unfriendly hash codes. Override tells the program you intent to override a method with a custom one
Q5: Private fields help keep the code secure from hackers. One example of needing a setter would be a bank account.

## Reflection
Q2:  
> Fields: String name, String artist, int year  
Default values: `Unknown`, `Unknown`, `1900`  
 
Q4: Adding `@Override` to `toString()` tells the program that you intend to override a method with a custom one. 