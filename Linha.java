package Fatura;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yuri Serrano
 */


public class Linha 
{

    private Produto p; 
    private  int qte;
    private double total;
    
    /**
     * Construtor da classe Linha que recebe Produto(E seus elementos) e a 
     * quantidade destes produtos.
     */
    public Linha(Produto p,int qte)
    {
        this.p=p;
        this.qte=qte;
    }
    
    /**
     * Aqui é retornado a quantidade dos produtos
     */
     public int getQte() 
     {
        return qte;
    }

    /**
     * Aqui é retornado o custo total dos produtos mediante as suas respectivas
     * quantidades.
     */
    public double getTotal() 
    {
        this.total=(double) (this.qte*p.getPreco());
        return total;
    }
    
    /**
     * Aqui é retornado os elementos contidos em Produto
     */
    public Produto getP() 
    {
        return p;
    }
    
   
    
    
    
}
