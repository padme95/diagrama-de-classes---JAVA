class iPhoneNavegadorInternet extends Iphone implements NavegadorInternet {
    public iPhoneNavegadorInternet(String sistemaOperacional, String numeroTelefone) {
        super(sistemaOperacional, numeroTelefone);
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Navegador da internet aberto.");
    }
}