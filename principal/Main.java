package principal;


import java.util.Scanner;
import entidade.Forma;
import entidade.Retangulo;
import entidade.Triangulo;

public class Main{
	   public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        
	        System.out.println("Digite a Base: ");
	        double b = scn.nextDouble();
	        
	        System.out.println("Digite a largura: ");
	        double l = scn.nextDouble();
	        
	        System.out.println("Digite a altura:");
	        double a = scn.nextDouble();
	        
	        Forma x = new Triangulo(b, l, a);
	        Forma y = new Retangulo(b, l, a);
	        
	        System.out.println("Opções: ");
	        System.out.println("1. Triangulo");
	        System.out.println("2. Retangulo");
	        System.out.println("3. Sair");
	        System.out.println("Digite a opção desejada: ");
	        int opcao = scn.nextInt();
	        scn.nextLine();
	        
	        switch (opcao) {
	        case 1 :
	        	System.out.println();
	        	
	        	break;
	        	
	        case 2 : 
	        	System.out.println();
	        	
	        	break;
	        	
	        case 3: 
	        	System.out.println("Saindo....");
	        	return;
	        default:
	        	System.out.println("Opção invalida. Tente Novamente.");
	        
	        	
	        }
	        
	        if(opcao == 1) {
	        	System.out.println(x.mostrarinfo() + "Area: " + x.triangulo());
	        	
	        }else if(opcao == 2) {
	        	
	        	System.out.println(x.mostrarinfoo() + "Area:" + x.retangulo());
	        	
	        }

	     

	   }
}