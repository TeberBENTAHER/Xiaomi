#Author: Teber
Feature: Page Maison Connectee

 
    

  Scenario: cliquee sur le produit
  Given utilisateur sur la page Maison connectee
    When utilisateur clique sur le produit "Xiaomi Smart Air Fryer 6.5 L"
   
    Then le produit choisi est affichee
