package figures;
public class Test {  

public static void main(String[] args)  
{  
Circumferencia c1 = new Circumferencia(5.5);  
Circumferencia c2 = new Circumferencia(10.1);  
Circumferencia c3 = new Circumferencia(10.9);  

if (c2.esIgual(c3, false))  
{  
System.out.println("c2 i c3: iguals sense considerar decimals");  
}  

if (c2.esIgual(c3, true))  
{  
System.out.println("c2 i c3: iguals considerant decimals");  
}  
}  
}  
