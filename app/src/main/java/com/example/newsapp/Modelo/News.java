package com.example.newsapp.Modelo;

public class News {
    private String titulo;
    private String fuente;
    private int imagen;

    public News(String titulo, String fuente, int imagen) {
        this.titulo = titulo;
        this.fuente = fuente;
        this.imagen = imagen;
    }

    public String getTitulo() { return titulo; }
    public String getFuente() { return fuente; }
    public int getImagen() { return imagen; }
}
