 class A 
   {
     public void loop1 ()
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println("for loop: " +i);
        }
    }
}
class B 
{
public void loop2()
 {
    int x;
    x=1;
    while (x<=10) 
    {
        System.out.println("while loop: " +x);
        x++;
        
    }
 }
}
class C {
public void loop3()
{
    int x;
    x=1;
    do 
    {
        System.out.println("do while loop: "+x);
        x++;
    }
    while (x<=10);

}
}
class D 
{
public void Arr1()
{
    int x[] = {10,20,30,40,50};
    System.out.println("length of array: "+x.length);
}
}



 
 class Mac {
    public static void main(String[] args) 
    {
        
        
      A ao = new A();
      B bo = new B();
      C co = new C();
      D d= new D();
      ao.loop1();
      bo.loop2();
      co.loop3();
      co.loop3();
      co.loop3();
      d.Arr1();


    
    }
 }