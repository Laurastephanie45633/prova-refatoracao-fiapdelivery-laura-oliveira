package br.com.fiapdelivery.model;

public class Pacote {

    private String codigoRastreio;
    private double peso;
    private String status;

    //Construtor que inicia o pacote em "pendente"
 
    public Pacote(String codigoRastreio, double peso) {
        this.setCodigoRastreio(codigoRastreio);
        this.setPeso(peso);
        this.status = "Pendente"; // estado inicial padrão de negócio
    }

    public String getCodigoRastreio() {
        return this.codigoRastreio;
    }

    private void setCodigoRastreio(String codigoRastreio) {
        if (codigoRastreio != null && !codigoRastreio.trim().isEmpty()) {
            this.codigoRastreio = codigoRastreio;
        } else {
            System.out.println("Erro: Código de rastreio inválido!");
            this.codigoRastreio = "SEM_CODIGO";
        }
    }

    public double getPeso() {
        return this.peso;
    }

    private void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro: O peso do pacote deve ser maior que zero!");
            this.peso = 0.1;
        }
    }

    public String getStatus() {
        return this.status;
    }

    //Método para alterar o status do pacote

    public void atualizarStatus(String novoStatus) {
        if (novoStatus != null && !novoStatus.trim().isEmpty()) {
            this.status = novoStatus;
            System.out.println("Status do pacote " + this.codigoRastreio + " alterado para: " + this.status);
        } else {
            System.out.println("Erro: Status informado é inválido!");
        }
    }
}
