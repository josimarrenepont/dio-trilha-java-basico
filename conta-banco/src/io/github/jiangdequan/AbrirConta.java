package io.github.jiangdequan;

public class AbrirConta {

    // Atributos

    private Integer accountNumber;
    private String agency;
    private String clientName = "João Silva";
    private Double balance;

    public AbrirConta() {

    }

    public AbrirConta(Integer accountNumber, String agency, String clientName, Double balance) {
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public Integer getaccountNumber() {
        return accountNumber;
    }

    public void setaccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}