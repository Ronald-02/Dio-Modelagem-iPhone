public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações dos métodos da interface ReprodutorMusical
    public void tocar() {
        System.out.println("Música tocando...");
    }
    
    public void pausar() {
        System.out.println("Música pausada.");
    }
    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
    
    // Implementações dos métodos da interface AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    public void atender() {
        System.out.println("Atendendo chamada.");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    // Implementações dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba...");
    }
    
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}