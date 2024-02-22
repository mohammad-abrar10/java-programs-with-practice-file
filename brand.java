abstract class Animal{
  abstract void Animalsound();
  void sleep(){
    System.out.println("zzzz");
  }
}
class Dog extends Animal{
  void Animalsound(){
    System.out.println("woof");
  }
  void fetch(){
    System.out.println("fetching the ball");
  }

}

class brand{
  public static void main(String[] args) {
    Dog mydog=new Dog();
    mydog.Animalsound();
    mydog.fetch();
  }
}