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
public class Criaturas {

    private String raza;
    private int energia;
    private int anos;
    private String region;
    private int vivos;
    private int peso;
    ArrayList objetos = new ArrayList();

    public Criaturas() {
    }

    public Criaturas(String raza, int energia, int anos, String region, int vivos, int peso) {
        this.raza = raza;
        this.energia = energia;
        this.anos = anos;
        this.region = region;
        this.vivos = vivos;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVivos() {
        return vivos;
    }

    public void setVivos(int vivos) {
        this.vivos = vivos;
    }

    public ArrayList getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList objetos) {
        this.objetos = objetos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  raza;
    }

}
