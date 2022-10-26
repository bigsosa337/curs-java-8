package curs;

public class Cont {

    private String titular;
    private String  IBAN;


    public Cont(String titular, String IBAN) {
        this.titular = titular;
        this.IBAN = IBAN;

    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }


    public static  int balanta = 1000;
    public static  int cheltuieli = 0;

    public static synchronized void retragere(int valoare)
    {
        if(valoare<= balanta)
        {
            System.out.println("Valoare de retras: " + valoare);
            balanta -= valoare;
            cheltuieli += valoare;
            System.out.println("balanta: " +balanta);
            System.out.println("cheltuieli: " + cheltuieli);
        } else
            System.out.println("respins: " + valoare);
    }


}

