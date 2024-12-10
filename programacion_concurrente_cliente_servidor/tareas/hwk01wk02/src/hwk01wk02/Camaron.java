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
public class Camaron extends Acuatico{
    
    private boolean crestaDorsal;

    public Camaron() {
        super();
    }

    public Camaron(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio, String tipoDeAgua, int profundidadNadoPromedio, boolean crestaDorsal) {
        super(peso, altura, nombreCientifico, tiempoVidaPromedio, tipoDeAgua, profundidadNadoPromedio);
        this.crestaDorsal = crestaDorsal;
    }

    public boolean isCrestaDorsal() {
        return crestaDorsal;
    }

    public void setCrestaDorsal(boolean crestaDorsal) {
        this.crestaDorsal = crestaDorsal;
    }

    @Override
    public String toString() {
        return "Camaron{" + super.toString() + "crestaDorsal=" + crestaDorsal + '}';
    }
    
}
