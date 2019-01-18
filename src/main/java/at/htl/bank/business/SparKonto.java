package at.htl.bank.business;



public class SparKonto extends BankKonto {

        private double zinssatz;


    public SparKonto(String name, double anfangsBestand) {
        super(name, anfangsBestand);
    }

    public SparKonto(String name,double zinssatz,double anfangsBestand) {
        super(name,anfangsBestand);
        this.zinssatz = zinssatz;
    }

    public void zinsenAnrechnen( double zinssatz) {

    }

}
