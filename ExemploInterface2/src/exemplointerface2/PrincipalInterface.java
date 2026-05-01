package exemplointerface2;

import java.util.Scanner;

public class PrincipalInterface {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        String nomeAux;
        double salarioAux;
        int diasAux;
        int horasAux;

        System.out.print("Informe o nome do funcionário mensalista: ");
        nomeAux = tc.nextLine();

        System.out.print("Entre com o salário bruto do mensalista: ");
        salarioAux = tc.nextDouble();

        FuncionarioMensalista fM = new FuncionarioMensalista(nomeAux, salarioAux);
        tc.nextLine();

        
        System.out.print("\nInforme o nome do funcionário diarista: ");
        nomeAux = tc.nextLine();
        
        System.out.print("Qual o valor da hora do funcionário diarista: ");
        salarioAux = tc.nextDouble();
        
        System.out.print("Quantos dias ele trabalhou? ");
        diasAux = tc.nextInt();
        
        System.out.print("Em média, quantas horas ele trabalhou por dia? ");
        horasAux = tc.nextInt();

        FuncionarioDiarista fD = new FuncionarioDiarista(nomeAux, salarioAux, diasAux, horasAux);

        System.out.println("\n\t\t Dados e salário do funcionário Mensalista ");
        System.out.println("\tNome: " + fM.nome);
        System.out.println("\tSalário Bruto: " + fM.calcularSalarioLiquido());
        
        
        System.out.println("\n\t\t Dados e salário do funcionário Diarista");
        System.out.println("\tNome: " + fD.nome);
        System.out.println("\tSalário Bruto: " + fD.calcularSalarioLiquido());
        System.out.println("\tTotal de horas trabalhados: " + fD.horasTrabalhadas());
    }
}
