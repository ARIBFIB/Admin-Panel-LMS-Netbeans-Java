/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lms_adminpanel;

//import java.util.*;
import java.util.Properties;

/**
 *
 * @author Dell 5590
 */
public class Config {
    Properties configFile;
    
    public Config(){
        configFile = new java.util.Properties();
        try {
            configFile.load(this.getClass().getResourceAsStream("..//config.config"));
        } catch (Exception eta) {
            eta.printStackTrace();
        }
    }
    
    public String getProperty(String key){
        String value = this.configFile.getProperty(key);
        return value;
    }
}
