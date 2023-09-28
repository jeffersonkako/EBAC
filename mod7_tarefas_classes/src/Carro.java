// Esta é a classe Carro, que representa um objeto do mundo real.
public class Carro {
    // Propriedades do carro
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean motorLigado;

    // Construtor para inicializar as propriedades do carro
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motorLigado = false; // O motor começa desligado por padrão
    }

    // Método para ligar o motor do carro
    public void ligarMotor() {
        if (!motorLigado) {
            System.out.println("Motor ligado.");
            motorLigado = true;
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    // Método para desligar o motor do carro
    public void desligarMotor() {
        if (motorLigado) {
            System.out.println("Motor desligado.");
            motorLigado = false;
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Motor está ligado: " + (motorLigado ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        // Criando uma instância de carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Prata");

        // Exibindo informações iniciais
        meuCarro.exibirInformacoes();

        // Ligando o motor
        meuCarro.ligarMotor();

        // Tentando ligar o motor novamente
        meuCarro.ligarMotor();

        // Desligando o motor
        meuCarro.desligarMotor();

        // Exibindo informações atualizadas
        meuCarro.exibirInformacoes();
    }
}
