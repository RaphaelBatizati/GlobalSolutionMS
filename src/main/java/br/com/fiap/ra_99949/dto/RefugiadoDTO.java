package br.com.fiap.ra_99949.dto;

public class RefugiadoDTO {

    private String nome;
    private int idade;
    private String genero;
    private String localAtual;
    private String statusSaude;

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getLocalAtual() { return localAtual; }
    public void setLocalAtual(String localAtual) { this.localAtual = localAtual; }
    public String getStatusSaude() { return statusSaude; }
    public void setStatusSaude(String statusSaude) { this.statusSaude = statusSaude; }
}
