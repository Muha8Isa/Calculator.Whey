# Calculator.Whey
Hi! I divided this project into 3 classes: 
The first class (Calculator.java) is the main one that makes the app run.
The second class (CalculatorClass.java) handles the calculations and displays the menu where the user can choose what operation and what numbers they want to calculate. 
The last class (calc.java) is where the used operation methods are presented.
The reason why I used a separate class to define the operation methods, is to make the code more readable and make it less "crowded".
Moreover, by doing so, it was easier to have the whole method presented in just one command: "calc.main()".
This made it easier to reuse the same operations inside the if-statement, particularly to let the user decides whether to end the process or continue it by either typing N or Y respectively.
I could have created the calculator without having the third class (calc.java), and instead, define the operations methods inside the same class (Calculator.java).
However, if I choose to do that, it will lead to repetitions in code as I mentioned earlier.
It was definitely possible not to repeat the code, actually it was not necessary. However, this makes it useless to tell the user to type Y to continue the process because typing any other character, except for N, continues the process.
