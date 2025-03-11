package figures;
public class Cercle {  

private double rad;  

public Cercle(double radi) {  
this.rad = radi;  
}  

public void imprimir() {  
String color = "vermell";  
System.out.println("Diàmetre: " + 2 * rad);  
System.out.println("Color: " + color);  
double area = 2 * 3.1416 * rad * rad;  
System.out.println(area);  
}  

public boolean esIgual(Cercle altre, boolean ambDecimals) {  
double radi1 = this.rad;  
double radi2 = altre.getRad();  

if (ambDecimals)  
{  
if (radi1 == radi2)  
return true;  
else  
return false;  
}  
else  
{  
if (Math.abs(radi1 - radi2) < 1)  
return true;  
else  
return false;  
}  
}  

public double getRad() {  
return rad;  
}  
}  