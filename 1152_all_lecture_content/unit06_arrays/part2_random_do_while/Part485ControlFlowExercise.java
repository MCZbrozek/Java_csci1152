public class Part485ControlFlowExercise
{
  /* TODO: When the following method runs,
  what lines of code execute and in what
  order? Answer in a comment. */
  public static void exercise1(){		//Line
    int number = 10;					// 1
    if(number > 0) {					// 2
      System.out.println("Number = "+	// 3
        number);
    }
    System.out.println("Number = "+		// 4
      number);
  }

  /* TODO: When the following method runs,
  what lines of code execute and in what
  order? Answer in a comment. */
  public static void exercise2(){ //Line
    int number = 0;					// 1
    if(number > 0){					// 2
      number = number + 5;			// 3
    }
    else if(number < 0){			// 4
      number = number*2;			// 5
    }
    else{
      System.out.println("Number = "+//6
	    number);
    }
  }

  /* TODO: When the following method runs,
  what lines of code execute and in what
  order? Answer in a comment. */  
  public static void exercise3(){
    double n1 = -1.0, n2 = 4.5, n3 = -5.3, number;
						//Line
    if(n1 >= n2){		// 1
      if(n1 >= n3){		// 2
        number = n1;	// 3
      }else{
        number = n3;	// 4
      }
    }else{
      if(n2 >= n3){		// 5
        number = n2;	// 6
      }else{
        number = n3;	// 7
      }
    }
    System.out.println("Number = "+
		number);		// 8
  }


  public static void main(String[] args) 
  {
    exercise1();
    //exercise2();
    //exercise3();
  }
}