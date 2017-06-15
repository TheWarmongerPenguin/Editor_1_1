// <editor-fold defaultstate="collapsed" desc="License">
/*
 * I told you that copy was not the way to do it
 */
// </editor-fold>
package editor_1_1;

import java.io.PrintWriter;

/**
 *
 * @author Samuele Pozzebon
 */
public class PHPAutoCompilator {
    private String host, username, password;
    private String[] campi;
    private String compiled;

    public PHPAutoCompilator(String host, String username, String password, String[] campi) {
        this.host = host;
        this.username = username;
        this.password = password;
        this.campi = campi;
        
        compiler();
    }
    
    private void compiler() {
        compiled = "<?php\n" +
        "    class getDb{\n" +
        "            function getInfo(){\n" +
        "                return array(\""+host+"\", \""+username+"\", \""+password+"\"";
        int cont = 0;
        while(cont < campi.length) {
            compiled = compiled + ", \"" + campi[cont] + "\"";
            cont++;
        }
        compiled = compiled + ");\n" +
        "            }\n" +
        "    }\n" +
        "?>";
        
        print();
    }
    
    private void print() {
        try {
            PrintWriter file = new PrintWriter("getDb.php");
            file.println(compiled);
            file.close();
        }
        catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }
}
