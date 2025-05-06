package mx.unam.aragon.ico.is.computadoraApi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Table(name = "computadoras")

public class Computadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto_increment
    private int clave;
    @Column(name = "marca_computadora", nullable = false, length = 55)
    private String marca;
    @Column(name = "modelo_computadora", columnDefinition = "VARCHAR(50) not null")
    private String modelo;
    @Column(name = "url_foto", nullable = true,
            insertable = false,
            columnDefinition = "VARCHAR(250) default 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-zz7-KGhhRP7yDsRuOp1kbQpk9MvFwNiR0A&s'"
    )
    private String foto;
    @Column(name = "precio_pesos", nullable = true)
    private float precio;

    @Override
    public String toString() {
        return "Computadora{" +
                "clave=" + clave +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", foto='" + foto + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computadora that = (Computadora) o;
        return clave == that.clave && Float.compare(precio, that.precio) == 0 && Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo) && Objects.equals(foto, that.foto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave, marca, modelo, foto, precio);
    }

    public Computadora() {
    }

    public Computadora(int clave, String marca, String modelo, String foto, float precio) {
        this.clave = clave;
        this.marca = marca;
        this.modelo = modelo;
        this.foto = foto;
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
