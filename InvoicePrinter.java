package Fatura;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuri Serrano
 */
public class InvoicePrinter 
{
    public static void main(String[] args) 
    { 
        Endereco enderecoFatura = new Endereco("Mack Lab","Consolação","1234","São Paulo","SP","04411-000");
        Invoice mackInvoice = new Invoice(enderecoFatura);
        
        mackInvoice.add(new Produto("Regua T",12.50), 10); 
        mackInvoice.add(new Produto("Esquadro",32.50), 1); 
        mackInvoice.add(new Produto("Caneta",2.50), 4);
        
        System.out.println(mackInvoice.format());
               
        
    } 

    
    }
