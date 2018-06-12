/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JComboBox;

/**
 *
 * @author Sala
 */
public class Manipula {

    public static Nodo busca(Nodo r, String cve) {
        while (r != null) {
            if (r.getCve().equals(cve)) {
                return r;
            }
            r = r.getSig();
        }
        return null;
    }

    public static String desplegarCola(Cola c) {
        String s = "";
        Cola aux = c;
        Vuelo temp;
        while (aux.getAtras() != null) {
            temp = (Vuelo) aux.eliminar().getObj();
            s += temp.desp()+"\n***************************\n";
        }
        return s;
    }

    public static Lista[] crearTerm(int num) {
        Lista[] terminales = new Lista[num];
        for (int i = 0; i < terminales.length; i++) {
            terminales[i] = new Lista(String.valueOf(i + 1));
        }

        return terminales;
    }

    public static void cargaCombo(Lista[] term, JComboBox jcb) {
        for (int i = 0; i < term.length; i++) {
            jcb.addItem(term[i].getNumt());
        }
    }

    public static void cargaCombo(Nodo r, JComboBox jcb) {
        while (r != null) {
            jcb.addItem(r.getCve());
            r = r.getSig();
        }
    }
}
