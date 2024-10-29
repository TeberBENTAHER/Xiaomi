#Author: Teber
Feature: Ajout produit au panier

  Scenario: Ajouter un produit au panier
    Given utilisateur sur la page de produit choisi
    When utilisateur clique sur le bouton Ajouter Au Panier et clique sur licone panier
    Then LE produit est ajoute au panier
