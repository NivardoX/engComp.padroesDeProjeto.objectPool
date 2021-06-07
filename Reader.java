/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectPool.ExercicioI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Rick Vidal
 */
public class Reader {
    private String identificador;
    private BufferedReader leitor;

    public Reader(){
    }

    public Reader(String identificador, String nomeArquivo){
        this.identificador = identificador;
        try {
            this.leitor = new BufferedReader(new FileReader(new File(nomeArquivo)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BufferedReader getLeitor(){
        return this.leitor;
    }

    public String getIdentificador(){
        return this.identificador;
    }
    
    public void lerArquivo() throws IOException{
        System.out.println("Iniciando leitura de arquivo com o " + this.identificador);
        while(leitor.ready()){
            System.out.println(leitor.readLine());
        }
    }

    @Override
    public String toString(){
        return "O reader " + this.identificador + " está sendo usado";
    }
}
