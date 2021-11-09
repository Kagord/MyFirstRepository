package bsu.rfe.java.group10.lab1.Gordienko.var;

public class ChewingGum extends Food {
    private String fill;

    public ChewingGum(String flavour) {
        super("Жевательная резинка");
        this.fill = flavour;
    }

    public void consume() {
        System.out.println(this + "съедено");
    }

    public String getFill() {
        return fill;
    }
    public void setFill(String fill) {
        this.fill = fill;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof ChewingGum)) return false;
            return fill.equals(((ChewingGum) arg0).fill);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " привкус '" + fill.toUpperCase() + "'";
    }
}
