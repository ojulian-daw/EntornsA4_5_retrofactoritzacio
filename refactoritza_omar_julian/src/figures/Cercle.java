package figures;
public class Cercle {  

private double rad;  
private double PI;
public Cercle(double radi) {  
this.rad = radi;  
this.PI=3.1416;
}  

public double getPI() {
	return PI;
}

public void setPI(double pI) {
	PI = pI;
}

public void imprimir() {  
String color = "vermell";  
System.out.println("Diàmetre: " + 2 * rad);  
System.out.println("Color: " + color);  
double area = 2 * PI * rad * rad;  
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