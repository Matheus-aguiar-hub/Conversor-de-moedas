import java.util.Scanner;

public class Conversor {

    public String moedaOrigem;
    public String moedaDestino;
    public double valorCotacaoOrigem;
    public double valorCotacaoDestino;

    public void SolicitarDados(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Moeda de origem: ");
        moedaOrigem = scanner.nextLine();

        System.out.println("Moeda de Destino: ");
        moedaDestino = scanner.nextLine();

        System.out.println(" Qual o valor de 1 " + moedaOrigem + "em " + moedaDestino +"?");
        valorCotacaoOrigem = scanner.nextDouble();

        efetuarConversao();
    }

    private void efetuarConversao(){
        valorCotacaoDestino = 1 / valorCotacaoOrigem;
        exibirResultado();
    }

    private void exibirResultado(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("  R E S U L T A D O S");
        System.out.println("Moeda de origem " +moedaOrigem);
        System.out.println("Moeda de destino " +moedaDestino);
        String valorCotacaoDestinoComDoisDecimais = String.format("%.2f", valorCotacaoDestino);
        System.out.println("1 " + moedaOrigem + " = " +valorCotacaoDestinoComDoisDecimais + " " + moedaDestino );
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
    }

}