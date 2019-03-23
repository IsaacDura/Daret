/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daret.prototype;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hp
 */
@WebService(serviceName = "CalculateMonthlyFee")
public class CalculateMonthlyFee {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
     @WebMethod(operationName = "calculate")
    public int calculateMonthlyFee(int months, int amount){
    
        int monthlyFee=0;
        
        monthlyFee=amount/months;
        
    return monthlyFee;
    }
    
}
