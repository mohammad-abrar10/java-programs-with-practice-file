// import java.util.Scanner;
// public class practice {
//     void telljoke(){
//         System.out.println("you are nati jin ");
//     }

//     int add( int a ,int b ){
//         int c=a+b;
//         System.out.println("the addition of two varibles is"+c);
//         return c;
//     }

//     int mul(int m, int n){
//         int o=m*n;
//         System.out.println("the mul of two variable is "+o);
//         return o;
//     }



//     float sub(int d,int e){
//         float f=d-e;
//         System.out.println("the sub of two varibles is"+f);
//         return f;
//     }

//     float div(int d, int e){
//         float f=d%e;
//         System.out.println("the division of two numbers id "+f);
//         return f;
//     }

//      static  int gul(int m, int n){
//         int o=m*n;
//         System.out.println("the gull is of  of two variable is "+o);
//         return o;
//     }

//     public static void main(String []args){
//         practice myjoke=new practice();
//         myjoke.telljoke();

//         int x=100;
//         int y=20;
//         practice myfun=new practice();
//         myfun.add(x,y);

//          myjoke.telljoke();

//         practice myenter=new practice ();
//         myenter.mul(x,y);

//         practice subtraction=new practice();
//         subtraction.sub(10,5);

//          myjoke.telljoke();

//         practice  division=new practice();
//         division.div(200,y);

//         gul(x,y);
//     }
// }



// case :changing array 

// public class practice {
//     void change(int[] marks){
//          marks[2]=35;
//     }
//   public static void main(String[] args) {
//     int[] marks={1,2,4,6,8,3,9,4};
//     practice mychange= new practice();
//     mychange.change(marks);
//     for(int elements:marks){
//         System.out.println(elements);
//     }
    
//     System.out.println(marks[2]);
//   }
// }


//method overloading
/**
 * practice
 */
// public class practice {

//     static void myfun(){
//         System.out.println("helllo lubna you are natie jin😄");
//     }
//     static void myfun(String name){
//         System.out.println(name+"is a nati jin😄");
//     }

//     public static void main(String[] args) {
//         myfun();

//         String yourName="lubna";
//          myfun(yourName);
//     }
// }

// var args 

/**
 * practice
 */
// public class practice {
//        static float sum(float x,float ...arr){
//         float result=0;

//         for(float a:arr){
//             result+=a;


//         }
//         return result;

//        }
//     public static void main(String[] args) {
//         System.out.println("the sum is "+sum(4));
//     }
// }


//java Recusion 

/**
 * practice
 */
// import java.util.Scanner;
// public class practice {

//     static long factorial(int n ){
//         if(n==0 || n==1){
//             return 1;
//         }
//         else{
//            return n * factorial(n-1);
//         }
//     }

//     static void fibonnacci(int m){
//         int a=0;
//         int b=1;
//         for(int i=1;i<=m;i++){
//             System.out.println(a);
//             int sum=a+b;
//             a=b;
//             b=sum;
//         }

//     }

//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter a positive number");
//         int x=input.nextInt();
//         System.out.println("the factorial of "+x+"is : "+factorial(x));
//         fibonnacci(x);
//         input.close();

//     }
// }


//practice set 

// import java.util.Scanner;
// public class practice{

//      static void multiplictaion(int n){
//         for(int i=0; i<=10;i++){
//            int mul=n*i;
//             System.out.println(n+"x"+i+"="+mul +"\n");
//         }
//      }

//      static void myfun(int m){
//         for(int i=0;i<m;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print("*  ");
//             }
//             System.out.println("");
//         }
//      }

//      int recursive(int x){
//         int sum=0;
//         for(int i=1;i<=x;i++){
//             sum=sum+i;
//         }
//         System.out.println("the sum of "+x+" natural numbers is \t"+sum);
//         return sum;
//      }
//     public static void main(String args[])
//     {
//         Scanner input=new Scanner(System.in);
//         System.out.print("enter a number :");
//         int num=input.nextInt();

//         multiplictaion(num);
//         myfun(num);
//         practice myobj=new practice();
//         recursive(num);
//         myobj.recursive(num);

//         input.close();


//     }
// }


// use of super with methods

// public class practice {
//     void message() {
//         System.out.println("for all sports ");
//     }

//     class FootballPractice extends practice {
//         void message() {
//             System.out.println("this is for all football teams ");
//         }

//         void display() {
//             message();
//             super.message();
//         }
//     }

//     public static void main(String[] args) {
//         FootballPractice teams = new practice().new FootballPractice();
//         teams.display();
//     }
// }


//use of super with contructor

// class practice{
//   static void fibonnacci(int m){
//         int a=0;
//         int b=1;
//         for(int i=1;i<=m;i++){
//             System.out.println(a);
//             int sum=a+b;
//             a=b;
//             b=sum;
//       }
//     }

//   public static void main(String [] args){
//    int x=20;
//    fibonnacci(x);

//   }
// }

// exception handling in java ............................+++++++++++++++---------------+===============

// import java.util.Scanner;
// class practice{
//   public static void main(String [] args){
//     int []marks=new int [3];
//     marks[0]=10;
//     marks[1]=30;
//     marks[2]=30;

//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the array index");
//     int ind=sc.nextInt();

//     System.out.println("enter the number you want to divide the wilue with");
//     int number=sc.nextInt();

//     try{
//       System.out.println("the value entered at the idex is " + marks[ind]);
//       System.out.println("the value of array value/number is " + marks[ind]/number);
//     }
//     catch(Exception e){
//       System.out.println("some exception occured");
//       System.out.println(e);
//     }
//     sc.close();


//   }

// }

// practice pf this program
import java.util.Scanner;
class practice{
  public static void main(String [] args){
    int [] marks=new int [3];
    marks[0]=5;
    marks[1]=10;
    marks[2]=12;

    Scanner sc =new Scanner(System.in);
    System.out.println("enter the array index");
    int index=sc.nextInt();

    System.out.println("enter the number you want to divide the value it with ");
    int number=sc.nextInt();

    try{
      System.out.println("the value at array index is" +marks[index]);
      System.out.println("the result of dividing the index with number is "+marks[index]/number);
    }
    catch(Exception e){
      System.out.println("some excption occur");
      System.out.println(e);
    }
    sc.close();

  }
}




