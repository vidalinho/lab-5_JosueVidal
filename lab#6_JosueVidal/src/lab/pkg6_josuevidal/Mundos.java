/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_josuevidal;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Mundos {
    private String nombre;
    private int peso;
    ArrayList <Criaturas> creature=new ArrayList();

    public Mundos() {
    }

    public Mundos(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<Criaturas> getCreature() {
        return creature;
    }

    public void setCreature(ArrayList<Criaturas> creature) {
        this.creature = creature;
    }
    
}
