public class Carmodel{
  protected String brand="ford";
  public void honk(){
    System.out.println("tuuut tuuut");
  }
}
class brand extends Carmodel{
  private String modelname="mustang";

  public static void main(String[] args) {
    brand myobj=new brand();
    myobj.honk();
    System.out.println(myobj.brand +""+myobj.modelname);

  }
}