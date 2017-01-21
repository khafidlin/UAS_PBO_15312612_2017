-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Jan 21, 2017 at 04:29 PM
-- Server version: 5.0.51
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Database: `db_uas_15312606`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `tbl_pinjam`
-- 

CREATE TABLE `tbl_pinjam` (
  `id` int(11) NOT NULL auto_increment,
  `namaTeman` varchar(30) NOT NULL,
  `nope` varchar(15) default NULL,
  `barangDipinjam` varchar(30) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

-- 
-- Dumping data for table `tbl_pinjam`
-- 

INSERT INTO `tbl_pinjam` VALUES (1, 'Sanriomi Sintaro', NULL, 'aaa');

-- --------------------------------------------------------

-- 
-- Table structure for table `tbl_teman`
-- 

CREATE TABLE `tbl_teman` (
  `id` int(11) NOT NULL auto_increment,
  `nama` varchar(30) NOT NULL,
  `nope` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

-- 
-- Dumping data for table `tbl_teman`
-- 

INSERT INTO `tbl_teman` VALUES (3, 'wiko', '085768193547', 'wikowiko2@gmail.com');
INSERT INTO `tbl_teman` VALUES (2, 'wikoal', '085768193547', 'wikoalbukhori hartanto');
INSERT INTO `tbl_teman` VALUES (4, 'wikoalbukhori', '085768193547', 'wikowiko2@gmail.com');
