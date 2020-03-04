package com.example.recyclerfragment;

public class ModelPahlawan {
    private String namaPahlawan;
    private String detailPahlawan;
    private int heroImage;

    public String getHeroName() {
        return namaPahlawan;
    }

    public void setHeroName(String namaPahlawan) {
        this.namaPahlawan = namaPahlawan;
    }

    public String getHeroDetail() {
        return detailPahlawan;
    }

    public void setHeroDetail(String detailPahlawan) {
        this.detailPahlawan = detailPahlawan;
    }

    public int getHeroImage() {
        return heroImage;
    }

    public void setHeroImage(int heroImage) {
        this.heroImage = heroImage;
    }
}
