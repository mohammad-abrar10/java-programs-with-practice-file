// // class representing custom exception
// class InvalidAgeException  extends Exception
// {
//     public InvalidAgeException (String str)
//     {
//         // calling the constructor of parent Exception
//         super(str);
//     }
// }
// // class that uses custom exception InvalidAgeException
// public class TestCustomException1
// {
//     // method to check the age
//     static void validate (int age) throws InvalidAgeException{
//        if(age < 18){
//         // throw an object of user defined exception
//         throw new InvalidAgeException("age is not valid to vote");
//     }
//        else {
//         System.out.println("welcome to vote");
//         }
//      }
//     // main method
//     public static void main(String args[])
//     {
//         try
//         {
//             // calling the method
//             validate(13);
//         }
//         catch (InvalidAgeException ex)
//         {
//             System.out.println("Caught the exception");
//             // printing the message from InvalidAgeException object
//             System.out.println("Exception occured: " + ex);
//         }
//         System.out.println("rest of the code...");
//     }
// }


class Invalid extends Exception{
  public Invalid(String str){
    super(str);
  }
}
class Exceptionexample1{
  static void validate(int age) throws Invalid{
    if(age<18){
      throw new Invalid("you are under age");
    }
    else{
      System.out.println("you are welcome to vote");
    }

  }
  public static void main(String [] args){
    try{
      validate(19);

    }
    catch( Invalid ex){
        System.out.println("caught the exception");
        System.out.println("exception occured "+ex);
    }
    System.out.println("rest of the code ");
  }
}