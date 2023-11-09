package week6.lab;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> promissoryNote;

    public PromissoryNote() {
        this.promissoryNote = new HashMap<String, Double>();
    }

    public void setLoan(String name, double debt) {
        this.promissoryNote.put(name, debt);
    }

    public double howMuchIsTheDebt(String name) {
        if (!this.promissoryNote.containsKey(name)) return -1;
        return this.promissoryNote.get(name);
    }


}
