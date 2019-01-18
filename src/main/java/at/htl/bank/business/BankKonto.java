package at.htl.bank.business;

public class BankKonto {




    private String name;
    protected double kontoStand;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public void setKontoStand(double kontoStand) {
        this.kontoStand = kontoStand;
    }


    public BankKonto(String name, double anfangsBestand) {
        this.name = name;
        this.kontoStand = anfangsBestand;
    }

    public BankKonto(String name) {
        this.name = name;
    }

    public void einzahlen(double betrag) {

            kontoStand = kontoStand - betrag;
    }

    public void abheben(double betrag) {
        kontoStand = kontoStand + betrag;
    }


}
