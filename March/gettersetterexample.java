/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author naimesh
 */
public class gettersetterexample {

    private String name;
    private String salutation;

// setter methods
    public void setName(String name) {
       this.name = name;
    }
     public void setSalutation(String salutation) {
       this.salutation = salutation;
    }
     
     
 //getter methods
    public String getSalutation() {
        return salutation;
    }
    public String getName() {
       return name;
    }
}
