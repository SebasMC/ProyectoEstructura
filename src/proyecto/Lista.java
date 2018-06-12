/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JTextArea;

/**
 *
 * @author Sala
 */
public class Lista {

    private Nodo r = null;
    private String numt;

    public Lista(String numt) {
        this.numt = numt;
    }

    public String getNumt() {
        return numt;
    }

    public void setNumt(String numt) {
        this.numt = numt;
    }

    /**
     * @return the r
     */
    public Nodo getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Nodo r) {
        this.r = r;
    }

    public void inserta(Nodo obj) {
        if (obj != null) {
            if (r == null) {
                r = obj;
            } else {
                if (r.getCve().compareTo(obj.getCve()) > 0) {
                    obj.setSig(r);
                    r.setAnt(obj);
                    r = obj;
                } else {
                    Nodo aux = r;
                    boolean b = true;
                    while (aux.getSig() != null && b) {
                        if (aux.getSig().getCve().compareTo(obj.getCve()) > 0) {
                            obj.setSig(aux.getSig());
                            obj.setAnt(aux);
                            aux.getSig().setAnt(obj);
                            aux.setSig(obj);
                            b = false;
                        } else {
                            aux = aux.getSig();
                        }
                    }
                    if (b) {
                        obj.setAnt(aux);
                        aux.setSig(obj);
                    }
                }
            }
        } else {
            System.out.println("no se puede insertar");
        }
    }

    public String desp(Nodo aux) {
        String s = "";
        while (aux != null) {
            s += ((Vuelo) aux.getObj()).desp() + "\n************************\n";
            aux = aux.getSig();
        }
        return s;
    }

    public Nodo elimina(String cve) {
        Nodo aux = null;
        if (r != null) {
            if (r.getCve().equals(cve)) {
                aux = r;
                r = aux.getSig();
                if (r != null) {
                    r.setAnt(null);
                }
                aux.setSig(null);
            } else {
                Nodo aux2 = r;
                boolean b = true;
                while (aux2.getSig() != null && b) {
                    if (aux2.getSig().getCve().equals(cve)) {
                        aux = aux2.getSig();
                        aux2.setSig(aux.getSig());
                        aux.getSig().setAnt(aux2);
                        aux.setAnt(null);
                        aux.setSig(null);
                        b = false;
                    } else {
                        aux2 = aux2.getSig();
                    }
                }
            }
        }
        return aux;
    }

    public void desplegarV(String cve, JTextArea jta) {
        Nodo aux;
        Vuelo temp;
        jta.setText("");
        if (r != null) {
            if (r.getCve().equals(cve)) {
                temp = (Vuelo)r.getObj();
                jta.setText(temp.desp());
            } else {
                Nodo aux2 = r;
                boolean b = true;
                while (aux2.getSig() != null && b) {
                    if (aux2.getSig().getCve().equals(cve)) {
                        aux = aux2.getSig();
                        temp = (Vuelo)aux.getObj();
                        jta.setText(temp.desp());
                        b = false;
                    } else {
                        aux2 = aux2.getSig();
                    }
                }
            }
        }
    }
}
