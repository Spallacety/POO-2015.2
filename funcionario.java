import java.util.Scanner;

class Data{
	int dia;
	int mes;
	int ano;

	String formatada(){
		return dia+"/"+mes+"/"+ano;
	}
}

class Funcionario{
	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada;
	String rg;
	boolean estaNaEmpresa;

	public void recebeAumento(int n){
		salario += n;
	}

	public double calculaGanhoAnual(){
		return salario*12.0;
	}

	void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario: "+this.salario);
		System.out.println("Data de Entrada: "+this.dataDeEntrada.formatada());
	}
}

class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Danilo";
		f1.salario = 100;
		f1.dataDeEntrada = new Data();
		f1.dataDeEntrada.dia = 02;
		f1.dataDeEntrada.mes = 07;
		f1.dataDeEntrada.ano = 14;

		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;
		f2.dataDeEntrada = new Data();
		f2.dataDeEntrada.dia = 02;
		f2.dataDeEntrada.mes = 07;
		f2.dataDeEntrada.ano = 14;

		Funcionario f3 = f1;

		//Funcionario.salario = 1234;  - dá erro!
		//Funcionario.calculaGanhoAnual;

		if (f1 == f2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}

		if (f1 == f3) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}

		f1.mostra();
		f2.mostra();
		f3.mostra();
	}
}