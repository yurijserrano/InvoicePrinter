package Fatura;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yuri Serrano
 */
public class Endereco 
{
    private String rua;
    private String local;
    private String cidade;
    private String uf;
    private String cep;
    private String numero;

    
    /**
     * Aqui é retornado o nome da rua/avenida
     */
    public String getRua() 
    {
        return rua;
    }
    
    /**
     * Aqui é retornado o nome do local
     */
    public String getLocal() 
    {
        return local;
    }
    
    /**
     * Aqui é retornado o nome da cidade.
     */
    public String getCidade() 
    {
        return cidade;
    }
    
    /**
     * Aqui é retornado o nome da UF
     */
    public String getUf() 
    {
        return uf;
    }

    /**
     * Aqui é retornado o CEP
     */
    public String getCep() 
    {
        return cep;
    }

    /**
     * Aqui é retornado o número
     */
    public String getNumero() 
    {
        return numero;
    }
    
    /**
     * Construtor da Classe Endereço que recebe o  local,a rua/avenida,o número,a cidade,o uf e o cep
     * como parâmetros,sendo inicializados dentro do construtor.
     */
    public Endereco(String local,String rua,String numero,String cidade,String uf,String cep)
    {
        this.local=local;
        this.rua=rua;
        this.numero=numero;
        this.cidade=cidade;
        this.uf=uf;
        this.cep=cep;
    }
    
    
}
