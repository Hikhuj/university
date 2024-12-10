/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

/**
 *
 * @author ulacit
 */
public class Memes {
    
    private String nombreMeme;
    private String tipoMeme;
    private String paisDelMeme;
    private int cantidadMeGustas;

    public Memes() {
    }

    public Memes(String nombreMeme, String tipoMeme, String paisDelMeme, int cantidadMeGustas) {
        this.nombreMeme = nombreMeme;
        this.tipoMeme = tipoMeme;
        this.paisDelMeme = paisDelMeme;
        this.cantidadMeGustas = cantidadMeGustas;
    }

    @Override
    public String toString() {
        return "Memes{" + "nombreMeme= " + nombreMeme + ", tipoMeme= " + tipoMeme + ", paisDelMeme= " + paisDelMeme + ", cantidadMeGustas= " + cantidadMeGustas + '}' + "\n";
    }
    
    public void setCantidadMeGustas(int cantidadMeGustas) {
        this.cantidadMeGustas = cantidadMeGustas;
    }

    public void setNombreMeme(String nombreMeme) {
        this.nombreMeme = nombreMeme;
    }

    public void setTipoMeme(String tipoMeme) {
        this.tipoMeme = tipoMeme;
    }

    public void setPaisDelMeme(String paisDelMeme) {
        this.paisDelMeme = paisDelMeme;
    }

    public int getCantidadMeGustas() {
        return cantidadMeGustas;
    }

    public String getNombreMeme() {
        return nombreMeme;
    }

    public String getTipoMeme() {
        return tipoMeme;
    }

    public String getPaisDelMeme() {
        return paisDelMeme;
    }
    
}
