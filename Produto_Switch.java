package Classe_Java;

import java.util.Scanner;

public class Produto_Switch {
       public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    int c= 0;
    int valor = 0;
    int quant = 0;
    int desc = 0;
    float p1 = 0,p2 = 0, p3 = 0, p4 = 0;
    
     System.out.println("Informe o código do produto: 1 - 2 - 3 - 4");
     System.out.println("1 - Caneta - R$2.00");
     System.out.println("2 - Lápis - R$1.50");
     System.out.println("3 - Borracha - R$2.45");
     System.out.println("4 - Tesoura - R$3.20");
     int codigo = entrada.nextInt();
     
     if (quant==0){
     System.out.println("Informe a quantidade comprada:");
     quant = entrada.nextInt(); 
     }
      switch (codigo){
              case 1:
                  p1 += 2.00*quant;
                  desc += (p1-(p1*10)/100);
                  System.out.println("O valor total da nota: " + p1);
                  System.out.println("Valor com 10% de desconto: " + desc);
                  System.out.println("Quantidade de produtos comprados: " + quant);
                  break;
              case 2:
                  p2+= 1.50*quant;
                  desc += (p2-(p2*10)/100);
                  System.out.println("O valor total da nota: " + p2);
                  System.out.println("Valor com 10% de desconto: " + desc);
                  System.out.println("Quantidade de produtos comprados: " + quant);
                  break;
              case 3:
                  p3+= 2.45*quant;
                  desc += (p3-(p3*10)/100);
                  System.out.println("O valor total da nota: " + p3);
                  System.out.println("Valor com 10% de desconto: " + desc);
                  System.out.println("Quantidade de produtos comprados: " + quant);
                  break;
              case 4:
                  p4+= 3.20*quant;      
                  desc += (p4-(p4*10)/100);
                  System.out.println("O valor total da nota: " + p4);
                  System.out.println("Valor com 10% de desconto: " + desc);
                  System.out.println("Quantidade de produtos comprados: " + quant);
                  break;
              default:
                  System.out.println("Produto Inexistente");                  
}
}
}