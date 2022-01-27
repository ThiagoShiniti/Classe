package Classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data data1 = new Data();
		
		data1.dia = 25;
		data1.mes = 01;
		data1.ano = 2022;
		
		Data data2 = new Data();
		
		data2.dia = 26;
		data2.mes = 01;
		data2.ano = 2022;
		
		System.out.printf("A primeira data é %d/%d/%d", data1.dia, data1.mes, data1.ano);
		System.out.printf("\nA segunda data é %d/%d/%d", data2.dia, data2.mes, data2.ano);
		
			
	}

}
