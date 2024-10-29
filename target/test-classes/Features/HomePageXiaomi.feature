#Author: Teber
Feature: Xiaomi home page

  Scenario: clique sur le menu 
    Given utilisateur sur la page daccueil
    When utilisateur survol sur le menu "Smart Home" et clique sur le sous menu "Maison connectée"
    Then utilisateur deriger vers la page du maison connectee qui contient le message "Maison Connectée"
