class test{
public static void main(String [] arr)
{
try
{
 int a = Integer.parseInt(arr[0]);
if(a<0 || a>50)
throw(new Exception("valid range is 10 to 50")); 
{
int s=a*a;
System.out.println("Square is:"+s);
}
}catch(Exception ex)
{
System.out.println(ex);
}
} 
}