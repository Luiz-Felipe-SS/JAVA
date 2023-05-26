package Pratica25_05_2023;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro fit = new Carro();
		
		fit.marca = "Honda";
		fit.ano = 2010;
		fit.preco = 55000;
		
		fit.mostraCarro();
		
		// Pergunta: no objeto fit voce consegue acessar o atributo portamalas ? Por que ?
		// R: Não, pois esse atributo não existi na minha classe pai "Carro"
		
		Sedan civic = new Sedan();
		
		civic.marca = "Honda";
		civic.ano = 2014;
		civic.preco = 75000;
		civic.portamalas = 450;
		
		civic.mostraCarro();
		
		// Pergunta: o objeto civic consegue chamar o método mostraCarro() ? Por que ? Se sim, chame esse método.
		//R: Sim, pois esse metodo foi herdado para minha classe filha "Sedan"
		
		// Pergunta: o objeto civic consegue acessar o atributo portamalas ? Por que ?
		//R: Sim, pois foi atributo que ele recebeu quando criado
		
		// Pergunta: o objeto civic consegue acessar o atributo potencia ? Por que ?
		// R: Não, pois esse foi um atributo passado para minha classe "Esportivo"
		
		Esportivo nsx = new Esportivo(); 
		
		nsx.marca = "Honda";
		nsx.ano = 2021;
		nsx.preco = 12000;
		nsx.preco = 560;
		
		nsx.mostraCarro();
		
		// Pergunta: o objeto nsx consegue chamar o método mostraCarro() ? Por que ? Se sim, chame esse método.
		// R: Sim, pois esse metodo foi herdado para minha classe filha "nsx"
		
		// Pergunta: o objeto nsx consegue acessar o atributo potencia ? Por que ?
		// R: Sim, pois foi atributo que ele recebeu quando criado
		
		// Pergunta: o objeto nsx consegue acessar o atributo portamalas ? Por que ?
		// R: Não, pois esse foi um atributo passado para minha classe "Sedan"
		
		// Altere os atributos da classe Carro para private. O que aconteceu ? Por que ?
		// R: Não consigui 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
