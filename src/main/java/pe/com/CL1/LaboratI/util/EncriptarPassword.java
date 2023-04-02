/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.CL1.LaboratI.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Alexjha
 */
public class EncriptarPassword {
    public static void main(String[] args) {
        
        
        
        var password = "123" ;
        
        System.out.println("password " + password );
        System.out.println("password encriptado " +   encriptarPassword(password)  );
        
    }
    
    public static  String encriptarPassword(String password){
        
        BCryptPasswordEncoder   encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    
    
    }
}
