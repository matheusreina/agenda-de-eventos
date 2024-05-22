public class Evento {
    private String nome;
    private String atracao;


    public Evento(String nome, String atracao) {
        setNome(nome);
        setAtracao(atracao);
    }

    @Override
    public String toString() {
        return " ~"+getNome()+" | Atração: "+getAtracao()+" }";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }
}
