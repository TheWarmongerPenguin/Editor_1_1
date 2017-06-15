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
public class SQLAutoCompilator {
    private String compiled;
    private String[] strings;
    
    public SQLAutoCompilator(String[] string) {
        strings = string;
        
        compiler();
    }

    private void compiler() {
        compiled = "-- MySQL dump 10.13  Distrib 5.7.18, for Win64 (x86_64)\n" +
        "--\n" +
        "-- Host: localhost    Database: DBazienda\n" +
        "-- ------------------------------------------------------\n" +
        "-- Server version	5.7.18-log\n" +
        "\n" +
        "/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;\n" +
        "/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;\n" +
        "/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;\n" +
        "/*!40101 SET NAMES utf8 */;\n" +
        "/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;\n" +
        "/*!40103 SET TIME_ZONE='+00:00' */;\n" +
        "/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;\n" +
        "/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;\n" +
        "/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;\n" +
        "/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;\n" +
        "\n" +
        "--\n" +
        "-- Table structure for table `badge`\n" +
        "--\n" +
        "\n" +
        "DROP TABLE IF EXISTS `badge`;\n" +
        "/*!40101 SET @saved_cs_client     = @@character_set_client */;\n" +
        "/*!40101 SET character_set_client = utf8 */;\n" +
        "CREATE TABLE `badge` (\n" +
        "  `Codice` varchar(5) NOT NULL,\n" +
        "  `Numero` tinyint(50) DEFAULT NULL,\n" +
        "  PRIMARY KEY (`Codice`)\n" +
        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
        "/*!40101 SET character_set_client = @saved_cs_client */;\n" +
        "\n" +
        "--\n" +
        "-- Dumping data for table `badge`\n" +
        "--\n" +
        "\n" +
        "LOCK TABLES `badge` WRITE;\n" +
        "/*!40000 ALTER TABLE `badge` DISABLE KEYS */;\n" +
        "/*!40000 ALTER TABLE `badge` ENABLE KEYS */;\n" +
        "UNLOCK TABLES;\n" +
        "\n" +
        "--\n" +
        "-- Table structure for table `registrare`\n" +
        "--\n" +
        "\n" +
        "DROP TABLE IF EXISTS `registrare`;\n" +
        "/*!40101 SET @saved_cs_client     = @@character_set_client */;\n" +
        "/*!40101 SET character_set_client = utf8 */;\n" +
        "CREATE TABLE `registrare` (\n" +
        "  `ReferenteAzienda` varchar(25) DEFAULT NULL,\n" +
        "  `DataOraEntrata` datetime DEFAULT NULL,\n" +
        "  `CodiceUtente` varchar(5) DEFAULT NULL,\n" +
        "  `CodiceBadge` varchar(5) DEFAULT NULL,\n" +
        "  `DataOraUscita` datetime DEFAULT NULL\n" +
        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
        "/*!40101 SET character_set_client = @saved_cs_client */;\n" +
        "\n" +
        "--\n" +
        "-- Dumping data for table `registrare`\n" +
        "--\n" +
        "\n" +
        "LOCK TABLES `registrare` WRITE;\n" +
        "/*!40000 ALTER TABLE `registrare` DISABLE KEYS */;\n" +
        "/*!40000 ALTER TABLE `registrare` ENABLE KEYS */;\n" +
        "UNLOCK TABLES;\n" +
        "\n" +
        "--\n" +
        "-- Table structure for table `utente`\n" +
        "--\n" +
        "\n" +
        "DROP TABLE IF EXISTS `utente`;\n" +
        "/*!40101 SET @saved_cs_client     = @@character_set_client */;\n" +
        "/*!40101 SET character_set_client = utf8 */;\n" +
        "CREATE TABLE `utente` (\n" +
        "  `Codice` varchar(5) NOT NULL,\n";
        int cont = 0;
        while(cont < strings.length) {
            compiled = compiled + "  `" + strings[cont] + "` varchar(25) DEFAULT NULL,\n";
            cont++;
        }
        
        compiled = compiled + "  PRIMARY KEY (`Codice`)\n" +
        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
        "/*!40101 SET character_set_client = @saved_cs_client */;\n" +
        "\n" +
        "--\n" +
        "-- Dumping data for table `utente`\n" +
        "--\n" +
        "\n" +
        "LOCK TABLES `utente` WRITE;\n" +
        "/*!40000 ALTER TABLE `utente` DISABLE KEYS */;\n" +
        "/*!40000 ALTER TABLE `utente` ENABLE KEYS */;\n" +
        "UNLOCK TABLES;\n" +
        "/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;\n" +
        "\n" +
        "/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;\n" +
        "/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;\n" +
        "/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;\n" +
        "/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;\n" +
        "/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;\n" +
        "/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;\n" +
        "/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;\n" +
        "\n" +
        "-- Dump completed on 2017-05-15 15:04:17";
        
        print();
    }
    
    private void print() {
        try {
            PrintWriter file = new PrintWriter("dbazienda.sql");
            file.println(compiled);
            file.close();
        }
        catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }
}
