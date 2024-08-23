package entidade;

public class Forma {
	
		public double base;
		public double largura;
		public double altura;
	
		
		
		
		public Forma(double base, double largura, double altura) {
			this.base = base;
			this.largura = largura;
			this.altura = altura;
		}

		public double triangulo() {
			
			return base * altura /2;
		}

		public double retangulo() {
			
			return largura * altura;
			
		}
		
		public String mostrarinfo() {
			return " informaçoes do triangulo: Base: " + base + "Altura: " + altura;
		}
		public String mostrarinfoo() {
			return " informaçoes do retangulo : Largura: " + base + "Altura: " + altura;
		

	
			
		}


		
	}

