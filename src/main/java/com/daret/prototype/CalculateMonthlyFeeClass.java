/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daret.prototype;

/**
 *
 * @author hp
 */
public final class CalculateMonthlyFeeClass {
    
    public static int calculateMonthlyFee(int months, int amount){
    
        int monthlyFee=0;
        
        monthlyFee=amount/months;
        
    return monthlyFee;
    }
    
}
