/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Renato
 */
public class GeradordeLog {
    
    private String logStatus;
    
    public void gerarString(String str) {
        logStatus = logStatus + str;
    }
    
    public void gerarLog() throws IOException {
        FileWriter arq = new FileWriter("C:\\workspace\\projeto-crud-web\\crud-web\\log\\log.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(logStatus);
        arq.close();
    }
    
    public void limpaString() {
        logStatus = "";
    }
}
