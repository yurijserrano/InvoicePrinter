package Fatura;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yuri Serrano
 */
 import java.util.ArrayList;
 
public class Invoice 
{
   private Endereco end;
   private ArrayList<Linha> linhas=new ArrayList<Linha>();
   private double calc;
   
  /**
   * Construtor da classe Invoice que recebe endereco como parametro,bem como 
   * seus elementos também.
   */
   public Invoice (Endereco end)
   {
       this.end=end;
   }
   
   /**
    * Este é o método adicionar,que faz a inserção dos produtos dentro de uma
    * ArrayList do tipo Linhas.
    */
   public void add(Produto p,int qte)
   {      
       Linha l= new Linha(p,qte);       
       linhas.add(l);      
   }
   
   
   /**
    *Aqui é realizado a formatação e a geração da fatura,sendo retornado a 
    * fatura pronta.
    */
   public String format()
   {
       String format = "\t\tFatura(Invoice)\n\n\n"+this.end.getLocal()+"\n"+this.end.getRua()+","+this.end.getNumero()+"\n"
               +this.end.getCidade()+","+this.end.getUf()+","+this.end.getCep()+"\n"+"\nDescrição\t\tPreço\t\tQtd\t\tTotal\n";   
       
       for(int i=0;i<linhas.size();i++)
       {
           if(linhas.get(i).getP().getDescricao().length()<8)
           {
                format+=String.format("%s\t\t\t%.2f\t\t%d\t\t%.2f\n",linhas.get(i).getP().getDescricao(),linhas.get(i).getP().getPreco(),linhas.get(i).getQte(),linhas.get(i).getTotal());
                this.calc+=linhas.get(i).getTotal();
           }
           
           else
           {
               format+=String.format("%s\t\t%.2f\t\t%d\t\t%.2f\n",linhas.get(i).getP().getDescricao(),linhas.get(i).getP().getPreco(),linhas.get(i).getQte(),linhas.get(i).getTotal());
               this.calc+=linhas.get(i).getTotal();
           }
           
       }   
       
       format+="\nTOTAL:"+this.calc;
       
       return format;
       
   }
    
}
