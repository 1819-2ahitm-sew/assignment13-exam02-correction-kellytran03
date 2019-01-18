package at.htl.bank.business;

public class GiroKonto extends BankKonto {

     private double gebuehr;


    public GiroKonto(String name, double anfangsBestand) {
        super(name, anfangsBestand);
    }

    public GiroKonto(String name,double anfangsBestand, double gebuehr) {
        super(name,anfangsBestand);
        this.gebuehr = gebuehr;
    }


    @Override
    public void abheben(double betrag) {
        kontoStand = betrag - gebuehr;

    }

    @Override
    public void einzahlen(double betrag) {
        kontoStand = kontoStand + betrag + gebuehr;
    }

}
