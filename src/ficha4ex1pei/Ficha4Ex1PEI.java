/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ex1pei;

/**
 *
 * @author User
 */
public class Ficha4Ex1PEI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XMLManagement xml=new XMLManagement("src/ficha4ex1pei/binario.xml", "src/ficha4ex1pei/validateBinario.xsd");
        
       if(xml.read(true)){
           System.out.println("leu o ficheiro");
           if(xml.validate(true)){
               System.out.println("ficheiro validado");
           }
       }
    }
    
}
