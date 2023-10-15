

import java.util.ArrayList;

// Classe base para o iPhone
public class Iphone {
    private String sistemaOperacional;
    private String numeroTelefone;
    private ArrayList<Musica> bibliotecaMusical;

    public Iphone(String sistemaOperacional, String numeroTelefone) {
        this.sistemaOperacional = sistemaOperacional;
        this.numeroTelefone = numeroTelefone;
        this.bibliotecaMusical = new ArrayList<>();
    }

    public void fazerLigacao(String numero) {
        System.out.println("Chamando " + numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    public void abrirNavegador() {
        System.out.println("Abrindo navegador da internet.");
    }

    public void tocarMusica() {
        System.out.println("Tocando música...");
    }
}
