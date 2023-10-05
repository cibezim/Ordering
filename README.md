# Chapter 10 Notes
- Non-static methods usually deal with individual instances, making them inaccessible to static methods. 

- If you want a class to have only static methods and prevent it from being instantiated, just make the constructor private.

- A static variable is shared among all members of a class, with only one copy for the entire class, unlike instance variables, which have a copy for each object.

- Static methods can easily access static variables.

- To create a constant in Java, mark a variable as static and final.

- For a final static variable, it must be given a value during declaration or in a static initializer block.
