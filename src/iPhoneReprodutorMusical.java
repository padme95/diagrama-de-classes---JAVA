class iPhoneReprodutorMusical extends Iphone implements ReprodutorMusical {
    public iPhoneReprodutorMusical(String sistemaOperacional, String numeroTelefone) {
        super(sistemaOperacional, numeroTelefone);
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música da biblioteca musical.");
    }

	public void adicionarMusica(Musica musica) {
		 System.out.println("Adicionar música");
		
	}
}