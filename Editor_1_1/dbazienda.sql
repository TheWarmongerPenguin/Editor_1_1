-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Giu 15, 2017 alle 17:35
-- Versione del server: 10.1.22-MariaDB
-- Versione PHP: 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET GLOBAL event_scheduler = ON;
SET @@global.event_scheduler = ON;
SET GLOBAL event_scheduler = 1;
SET @@global.event_scheduler = 1;


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbazienda`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `badge`
--
DROP TABLE IF EXISTS `badge`;
CREATE TABLE `badge` (
  `Codice` varchar(5) NOT NULL,
  `Numero` tinyint(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struttura della tabella `registrare`
--
DROP TABLE IF EXISTS `registrare`;
CREATE TABLE `registrare` (
  `ReferenteAzienda` varchar(25) DEFAULT NULL,
  `DataOraEntrata` datetime DEFAULT NULL,
  `CodiceUtente` varchar(5) DEFAULT NULL,
  `CodiceBadge` varchar(5) DEFAULT NULL,
  `DataOraUscita` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--
DROP TABLE IF EXISTS `utente`;
CREATE TABLE `utente` (  `Nome` varchar(25) DEFAULT NULL,
  `Cognome` varchar(25) DEFAULT NULL,
  `Azienda` varchar(25) DEFAULT NULL,
  `ReferenteAziendale` varchar(25) DEFAULT NULL,
  `TipoDiVisita` varchar(25) DEFAULT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `badge`
--
ALTER TABLE `badge`
  ADD PRIMARY KEY (`Codice`);

--
-- Indici per le tabelle `utente`
--
ALTER TABLE `utente`
  ADD PRIMARY KEY (`Codice`);

DROP EVENT IF EXISTS `event1`;
--
-- Eventi
--
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
