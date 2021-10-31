package miw.politecnica.app.patrones.builder.article.solucionMia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Article {

    private final long id;

    private final List<Long> phones = new ArrayList<>();

    private String reference;

    private String description;

    private BigDecimal retailPrice;

    private int stock;

    private List<String> tags;

    private BigDecimal wholesalePrice;

    private TypeDesciption typeDesciption;

    public Article(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public List<Long> getPhones() {
        return phones;
    }

    public void addPhone(long phone) {
        phones.add(phone);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public TypeDesciption getTypeDesciption() {
        return typeDesciption;
    }

    public void setTypeDesciption(TypeDesciption typeDesciption) {
        this.typeDesciption = typeDesciption;
    }



}