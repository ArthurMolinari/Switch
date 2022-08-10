package Classe_Java;

import java.util.Scanner;

public class Switch_Certo {
    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    int c= 0;
     System.out.println("Informe o valor de a:");
     int a = entrada.nextInt();
     System.out.println("Informe o valor de b:");
     int b = entrada.nextInt();
     System.out.println("Informe o código, 3, 4 ou 5");
      int codigo = entrada.nextInt();
      switch (codigo){
              case 3:
                  c=a+b;
                  System.out.println(c+(c*20)/100);
                  System.out.println("O resultado é: " + c);
                  break;
              case 4:
                  c=b-a;
                  System.out.println(c+(c*20)/100);
                  System.out.println("O resultado é: " + c);
                  break;
              case 5:
                  c=a+a;
                  System.out.println(c+(c*5)/100);
                  System.out.println("O resultado é: " + c);
                  break;
              default:
                  System.out.println("Código Inexistente");                  
}
}
}