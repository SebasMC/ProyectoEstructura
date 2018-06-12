/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author user
 */
public class Cola
{

    private Nodo atras;
    private Nodo frente;

    /**
     * @return the atras
     */
    public Nodo getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Nodo atras)
    {
        this.atras = atras;
    }

    /**
     * @return the frente
     */
    public Nodo getFrente()
    {
        return frente;
    }

    /**
     * @param frente the frente to set
     */
    public void setFrente(Nodo frente)
    {
        this.frente = frente;
    }

    public String insertar(Nodo n)
    {
        if (n == null)
        {
            return "No se Puede Insertar";
        } else
        {
            if (frente == null)
            {
                frente = n;
            }
            if (atras != null)
            {
                atras.setSig(n);
            }
            atras = n;
        }
        return "Se Inserto el Nodo";
    }

    public Nodo eliminar()
    {
        Nodo e = null;
        if (frente == null)
        {
            System.out.println("Cola Vacia");
        } else
        {
            e = frente;
            frente = e.getSig();
            if (frente == null)
            {
                frente = atras = null;
            }
            e.setSig(null);
        }
        return e;
    }

}
