
IDEA:
Make video of this? Make an exercise out of this?
Demonstrate the design and implementation of an adder/subtracter object statically written and then object oriented. Include an arraylist of strings for memory of past operations with a "playback" method that prints out all the previous operations.

============================

QUESTIONS:
The following are some questions I constructed for the final exam review, but couldn't use because we had not sufficiently covered objects. They would be good to use in this section. These questions are not saved elsewhere:

QUESTION COMPLEX PART 1) A complex number has two parts: the real part and the imaginary part. Write a class with two attributes of type double that could be used to represent a complex number. Include a constructor and two methods, getReal and getImaginary. The methods both return doubles. One returns the real part and the other returns the imaginary part.
For example, a+bi represents a complex number where a is the real component and b is the imaginary component. i is a constant so we don't need to represent it.

QUESTION COMPLEX PART 2) Write a method named addTo that takes another complex number as input and changes this complex number by adding the real and imaginary parts of the other number to this number.
Adding the complex number 1+2i to the complex number -3+6i results in -2+8i. The struct would store in memory -2 and 8.

QUESTION COMPLEX PART 3) Write a method named add that takes another complex number as input and returns a new complex number object that has values equal to the sum of the given complex number and this.

QUESTION COMPLEX PART 4) Multiplication of complex numbers is interesting. Suppose I have two complex numbers a+bi and c+di. The product of a+bi and c+di is
 ac - bd + cbi + adi
(ac - bd) + (cbi + adi)
 (ac-bd) + (cb+ad)i
where the real part is on the left and the imaginary part is on the right. Here's an example with actual values. I'm going to multiply -1+3i and 2+2i
 -1*2 - 3*2 + 2*3i + (-1)*2i
     -2 - 6 + 6i - 2i
         -8 + 4i
Write a method named multiply that takes another complex number as input and returns a new complex number object that has values equal to the product of the given complex number and this.

