/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_josuevidal;

/**
 *
 * @author josue
 */
public class Universos {
   private int codigo;
   private int edad;
   private int peso;

    public Universos() {
    }

    public Universos(int codigo, int edad, int peso) {
        this.codigo = codigo;
        this.edad = edad;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Universos{" + "codigo=" + codigo + ", edad=" + edad + ", peso=" + peso + '}';
    }
   
}
