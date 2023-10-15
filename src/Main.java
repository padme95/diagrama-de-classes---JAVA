public class Main {

	public static void main(String[] args) {
		iPhoneAparelhoTelefonico telefone = new iPhoneAparelhoTelefonico("iOS", "123-456-789");
        telefone.fazerLigacao("987-654-321");
        telefone.enviarMensagem("987-654-321", "Ol�, como voc� est�?");

        iPhoneReprodutorMusical reprodutor = new iPhoneReprodutorMusical("iOS", "123-456-789");
        reprodutor.adicionarMusica(new Musica("M�sica 1", "Artista 1"));
        reprodutor.tocarMusica();

        iPhoneNavegadorInternet navegador = new iPhoneNavegadorInternet("iOS", "123-456-789");
        navegador.abrirNavegador();

	}

}
