/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk01wk02;

/**
 *
 * @author roger
 */
public class Acuatico extends Animal{
    
    private String tipoDeAgua;
    private int profundidadNadoPromedio;

    public Acuatico(){
        super();
    }

    public Acuatico(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio, String tipoDeAgua, int profundidadNadoPromedio) {
        super(peso, altura, nombreCientifico, tiempoVidaPromedio);
        this.tipoDeAgua = tipoDeAgua;
        this.profundidadNadoPromedio = profundidadNadoPromedio;
    }

    public String getTipoDeAgua() {
        return tipoDeAgua;
    }

    public void setTipoDeAgua(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }

    public int getProfundidadNadoPromedio() {
        return profundidadNadoPromedio;
    }

    public void setProfundidadNadoPromedio(int profundidadNadoPromedio) {
        this.profundidadNadoPromedio = profundidadNadoPromedio;
    }

    @Override
    public String toString() {
        return "Acuatico{" + super.toString() + "tipoDeAgua=" + tipoDeAgua + ", profundidadNadoPromedio=" + profundidadNadoPromedio + '}';
    }
    
}
