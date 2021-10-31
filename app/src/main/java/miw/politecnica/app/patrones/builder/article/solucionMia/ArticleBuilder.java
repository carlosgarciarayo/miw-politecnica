package miw.politecnica.app.patrones.builder.article.solucionMia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArticleBuilder implements IBuilder{

    private final long id;

    private final List<Long> phones = new ArrayList<>();

    private String reference;

    private String description;

    private BigDecimal retailPrice;

    private int stock;

    private List<String> tags;

    private BigDecimal wholesalePrice;

    private TypeDesciption typeDesciption;

    private String nameDescription;
    private int numberOfDescription;

    public ArticleBuilder(long id) {
        this.id = id;
    }

    public ArticleBuilder withReference(String reference) {
        this.reference = reference;
        return this;
    }

    public ArticleBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ArticleBuilder withRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
        return this;
    }

    public ArticleBuilder withStock(int stock) {
        this.stock = stock;
        return this;
    }

    public ArticleBuilder withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ArticleBuilder withWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
        return this;
    }

    public ArticleBuilder withTypeDesciption(TypeDesciption typeDesciption) {
        this.typeDesciption = typeDesciption;
        return this;
    }

    @Override
    public Article build() {

        Article article = new Article(1234);

//        article.addPhone(new ArrayList<>());
        article.setReference(this.reference);
        article.setDescription(this.description);
        article.setStock(this.stock);
        article.setTags(new ArrayList<>());
        article.setWholesalePrice(this.wholesalePrice);
        article.setTypeDesciption(this.typeDesciption);

        return article;
    }

    @Override
    public TypeDesciption buildType() {
        TypeDesciption typeDesciption = new TypeDesciption(254);

        typeDesciption.setNameDescription(this.nameDescription);
        typeDesciption.setNameDescription(this.nameDescription);

        return typeDesciption;
    }

    @Override
    public String toString() {
        return "ArticleBuilder{" +
                "id=" + id +
                ", phones=" + phones +
                ", reference='" + reference + '\'' +
                ", description='" + description + '\'' +
                ", retailPrice=" + retailPrice +
                ", stock=" + stock +
                ", tags=" + tags +
                ", wholesalePrice=" + wholesalePrice +
                ", typeDesciption=" + typeDesciption +
                '}';
    }
}
