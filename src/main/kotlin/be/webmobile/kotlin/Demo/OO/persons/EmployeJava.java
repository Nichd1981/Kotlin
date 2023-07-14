package be.webmobile.kotlin.demo.oo.persons;

public class EmployeJava implements IPaie {

    private int solde = 0;

    @Override
    public int getSolde() {
        return this.solde;
    }

    @Override
    public void setSolde(int solde) {
        this.solde = solde;
    }

    @Override
    public void seFairePayer() {

    }
}
