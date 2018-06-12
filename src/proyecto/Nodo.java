/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;


/**
 *
 * @author Sala
 */
public class Nodo
{

    private String cve;
    private Object obj;
    private Nodo sig = null;
    private Nodo ant = null;
    private Nodo abj = null;

    public Nodo()
    {
    }

    public Nodo(Object obj, String cve)
    {
        this.cve = cve ;
        this.obj = obj;
    }

    public Nodo(Object obj) {
        this.obj = obj;
    }
    
    

    /**
     * @return the cve
     */
    public String getCve()
    {
        return cve;
    }

    /**
     * @param cve the cve to set
     */
    public void setCve(String cve)
    {
        this.cve = cve;
    }

    /**
     * @return the obj
     */
    public Object getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    /**
     * @return the sig
     */
    public Nodo getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nodo sig)
    {
        this.sig = sig;
    }

    /**
     * @return the ant
     */
    public Nodo getAnt()
    {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(Nodo ant)
    {
        this.ant = ant;
    }

    /**
     * @return the abj
     */
    public Nodo getAbj()
    {
        return abj;
    }

    /**
     * @param abj the abj to set
     */
    public void setAbj(Nodo abj)
    {
        this.abj = abj;
    }
    
    
    
}
