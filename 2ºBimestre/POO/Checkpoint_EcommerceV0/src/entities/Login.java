package entities;
import entities.exception.MensagemException;

public class Login {

    protected String usuario;
    protected String senha;

    public Login() {
    }

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean verificarLogin() throws MensagemException {
        if (this.usuario.length() >= 4 && this.senha.length() >= 4) {
            System.out.println("Login bem sucedido!");
        } else {
            throw new MensagemException("{\n" +
                    "Error: Login e Senha devem ter mais de 4 caracteres" +
                    "\n}");
        }
        return false;
    }
}
