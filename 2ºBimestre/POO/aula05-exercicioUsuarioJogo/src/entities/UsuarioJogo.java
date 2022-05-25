package entities;

public class UsuarioJogo {

    private String nome;
    private String nickName;
    private int pontuacao;
    private int nivel;

    // Construtor padrão
    public UsuarioJogo() {

    }

    // Construtor Customizado
    public UsuarioJogo(String nome, String nickName, int pontuacao, int nivel) {
        this.nome = nome;
        this.nickName = nickName;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }
    public UsuarioJogo(String nome, String nickName){
        this.nome = nome;
        this.nickName = nickName;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    // Métodos Customizados
    public void aumentarPontuacao(int pontuacao){
        this.pontuacao = this.pontuacao + pontuacao;
        System.out.println(this.nickName +" aumentou seus pontos em "+ pontuacao);
    }
    public void subirNivel(int nivel){
        this.nivel = this.nivel + nivel;
        System.out.println(this.nickName + " subiu de nível!!");
    }

    public void bonus(int valor){
        this.pontuacao = this.pontuacao + valor;
        System.out.println("Você ganhou um Bônus de %d pontos!!" + pontuacao);
    }





    @Override
    public String toString() {
        return "UsuarioJogo{" +
                "nome='" + nome + '\'' +
                ", nickName='" + nickName + '\'' +
                ", pontuacao=" + pontuacao +
                ", nivel=" + nivel +
                '}';
    }
}
