package br.com.etecia.myapp;

public class Filmes {
    private String titulo;
    private String categoria;
    private String desc;
    private String rat;
    private int imgFilmes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRat() {
        return rat;
    }

    public void setRat(String rat) {
        this.rat = rat;
    }

    public int getImgFilmes() {
        return imgFilmes;
    }

    public void setImgFilmes(int imgFilmes) {
        this.imgFilmes = imgFilmes;
    }

    public Filmes(String titulo, String categoria, String desc, String rat, int imgFilmes) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.desc = desc;
        this.rat = rat;
        this.imgFilmes = imgFilmes;


    }
}
