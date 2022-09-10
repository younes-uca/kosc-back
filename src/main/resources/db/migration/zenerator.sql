-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : sam. 10 sep. 2022 à 12:44
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 7.4.29

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `zenerator`
--

-- --------------------------------------------------------

--
-- Structure de la table `arret_travail`
--

CREATE TABLE `arret_travail` (
  `id` bigint(20) NOT NULL,
  `comment` varchar(500) DEFAULT NULL,
  `date_debut` date DEFAULT NULL,
  `date_fin` date DEFAULT NULL,
  `raison_arret_travail` bigint(20) DEFAULT NULL,
  `technicien` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `arret_travail_seq`
--

CREATE TABLE `arret_travail_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `arret_travail_seq`
--

INSERT INTO `arret_travail_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `chercheur`
--

CREATE TABLE `chercheur` (
  `id` bigint(20) NOT NULL,
  `account_non_expired` bit(1) NOT NULL,
  `account_non_locked` bit(1) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `credentials_non_expired` bit(1) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `password_changed` bit(1) NOT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `numero_matricule` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `chercheur`
--

INSERT INTO `chercheur` (`id`, `account_non_expired`, `account_non_locked`, `created_at`, `credentials_non_expired`, `email`, `enabled`, `nom`, `password`, `password_changed`, `prenom`, `updated_at`, `username`, `numero_matricule`) VALUES
(102, b'1', b'1', '2022-09-10 06:34:05', b'1', 'chercheur', b'1', NULL, '$2a$10$SmzEVlwCON9TQFN7bwCs6.Hb2egad7q7SbhgJCJWQ.WiKcrsoS3Me', b'0', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` bigint(20) NOT NULL,
  `email` varchar(500) DEFAULT NULL,
  `nom` varchar(500) DEFAULT NULL,
  `prenom` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `client_seq`
--

CREATE TABLE `client_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `client_seq`
--

INSERT INTO `client_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `departement`
--

CREATE TABLE `departement` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL,
  `region` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `departement_seq`
--

CREATE TABLE `departement_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `departement_seq`
--

INSERT INTO `departement_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `departement_technicien`
--

CREATE TABLE `departement_technicien` (
  `id` bigint(20) NOT NULL,
  `date_debut` date DEFAULT NULL,
  `date_fin` date DEFAULT NULL,
  `departement` bigint(20) DEFAULT NULL,
  `technicien` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `departement_technicien_seq`
--

CREATE TABLE `departement_technicien_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `departement_technicien_seq`
--

INSERT INTO `departement_technicien_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `entreprise`
--

CREATE TABLE `entreprise` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `entreprise_seq`
--

CREATE TABLE `entreprise_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `entreprise_seq`
--

INSERT INTO `entreprise_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `etat_demande_kosc`
--

CREATE TABLE `etat_demande_kosc` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `etat_demande_kosc_seq`
--

CREATE TABLE `etat_demande_kosc_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `etat_demande_kosc_seq`
--

INSERT INTO `etat_demande_kosc_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(105),
(105),
(105);

-- --------------------------------------------------------

--
-- Structure de la table `kosc_employee`
--

CREATE TABLE `kosc_employee` (
  `id` bigint(20) NOT NULL,
  `cell_phone` varchar(500) DEFAULT NULL,
  `email1` varchar(500) DEFAULT NULL,
  `email2` varchar(500) DEFAULT NULL,
  `email3` varchar(500) DEFAULT NULL,
  `first_name` varchar(500) DEFAULT NULL,
  `last_name` varchar(500) DEFAULT NULL,
  `phone` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `kosc_employee_seq`
--

CREATE TABLE `kosc_employee_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `kosc_employee_seq`
--

INSERT INTO `kosc_employee_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `operator`
--

CREATE TABLE `operator` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(500) DEFAULT NULL,
  `reference` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `operator_seq`
--

CREATE TABLE `operator_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `operator_seq`
--

INSERT INTO `operator_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `ordre_kosc`
--

CREATE TABLE `ordre_kosc` (
  `id` bigint(20) NOT NULL,
  `autre_infos_pbo_pto` text DEFAULT NULL,
  `code_acces_immeuble` text DEFAULT NULL,
  `code_decharge` text DEFAULT NULL,
  `commantaire_cloture` text DEFAULT NULL,
  `comment` text DEFAULT NULL,
  `commentaire_client` text DEFAULT NULL,
  `commentaire_technicien` text DEFAULT NULL,
  `company` text DEFAULT NULL,
  `condition_syndics` text DEFAULT NULL,
  `connecteur_prise_couleur1` text DEFAULT NULL,
  `connecteur_prise_couleur2` text DEFAULT NULL,
  `connecteur_prise_couleur3` text DEFAULT NULL,
  `connecteur_prise_couleur4` text DEFAULT NULL,
  `connecteur_prise_numero1` text DEFAULT NULL,
  `connecteur_prise_numero2` text DEFAULT NULL,
  `connecteur_prise_numero3` text DEFAULT NULL,
  `connecteur_prise_numero4` text DEFAULT NULL,
  `contacte_immeuble` text DEFAULT NULL,
  `contacts_syndic` text DEFAULT NULL,
  `coordonne_pboy` text DEFAULT NULL,
  `corps_client` text DEFAULT NULL,
  `corps_cloture` text DEFAULT NULL,
  `corps_kosc` text DEFAULT NULL,
  `corps_planification` text DEFAULT NULL,
  `corps_replanification` text DEFAULT NULL,
  `corps_report` text DEFAULT NULL,
  `corps_suivi` text DEFAULT NULL,
  `date_appel_replanification` date DEFAULT NULL,
  `date_debut_traitement` date DEFAULT NULL,
  `date_deuxieme_appel` date DEFAULT NULL,
  `date_envoi_client` date DEFAULT NULL,
  `date_envoi_cloture` date DEFAULT NULL,
  `date_envoi_cri` date DEFAULT NULL,
  `date_envoi_kosc` date DEFAULT NULL,
  `date_envoi_planification` date DEFAULT NULL,
  `date_envoi_replanification` date DEFAULT NULL,
  `date_envoi_report` date DEFAULT NULL,
  `date_envoi_suivi` date DEFAULT NULL,
  `date_intervention_technique` date DEFAULT NULL,
  `date_intervention_technique_debut` date DEFAULT NULL,
  `date_intervention_technique_fin` date DEFAULT NULL,
  `date_ouverture` date DEFAULT NULL,
  `date_premier_appel` date DEFAULT NULL,
  `date_prise_rdv` date DEFAULT NULL,
  `date_rdv` date DEFAULT NULL,
  `date_troisieme_appel` date DEFAULT NULL,
  `email_cloture_piece_joints` text DEFAULT NULL,
  `end_custumor_building` text DEFAULT NULL,
  `end_custumor_city` text DEFAULT NULL,
  `end_custumor_contact_cell_phone` text DEFAULT NULL,
  `end_custumor_contact_email` text DEFAULT NULL,
  `end_custumor_contact_first_name` text DEFAULT NULL,
  `end_custumor_contact_last_name` text DEFAULT NULL,
  `end_custumor_contact_phone` text DEFAULT NULL,
  `end_custumor_first_name` text DEFAULT NULL,
  `end_custumor_floor` text DEFAULT NULL,
  `end_custumor_last_name` text DEFAULT NULL,
  `end_custumor_name` text DEFAULT NULL,
  `end_custumor_siret` text DEFAULT NULL,
  `end_custumor_stairs` text DEFAULT NULL,
  `end_custumor_street_name` text DEFAULT NULL,
  `end_custumor_street_number` text DEFAULT NULL,
  `end_custumor_zipcode` text DEFAULT NULL,
  `envoi_mail_client` tinyint(1) DEFAULT 0,
  `envoi_mail_kosc` tinyint(1) DEFAULT 0,
  `envoye_client` tinyint(1) DEFAULT 0,
  `envoye_cloture` tinyint(1) DEFAULT 0,
  `envoye_kosc` tinyint(1) DEFAULT 0,
  `envoye_planification` tinyint(1) DEFAULT 0,
  `envoye_replanification` tinyint(1) DEFAULT 0,
  `envoye_report` tinyint(1) DEFAULT 0,
  `envoye_suivi` tinyint(1) DEFAULT 0,
  `existing_otp` tinyint(1) DEFAULT 0,
  `hauteur_pbo` text DEFAULT NULL,
  `info_obtention_cle` text DEFAULT NULL,
  `information_fibre_module_pm1` text DEFAULT NULL,
  `information_fibre_module_pm2` text DEFAULT NULL,
  `information_fibre_module_pm3` text DEFAULT NULL,
  `information_fibre_module_pm4` text DEFAULT NULL,
  `information_fibre_pbo1` text DEFAULT NULL,
  `information_fibre_pbo2` text DEFAULT NULL,
  `information_fibre_pbo3` text DEFAULT NULL,
  `information_fibre_pbo4` text DEFAULT NULL,
  `information_tube_pbo1` text DEFAULT NULL,
  `information_tube_pbo2` text DEFAULT NULL,
  `information_tube_pbo3` text DEFAULT NULL,
  `information_tube_pbo4` text DEFAULT NULL,
  `locale_ipm` text DEFAULT NULL,
  `nom_module_pm1` text DEFAULT NULL,
  `nom_module_pm2` text DEFAULT NULL,
  `nom_module_pm3` text DEFAULT NULL,
  `nom_module_pm4` text DEFAULT NULL,
  `numero_serie_ont` text DEFAULT NULL,
  `objet_client` text DEFAULT NULL,
  `objet_cloture` text DEFAULT NULL,
  `objet_kosc` text DEFAULT NULL,
  `objet_planification` text DEFAULT NULL,
  `objet_replanification` text DEFAULT NULL,
  `objet_report` text DEFAULT NULL,
  `objet_suivi` text DEFAULT NULL,
  `oc1` text DEFAULT NULL,
  `oc2` text DEFAULT NULL,
  `oc3` text DEFAULT NULL,
  `oc4` text DEFAULT NULL,
  `pbo_reel` text DEFAULT NULL,
  `pma_accessible` text DEFAULT NULL,
  `position_module_pm1` text DEFAULT NULL,
  `position_module_pm2` text DEFAULT NULL,
  `position_module_pm3` text DEFAULT NULL,
  `position_module_pm4` text DEFAULT NULL,
  `product` text DEFAULT NULL,
  `profile` text DEFAULT NULL,
  `provider` text DEFAULT NULL,
  `provider_file_type` text DEFAULT NULL,
  `provider_sl_id` text DEFAULT NULL,
  `racordement_long` tinyint(1) DEFAULT 0,
  `referen_dossier` text DEFAULT NULL,
  `reference` text DEFAULT NULL,
  `reference_cable_module_pm1` text DEFAULT NULL,
  `reference_cable_module_pm2` text DEFAULT NULL,
  `reference_cable_module_pm3` text DEFAULT NULL,
  `reference_cable_module_pm4` text DEFAULT NULL,
  `reference_cable_pbo1` text DEFAULT NULL,
  `reference_cable_pbo2` text DEFAULT NULL,
  `reference_cable_pbo3` text DEFAULT NULL,
  `reference_cable_pbo4` text DEFAULT NULL,
  `reference_prestation_prise` text DEFAULT NULL,
  `reference_tube_module_pm1` text DEFAULT NULL,
  `reference_tube_module_pm2` text DEFAULT NULL,
  `reference_tube_module_pm3` text DEFAULT NULL,
  `reference_tube_module_pm4` text DEFAULT NULL,
  `reference_work_order` text DEFAULT NULL,
  `reserve1` text DEFAULT NULL,
  `reserve2` text DEFAULT NULL,
  `reserve3` text DEFAULT NULL,
  `reserve4` text DEFAULT NULL,
  `spliter` text DEFAULT NULL,
  `submission_date` date DEFAULT NULL,
  `supplier_service` text DEFAULT NULL,
  `type_materiel_pbo` text DEFAULT NULL,
  `type_pbo` text DEFAULT NULL,
  `type_racordement_pbo_pto` text DEFAULT NULL,
  `work_order_type` text DEFAULT NULL,
  `client` bigint(20) DEFAULT NULL,
  `departement` bigint(20) DEFAULT NULL,
  `etat_demande_kosc` bigint(20) DEFAULT NULL,
  `operator` bigint(20) DEFAULT NULL,
  `technicien` bigint(20) DEFAULT NULL,
  `template_email_client_injoinable` bigint(20) DEFAULT NULL,
  `template_email_cloture` bigint(20) DEFAULT NULL,
  `template_email_kosc` bigint(20) DEFAULT NULL,
  `template_email_planification` bigint(20) DEFAULT NULL,
  `template_email_replanification` bigint(20) DEFAULT NULL,
  `template_email_report` bigint(20) DEFAULT NULL,
  `template_suivi` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ordre_kosc`
--

INSERT INTO `ordre_kosc` (`id`, `autre_infos_pbo_pto`, `code_acces_immeuble`, `code_decharge`, `commantaire_cloture`, `comment`, `commentaire_client`, `commentaire_technicien`, `company`, `condition_syndics`, `connecteur_prise_couleur1`, `connecteur_prise_couleur2`, `connecteur_prise_couleur3`, `connecteur_prise_couleur4`, `connecteur_prise_numero1`, `connecteur_prise_numero2`, `connecteur_prise_numero3`, `connecteur_prise_numero4`, `contacte_immeuble`, `contacts_syndic`, `coordonne_pboy`, `corps_client`, `corps_cloture`, `corps_kosc`, `corps_planification`, `corps_replanification`, `corps_report`, `corps_suivi`, `date_appel_replanification`, `date_debut_traitement`, `date_deuxieme_appel`, `date_envoi_client`, `date_envoi_cloture`, `date_envoi_cri`, `date_envoi_kosc`, `date_envoi_planification`, `date_envoi_replanification`, `date_envoi_report`, `date_envoi_suivi`, `date_intervention_technique`, `date_intervention_technique_debut`, `date_intervention_technique_fin`, `date_ouverture`, `date_premier_appel`, `date_prise_rdv`, `date_rdv`, `date_troisieme_appel`, `email_cloture_piece_joints`, `end_custumor_building`, `end_custumor_city`, `end_custumor_contact_cell_phone`, `end_custumor_contact_email`, `end_custumor_contact_first_name`, `end_custumor_contact_last_name`, `end_custumor_contact_phone`, `end_custumor_first_name`, `end_custumor_floor`, `end_custumor_last_name`, `end_custumor_name`, `end_custumor_siret`, `end_custumor_stairs`, `end_custumor_street_name`, `end_custumor_street_number`, `end_custumor_zipcode`, `envoi_mail_client`, `envoi_mail_kosc`, `envoye_client`, `envoye_cloture`, `envoye_kosc`, `envoye_planification`, `envoye_replanification`, `envoye_report`, `envoye_suivi`, `existing_otp`, `hauteur_pbo`, `info_obtention_cle`, `information_fibre_module_pm1`, `information_fibre_module_pm2`, `information_fibre_module_pm3`, `information_fibre_module_pm4`, `information_fibre_pbo1`, `information_fibre_pbo2`, `information_fibre_pbo3`, `information_fibre_pbo4`, `information_tube_pbo1`, `information_tube_pbo2`, `information_tube_pbo3`, `information_tube_pbo4`, `locale_ipm`, `nom_module_pm1`, `nom_module_pm2`, `nom_module_pm3`, `nom_module_pm4`, `numero_serie_ont`, `objet_client`, `objet_cloture`, `objet_kosc`, `objet_planification`, `objet_replanification`, `objet_report`, `objet_suivi`, `oc1`, `oc2`, `oc3`, `oc4`, `pbo_reel`, `pma_accessible`, `position_module_pm1`, `position_module_pm2`, `position_module_pm3`, `position_module_pm4`, `product`, `profile`, `provider`, `provider_file_type`, `provider_sl_id`, `racordement_long`, `referen_dossier`, `reference`, `reference_cable_module_pm1`, `reference_cable_module_pm2`, `reference_cable_module_pm3`, `reference_cable_module_pm4`, `reference_cable_pbo1`, `reference_cable_pbo2`, `reference_cable_pbo3`, `reference_cable_pbo4`, `reference_prestation_prise`, `reference_tube_module_pm1`, `reference_tube_module_pm2`, `reference_tube_module_pm3`, `reference_tube_module_pm4`, `reference_work_order`, `reserve1`, `reserve2`, `reserve3`, `reserve4`, `spliter`, `submission_date`, `supplier_service`, `type_materiel_pbo`, `type_pbo`, `type_racordement_pbo_pto`, `work_order_type`, `client`, `departement`, `etat_demande_kosc`, `operator`, `technicien`, `template_email_client_injoinable`, `template_email_cloture`, `template_email_kosc`, `template_email_planification`, `template_email_replanification`, `template_email_report`, `template_suivi`) VALUES
(1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-09-09', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, 'o-1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'wo-1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `ordre_kosc_seq`
--

CREATE TABLE `ordre_kosc_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ordre_kosc_seq`
--

INSERT INTO `ordre_kosc_seq` (`next_val`) VALUES
(2);

-- --------------------------------------------------------

--
-- Structure de la table `permission`
--

CREATE TABLE `permission` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `permission`
--

INSERT INTO `permission` (`id`, `name`) VALUES
(1, 'Region.edit'),
(2, 'Region.list'),
(3, 'Region.view'),
(4, 'Region.add'),
(5, 'Region.delete'),
(6, 'TemplateEmailReport.edit'),
(7, 'TemplateEmailReport.list'),
(8, 'TemplateEmailReport.view'),
(9, 'TemplateEmailReport.add'),
(10, 'TemplateEmailReport.delete'),
(11, 'RaisonArretTravail.edit'),
(12, 'RaisonArretTravail.list'),
(13, 'RaisonArretTravail.view'),
(14, 'RaisonArretTravail.add'),
(15, 'RaisonArretTravail.delete'),
(16, 'Departement.edit'),
(17, 'Departement.list'),
(18, 'Departement.view'),
(19, 'Departement.add'),
(20, 'Departement.delete'),
(21, 'TemplateEmailCloture.edit'),
(22, 'TemplateEmailCloture.list'),
(23, 'TemplateEmailCloture.view'),
(24, 'TemplateEmailCloture.add'),
(25, 'TemplateEmailCloture.delete'),
(26, 'Operator.edit'),
(27, 'Operator.list'),
(28, 'Operator.view'),
(29, 'Operator.add'),
(30, 'Operator.delete'),
(31, 'Entreprise.edit'),
(32, 'Entreprise.list'),
(33, 'Entreprise.view'),
(34, 'Entreprise.add'),
(35, 'Entreprise.delete'),
(36, 'DepartementTechnicien.edit'),
(37, 'DepartementTechnicien.list'),
(38, 'DepartementTechnicien.view'),
(39, 'DepartementTechnicien.add'),
(40, 'DepartementTechnicien.delete'),
(41, 'Chercheur.edit'),
(42, 'Chercheur.list'),
(43, 'Chercheur.view'),
(44, 'Chercheur.add'),
(45, 'Chercheur.delete'),
(46, 'Technicien.edit'),
(47, 'Technicien.list'),
(48, 'Technicien.view'),
(49, 'Technicien.add'),
(50, 'Technicien.delete'),
(51, 'EtatDemandeKosc.edit'),
(52, 'EtatDemandeKosc.list'),
(53, 'EtatDemandeKosc.view'),
(54, 'EtatDemandeKosc.add'),
(55, 'EtatDemandeKosc.delete'),
(56, 'TemplateSuivi.edit'),
(57, 'TemplateSuivi.list'),
(58, 'TemplateSuivi.view'),
(59, 'TemplateSuivi.add'),
(60, 'TemplateSuivi.delete'),
(61, 'TemplateEmailPlanification.edit'),
(62, 'TemplateEmailPlanification.list'),
(63, 'TemplateEmailPlanification.view'),
(64, 'TemplateEmailPlanification.add'),
(65, 'TemplateEmailPlanification.delete'),
(66, 'KoscEmployee.edit'),
(67, 'KoscEmployee.list'),
(68, 'KoscEmployee.view'),
(69, 'KoscEmployee.add'),
(70, 'KoscEmployee.delete'),
(71, 'ArretTravail.edit'),
(72, 'ArretTravail.list'),
(73, 'ArretTravail.view'),
(74, 'ArretTravail.add'),
(75, 'ArretTravail.delete'),
(76, 'TemplateEmailClientInjoinable.edit'),
(77, 'TemplateEmailClientInjoinable.list'),
(78, 'TemplateEmailClientInjoinable.view'),
(79, 'TemplateEmailClientInjoinable.add'),
(80, 'TemplateEmailClientInjoinable.delete'),
(81, 'TemplateEmailReplanification.edit'),
(82, 'TemplateEmailReplanification.list'),
(83, 'TemplateEmailReplanification.view'),
(84, 'TemplateEmailReplanification.add'),
(85, 'TemplateEmailReplanification.delete'),
(86, 'OrdreKosc.edit'),
(87, 'OrdreKosc.list'),
(88, 'OrdreKosc.view'),
(89, 'OrdreKosc.add'),
(90, 'OrdreKosc.delete'),
(91, 'TemplateEmailKosc.edit'),
(92, 'TemplateEmailKosc.list'),
(93, 'TemplateEmailKosc.view'),
(94, 'TemplateEmailKosc.add'),
(95, 'TemplateEmailKosc.delete'),
(96, 'Client.edit'),
(97, 'Client.list'),
(98, 'Client.view'),
(99, 'Client.add'),
(100, 'Client.delete');

-- --------------------------------------------------------

--
-- Structure de la table `raison_arret_travail`
--

CREATE TABLE `raison_arret_travail` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `raison_arret_travail_seq`
--

CREATE TABLE `raison_arret_travail_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `raison_arret_travail_seq`
--

INSERT INTO `raison_arret_travail_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `region`
--

CREATE TABLE `region` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `region_seq`
--

CREATE TABLE `region_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `region_seq`
--

INSERT INTO `region_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `roles_permissions`
--

CREATE TABLE `roles_permissions` (
  `role_id` bigint(20) NOT NULL,
  `permission_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `roles_permissions`
--

INSERT INTO `roles_permissions` (`role_id`, `permission_id`) VALUES
(101, 1),
(101, 2),
(101, 3),
(101, 4),
(101, 5),
(101, 6),
(101, 7),
(101, 8),
(101, 9),
(101, 10),
(101, 11),
(101, 12),
(101, 13),
(101, 14),
(101, 15),
(101, 16),
(101, 17),
(101, 18),
(101, 19),
(101, 20),
(101, 21),
(101, 22),
(101, 23),
(101, 24),
(101, 25),
(101, 26),
(101, 27),
(101, 28),
(101, 29),
(101, 30),
(101, 31),
(101, 32),
(101, 33),
(101, 34),
(101, 35),
(101, 36),
(101, 37),
(101, 38),
(101, 39),
(101, 40),
(101, 41),
(101, 42),
(101, 43),
(101, 44),
(101, 45),
(101, 46),
(101, 47),
(101, 48),
(101, 49),
(101, 50),
(101, 51),
(101, 52),
(101, 53),
(101, 54),
(101, 55),
(101, 56),
(101, 57),
(101, 58),
(101, 59),
(101, 60),
(101, 61),
(101, 62),
(101, 63),
(101, 64),
(101, 65),
(101, 66),
(101, 67),
(101, 68),
(101, 69),
(101, 70),
(101, 71),
(101, 72),
(101, 73),
(101, 74),
(101, 75),
(101, 76),
(101, 77),
(101, 78),
(101, 79),
(101, 80),
(101, 81),
(101, 82),
(101, 83),
(101, 84),
(101, 85),
(101, 86),
(101, 87),
(101, 88),
(101, 89),
(101, 90),
(101, 91),
(101, 92),
(101, 93),
(101, 94),
(101, 95),
(101, 96),
(101, 97),
(101, 98),
(101, 99),
(101, 100),
(103, 1),
(103, 2),
(103, 3),
(103, 4),
(103, 5),
(103, 6),
(103, 7),
(103, 8),
(103, 9),
(103, 10),
(103, 11),
(103, 12),
(103, 13),
(103, 14),
(103, 15),
(103, 16),
(103, 17),
(103, 18),
(103, 19),
(103, 20),
(103, 21),
(103, 22),
(103, 23),
(103, 24),
(103, 25),
(103, 26),
(103, 27),
(103, 28),
(103, 29),
(103, 30),
(103, 31),
(103, 32),
(103, 33),
(103, 34),
(103, 35),
(103, 36),
(103, 37),
(103, 38),
(103, 39),
(103, 40),
(103, 41),
(103, 42),
(103, 43),
(103, 44),
(103, 45),
(103, 46),
(103, 47),
(103, 48),
(103, 49),
(103, 50),
(103, 51),
(103, 52),
(103, 53),
(103, 54),
(103, 55),
(103, 56),
(103, 57),
(103, 58),
(103, 59),
(103, 60),
(103, 61),
(103, 62),
(103, 63),
(103, 64),
(103, 65),
(103, 66),
(103, 67),
(103, 68),
(103, 69),
(103, 70),
(103, 71),
(103, 72),
(103, 73),
(103, 74),
(103, 75),
(103, 76),
(103, 77),
(103, 78),
(103, 79),
(103, 80),
(103, 81),
(103, 82),
(103, 83),
(103, 84),
(103, 85),
(103, 86),
(103, 87),
(103, 88),
(103, 89),
(103, 90),
(103, 91),
(103, 92),
(103, 93),
(103, 94),
(103, 95),
(103, 96),
(103, 97),
(103, 98),
(103, 99),
(103, 100);

-- --------------------------------------------------------

--
-- Structure de la table `role_app`
--

CREATE TABLE `role_app` (
  `id` bigint(20) NOT NULL,
  `authority` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `role_app`
--

INSERT INTO `role_app` (`id`, `authority`, `created_at`, `updated_at`) VALUES
(101, 'ROLE_CHERCHEUR', NULL, NULL),
(103, 'ROLE_ADMIN', NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `technicien`
--

CREATE TABLE `technicien` (
  `id` bigint(20) NOT NULL,
  `adresse_ont` varchar(500) DEFAULT NULL,
  `cell_phone` varchar(500) DEFAULT NULL,
  `email` varchar(500) DEFAULT NULL,
  `email_attachement` varchar(500) DEFAULT NULL,
  `identifiant` varchar(500) DEFAULT NULL,
  `mot_passe` varchar(500) DEFAULT NULL,
  `nom` varchar(500) DEFAULT NULL,
  `prenom` varchar(500) DEFAULT NULL,
  `entreprise` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `technicien_seq`
--

CREATE TABLE `technicien_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `technicien_seq`
--

INSERT INTO `technicien_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `template_email_client_injoinable`
--

CREATE TABLE `template_email_client_injoinable` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `corps` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL,
  `objet` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `template_email_client_injoinable_seq`
--

CREATE TABLE `template_email_client_injoinable_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `template_email_client_injoinable_seq`
--

INSERT INTO `template_email_client_injoinable_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `template_email_cloture`
--

CREATE TABLE `template_email_cloture` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `corps` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL,
  `objet` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `template_email_cloture_seq`
--

CREATE TABLE `template_email_cloture_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `template_email_cloture_seq`
--

INSERT INTO `template_email_cloture_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `template_email_kosc`
--

CREATE TABLE `template_email_kosc` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `corps` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL,
  `objet` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `template_email_kosc_seq`
--

CREATE TABLE `template_email_kosc_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `template_email_kosc_seq`
--

INSERT INTO `template_email_kosc_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `template_email_planification`
--

CREATE TABLE `template_email_planification` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `corps` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL,
  `objet` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `template_email_planification_seq`
--

CREATE TABLE `template_email_planification_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `template_email_planification_seq`
--

INSERT INTO `template_email_planification_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `template_email_replanification`
--

CREATE TABLE `template_email_replanification` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `corps` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL,
  `objet` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `template_email_replanification_seq`
--

CREATE TABLE `template_email_replanification_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `template_email_replanification_seq`
--

INSERT INTO `template_email_replanification_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `template_email_report`
--

CREATE TABLE `template_email_report` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `corps` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL,
  `objet` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `template_email_report_seq`
--

CREATE TABLE `template_email_report_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `template_email_report_seq`
--

INSERT INTO `template_email_report_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `template_suivi`
--

CREATE TABLE `template_suivi` (
  `id` bigint(20) NOT NULL,
  `code` varchar(500) DEFAULT NULL,
  `corps` varchar(500) DEFAULT NULL,
  `libelle` varchar(500) DEFAULT NULL,
  `objet` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `template_suivi_seq`
--

CREATE TABLE `template_suivi_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `template_suivi_seq`
--

INSERT INTO `template_suivi_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `users_roles`
--

CREATE TABLE `users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `users_roles`
--

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES
(102, 101),
(104, 103);

-- --------------------------------------------------------

--
-- Structure de la table `user_app`
--

CREATE TABLE `user_app` (
  `id` bigint(20) NOT NULL,
  `account_non_expired` bit(1) NOT NULL,
  `account_non_locked` bit(1) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `credentials_non_expired` bit(1) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `password_changed` bit(1) NOT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user_app`
--

INSERT INTO `user_app` (`id`, `account_non_expired`, `account_non_locked`, `created_at`, `credentials_non_expired`, `email`, `enabled`, `nom`, `password`, `password_changed`, `prenom`, `updated_at`, `username`) VALUES
(104, b'1', b'1', '2022-09-10 06:34:08', b'1', 'admin', b'1', 'admin', '$2a$10$PLLExnTOduiOh9rdmfhLju6FKIpU2xorBsPkPnuuFyb1SLo4pjTD.', b'0', 'admin', NULL, 'admin');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `arret_travail`
--
ALTER TABLE `arret_travail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKrltqbtx8fyqmob7bs83u39no6` (`raison_arret_travail`),
  ADD KEY `FKjton9ieno4lu1pplkn3nvgm0l` (`technicien`);

--
-- Index pour la table `chercheur`
--
ALTER TABLE `chercheur`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `departement`
--
ALTER TABLE `departement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKsqoshvl4n4p8y8ake5w2o6srf` (`region`);

--
-- Index pour la table `departement_technicien`
--
ALTER TABLE `departement_technicien`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5qrmnq899qe5ndobqxd9m9x3y` (`departement`),
  ADD KEY `FK4gphl06u0p855cv7dsf8qof4g` (`technicien`);

--
-- Index pour la table `entreprise`
--
ALTER TABLE `entreprise`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `etat_demande_kosc`
--
ALTER TABLE `etat_demande_kosc`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `kosc_employee`
--
ALTER TABLE `kosc_employee`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `operator`
--
ALTER TABLE `operator`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `ordre_kosc`
--
ALTER TABLE `ordre_kosc`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKoo94nt9r5wgjp6hpw7v5i0on7` (`client`),
  ADD KEY `FKkfkj439rh2qpiynfol2o7ivd7` (`departement`),
  ADD KEY `FK3dgh50p2jp80boxa66g51t89d` (`etat_demande_kosc`),
  ADD KEY `FKrb62b48xuemelf5i4acjq9wf0` (`operator`),
  ADD KEY `FKsdg9u2ib2et6y8mn868vnbll2` (`technicien`),
  ADD KEY `FKl6wr7y4ta1vx4i6utn59p2dtm` (`template_email_client_injoinable`),
  ADD KEY `FKlblgdkskell1i9p275ltw5bu3` (`template_email_cloture`),
  ADD KEY `FKg50vq8u79giutnkcygrxb8188` (`template_email_kosc`),
  ADD KEY `FKl7j4a4tvdgv4ig0b1rdq5u7qj` (`template_email_planification`),
  ADD KEY `FKb2o64tjkso348jj6kl3vq8ij3` (`template_email_replanification`),
  ADD KEY `FK96x27fujbjexr89rku6cb5wud` (`template_email_report`),
  ADD KEY `FKqm01emiq3ahyviou1ggtfdhh9` (`template_suivi`);

--
-- Index pour la table `permission`
--
ALTER TABLE `permission`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `raison_arret_travail`
--
ALTER TABLE `raison_arret_travail`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `region`
--
ALTER TABLE `region`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `roles_permissions`
--
ALTER TABLE `roles_permissions`
  ADD KEY `FKboeuhl31go7wer3bpy6so7exi` (`permission_id`),
  ADD KEY `FK3q3rt3at2wf4ooe7npa3et6yb` (`role_id`);

--
-- Index pour la table `role_app`
--
ALTER TABLE `role_app`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `technicien`
--
ALTER TABLE `technicien`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKf3wxj2t0eb6g4hd4yw2ikf8u5` (`entreprise`);

--
-- Index pour la table `template_email_client_injoinable`
--
ALTER TABLE `template_email_client_injoinable`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `template_email_cloture`
--
ALTER TABLE `template_email_cloture`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `template_email_kosc`
--
ALTER TABLE `template_email_kosc`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `template_email_planification`
--
ALTER TABLE `template_email_planification`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `template_email_replanification`
--
ALTER TABLE `template_email_replanification`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `template_email_report`
--
ALTER TABLE `template_email_report`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `template_suivi`
--
ALTER TABLE `template_suivi`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `users_roles`
--
ALTER TABLE `users_roles`
  ADD KEY `FK4e8pdqeupv69eukb2bvy2ftbd` (`role_id`);

--
-- Index pour la table `user_app`
--
ALTER TABLE `user_app`
  ADD PRIMARY KEY (`id`);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
