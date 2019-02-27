/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cualquierbase;

import java.util.Scanner;

/**
 *
 * @author BD Y TOPBD
 */
public class CualquierBase {

    /**
     * @param args the command line arguments
     */
    String primnum="",segnum="",primnum1="",segnnum1="",operaciones="",regresa="";
    int basen=0,basem=0,numO=0,num00=0,basen1=0,basem1=0,basen2=0,basem2=0;
    int []num1;
    int []num11;
    int []segundo;
    int []segundo1;
    int resultbase10=0,especial=0,resultbase10v1=0,especial1=0;
    public static void main(String[] args) {
        // TODO code application logic here
         CualquierBase nuevo=new CualquierBase();
         nuevo.contenido();   
    }
    public void contenido(){
        

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca un numero de la siguiente forma primervalor-segundovalor-tercer valor : ");
   
        primnum = leer.nextLine();
        primnum1=primnum;
        System.out.print("\n Introduzca la base en que esta dicha numero : ");
        basen = leer.nextInt();
        basen1=basen;
        System.out.print("\n Introduzca la base en la que pasara  : ");
        basem = leer.nextInt();
        basem1=basem;        
        pasarBase10Parte1(primnum);
        PasarBase10Parte2(num1,basen);
        resultbase10v1=resultbase10;
        num11= new int[num1.length];
        for(int i=0;i<num1.length;i++)
        {
        System.out.print("\n la posicion: "+i+" = "+num1[i]);
        num11[i]=num1[i];
        }
        
        System.out.print("\n El numero en base 10 es : "+resultbase10v1+"- en la base : "+ basem+" es: ");
        Scanner otro = new Scanner(System.in);
       System.out.println(convertir(resultbase10,basem));
        System.out.print("Introduzca un segundo numero  de la siguiente forma primervalor-segundovalor-tercer valor : ");
        segnum = otro.nextLine();
        System.out.print("\n Introduzca la base en que esta dicha numero : ");
        basen2 = otro.nextInt();
        System.out.print("\n Introduzca la base en la que pasara  : ");
        basem2 = otro.nextInt(); 
        pasarBase10Parte1(segnum);
        segundo= new int[num1.length];
         for(int i=0;i<num1.length;i++)
        {
        System.out.print("\n la posicion: "+i+" = "+num1[i]);
        segundo[i]=num1[i];
        }
        PasarBase10Parte2(segundo,basen2);
        
        System.out.print("\n El numero en base 10 es : "+resultbase10+"- en la base : "+ basem2+" es: "); 
       System.out.println(convertir(resultbase10,basem2));
       desarrollo();               
      
    }
        public String convierte5(int [] a) // convierte un array en un string
     { 
        regresa="";
StringBuffer result = new StringBuffer();
for (int i = 0; i < a.length; i++) {
   result.append( a[i] );
   //result.append( optional separator );
}
regresa = result.toString();
         
        return regresa;
    }
    public void desarrollo()
    {      int opcion=0, base=0;
           String aa=Integer.toString(resultbase10v1);
           String ab=Integer.toString(resultbase10);
          //  System.out.print("\n EL VERDADERO VALOR DE A ES: "+aa);
           // System.out.print("\n EL VERDADERO VALOR DE A ES: "+ab);
            
           Scanner trab = new Scanner(System.in);
           System.out.print("\n Ingresar la base en cual se va operar "); 
           base= trab.nextInt();
           System.out.print("\n Operaciones con los numeros a elegir "); 
           System.out.print("\n 1 Suma  "); 
           System.out.print("\n 2 resta  ");
           System.out.print("\n 3 multiplicacion "); 
           System.out.print("\n 4 division "); 
           System.out.print("\n se debe de elegir una: "); 
           opcion= trab.nextInt();
           
    switch (opcion) 
        {
            case 1: 
                     System.out.print("\n la suma entre : "+primnum1+"- en la base : "+ basen1+" + "+segnum+"en base "+basen2);
                     System.out.print("\n Ambos numeros siendo convertido en base: "+base+" ->da como suma =");
                     SumaBinaria(aa,ab,base);
                     System.out.print(" con base ("+base+")");
                     break;
            case 2:   
                    
                     System.out.print("\n la resta entre : "+primnum1+"- en la base : "+ basen1+" + "+segnum+"en base "+basen2);
                     System.out.print("\n Ambos numeros siendo convertido en base: "+base+" ->da como resta =");
                     RestaBinaria(aa,ab,base); 
                     System.out.print(" con base ("+base+")");
                     break;
            case 3: 
                     
                     System.out.print("\n la multiplicacion entre : "+primnum1+"- en la base : "+ basen1+" + "+segnum+"en base "+basen2);
                     System.out.print("\n Ambos numeros siendo convertido en base: "+base+" ->da como multiplicacion =");
                     MultiplicacionBinaria(aa,ab,base);
                     System.out.print(" con base ("+base+")");
                     break;
            case 4: 
                     
                     System.out.print("\n la division entre : "+primnum1+"- en la base : "+ basen1+" + "+segnum+"en base "+basen2);
                     System.out.print("\n Ambos numeros siendo convertido en base: "+base+" ->da como division =");
                     DivisionBinaria(aa,ab,base);
                     System.out.print("con base ("+base+")");
            default: 
                    break;
        }
    
    }
    
    public String SumaBinaria(String a, String b, int base)
    {   
        operaciones="";
        int a1 = Integer.parseInt(a, 10); 
        int b1 = Integer.parseInt(b, 10);
        int c1 = a1 + b1;
       /* System.out.print("\n el valor de a es: "+a);
        System.out.print("\n el valor de b es: "+b);
        System.out.print("\n el valor de c es: "+c1);
        */
        String operaciones = Integer.toString(c1, base);
    System.out.print(" "+operaciones);  
        return operaciones;
    }
    
        public String RestaBinaria(String a, String b, int base)
    {   
        operaciones="";
        int a1 = Integer.parseInt(a, 10); 
        int b1 = Integer.parseInt(b, 10);
        int c1 = a1 - b1;
        String operaciones = Integer.toString(c1, base);
         System.out.print(" "+operaciones);  
        return operaciones;
    }
        
         public String MultiplicacionBinaria(String a, String b, int base)
    {   
        operaciones="";
        int a1 = Integer.parseInt(a, 10); 
        int b1 = Integer.parseInt(b, 10);
        int c1 = a1 * b1;
        String operaciones = Integer.toString(c1, base);
     System.out.print(""+operaciones);  
        return operaciones;
    }  
         public String DivisionBinaria(String a, String b, int base)
    {   
        operaciones="";
        int a1 = Integer.parseInt(a, 10); 
        int b1 = Integer.parseInt(b, 10);
        int c1 = a1 / b1;
        String operaciones = Integer.toString(c1, base);
     System.out.print(""+operaciones);  
        return operaciones;
    }  
    
    public void pasarBase10Parte1(String a)
    {
        num1=null;
       String[] numero = a.split("-");
    num1=new int[numero.length];    
    
    for(int i=0;i<numero.length;i++)
        {
        num1[i]=Integer.parseInt(numero[i]);
        }
    numero=null;
    }
    
    public int  PasarBase10Parte2( int [] b, int c)
    {
    int cont=0,ite=0;
    resultbase10=0;
    cont=b.length;   
    int a=0;
    while(cont>0)
    {especial=1;
    a=cont-1;   
    System.out.println("\n el valor de a es: "+a);
    while(a>0)
      {
      especial=especial*c;
      a--;
      }
     resultbase10=num1[ite]*especial+resultbase10;
     //System.out.println("\n operacion: "+ite+" "+num1[ite]+"*"+especial+"+"+resultbase10);
      cont--;
      ite++;
    }
    
    return resultbase10;
    }
    
    
    private static String convertir(double n, int b){
        String salida = "";
        int div=(int) n, mod=0;
        while(n>=b){
            div = (int) (n / b);
            mod = (int) (n % b);  
            salida = charAt(mod) + salida;
            n=div;
        }
        if(div > 0)
            salida = charAt(div) + salida;
        return salida;
    }
 
    private static String charAt(int pos){
        return String.valueOf("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(pos));
    }

    public CualquierBase() {
    }
    
}
