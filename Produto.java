package Fatura;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yuri Serrano
 */
public class Produto 
{
    private String descricao;
    private double preco;

    
    /**
     * Construtor da Classe Produto que recebe um produto e seu preço
     */
    public Produto(String descricao,double preco)
    {
        this.descricao=descricao;
        this.preco=preco;
    }
    
    /**
     * Aqui é retornado o produto.
     */
    public String getDescricao() 
    {
        return descricao;
    }

    /**
     * Aqui é retornado o preço do produto.
     */
    public double getPreco() 
    {
        return preco;
    }
    
    
}
