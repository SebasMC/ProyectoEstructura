/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author 
 */
public class Vuelo {

    private String num_vuelo;
    private String destino;
    private String hora;
    private String num_t;

    public Vuelo(String num_vuelo, String destino, String hora, String num_t) {
        this.num_vuelo = num_vuelo;
        this.destino = destino;
        this.hora = hora;
        this.num_t = num_t;
    }
    
    /**
     * @return the num_vuelo
     */
    public String getNum_vuelo() {
        return num_vuelo;
    }

    /**
     * @param num_vuelo the num_vuelo to set
     */
    public void setNum_vuelo(String num_vuelo) {
        this.num_vuelo = num_vuelo;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the num_t
     */
    public String getNum_t() {
        return num_t;
    }

    /**
     * @param num_t the num_t to set
     */
    public void setNum_t(String num_t) {
        this.num_t = num_t;
    }
    
    public String desp() {
        return "Num. de vuelo : " + getNum_vuelo() + "\n"
                + "Destino : " + getDestino() + "\n"
                + "Hora : " + getHora() + "\n"
                + "Número de terminal : " + getNum_t() + "\n";
    }
}
