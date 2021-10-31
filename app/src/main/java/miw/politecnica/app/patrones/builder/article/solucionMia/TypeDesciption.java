package miw.politecnica.app.patrones.builder.article.solucionMia;

public class TypeDesciption {

    private final long id;
    private String nameDescription;
    private int numberOfDescription;

    public TypeDesciption(long id) {
        this.id = id;
    }

    public String getNameDescription() {
        return nameDescription;
    }

    public void setNameDescription(String nameDescription) {
        this.nameDescription = nameDescription;
    }

    public int getNumberOfDescription() {
        return numberOfDescription;
    }

    public void setNumberOfDescription(int numberOfDescription) {
        this.numberOfDescription = numberOfDescription;
    }

    @Override
    public String toString() {
        return "TypeDesciption{" +
                "nameDescription='" + nameDescription + '\'' +
                ", numberOfDescription=" + numberOfDescription +
                '}';
    }
}
