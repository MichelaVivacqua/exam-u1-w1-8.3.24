package entities;

public abstract class ElementoMultimediale {
    protected String titolo;

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "titolo='" + titolo + '\'' +
                '}';
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public ElementoMultimediale (String titolo) {
        this.titolo=titolo;

}}
