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
    private String compiled, userName;
    private String[] strings;
    private int delete;
    
    public SQLAutoCompilator(String[] string, String user, int del) {
        strings = string;
        userName = user;
        delete = del;
        
        compiler();
    }

    private void compiler() {
        compiled = "-- phpMyAdmin SQL Dump\n" +
        "-- version 4.7.0\n" +
        "-- https://www.phpmyadmin.net/\n" +
        "--\n" +
        "-- Host: 127.0.0.1\n" +
        "-- Creato il: Giu 15, 2017 alle 17:35\n" +
        "-- Versione del server: 10.1.22-MariaDB\n" +
        "-- Versione PHP: 7.1.4\n" +
        "\n" +
        "SET SQL_MODE = \"NO_AUTO_VALUE_ON_ZERO\";\n" +
        "SET AUTOCOMMIT = 0;\n" +
        "START TRANSACTION;\n" +
        "SET GLOBAL event_scheduler = ON;\n" +
        "SET @@global.event_scheduler = ON;\n" +
        "SET GLOBAL event_scheduler = 1;\n" +
        "SET @@global.event_scheduler = 1;\n" +
        "\n" +
        "\n" +
        "/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;\n" +
        "/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;\n" +
        "/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;\n" +
        "/*!40101 SET NAMES utf8mb4 */;\n" +
        "\n" +
        "--\n" +
        "-- Database: `dbazienda`\n" +
        "--\n" +
        "\n" +
        "-- --------------------------------------------------------\n" +
        "\n" +
        "--\n" +
        "-- Struttura della tabella `badge`\n" +
        "--\n" +
        "DROP TABLE IF EXISTS `badge`;\n" +
        "CREATE TABLE `badge` (\n" +
        "  `Codice` varchar(5) NOT NULL,\n" +
        "  `Numero` tinyint(50) DEFAULT NULL\n" +
        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
        "\n" +
        "-- --------------------------------------------------------\n" +
        "\n" +
        "--\n" +
        "-- Struttura della tabella `registrare`\n" +
        "--\n" +
        "DROP TABLE IF EXISTS `registrare`;\n" +
        "CREATE TABLE `registrare` (\n" +
        "  `ReferenteAzienda` varchar(25) DEFAULT NULL,\n" +
        "  `DataOraEntrata` datetime DEFAULT NULL,\n" +
        "  `CodiceUtente` varchar(5) DEFAULT NULL,\n" +
        "  `CodiceBadge` varchar(5) DEFAULT NULL,\n" +
        "  `DataOraUscita` datetime DEFAULT NULL\n" +
        ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
        "\n" +
        "-- --------------------------------------------------------\n" +
        "\n" +
        "--\n" +
        "-- Struttura della tabella `utente`\n" +
        "--\n" +
        "DROP TABLE IF EXISTS `utente`;\n" +
        "CREATE TABLE `utente` (";
        int cont = 0;
        while(cont < strings.length) {
            compiled = compiled + "  `" + strings[cont] + "` varchar(25) DEFAULT NULL,\n";
            cont++;
        }
        
        compiled = compiled + ") ENGINE=InnoDB DEFAULT CHARSET=utf8;\n" +
        "\n" +
        "--\n" +
        "-- Indici per le tabelle scaricate\n" +
        "--\n" +
        "\n" +
        "--\n" +
        "-- Indici per le tabelle `badge`\n" +
        "--\n" +
        "ALTER TABLE `badge`\n" +
        "  ADD PRIMARY KEY (`Codice`);\n" +
        "\n" +
        "--\n" +
        "-- Indici per le tabelle `utente`\n" +
        "--\n" +
        "ALTER TABLE `utente`\n" +
        "  ADD PRIMARY KEY (`Codice`);\n" +
        "\n" +
        "DROP EVENT IF EXISTS `event1`;\n" +
        "--\n" +
        "-- Eventi\n" +
        "--\n";
        if(delete > 0) {
            compiled = compiled + 
                "CREATE DEFINER=`"+userName+"`@`localhost` EVENT `event1` ON SCHEDULE EVERY 1 HOUR STARTS CONCAT(DATE(NOW()), ' 00:00:00') ON COMPLETION NOT PRESERVE ENABLE DO DELETE utente.*, registrare.*, badge.* FROM (utente INNER JOIN registrare ON utente.Codice = registrare.CodiceUtente INNER JOIN badge ON utente.Codice = badge.Codice)\n" +
                "      WHERE DataOraEntrata < DATE_SUB(NOW(), INTERVAL "+delete+" DAY);\n";
        }
        compiled = compiled + 
        "/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;\n" +
        "/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;\n" +
        "/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;";
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
