@search-product
Feature: Site Chanel - Produit Rouge Allure
  ETQ utilisateur je souhaite de chercher le produit Rouge Allure

  Background: 
    Given je navigue sur le site chanel
    Then je verifie si le site saffiche

  Scenario: Recherche Rouge Allure
    When Je clique sur la barre de recherche
    And Je Cherche le mot "ROUGE ALLURE"
    Then Je Vérifie si les éléments de la liste affichée contiennent le mot "ROUGE ALLURE"
    When Je Sélectionne le deuxième élément de la liste
    Then jassure que le nom du produit affiché et le même que "ROUGE ALLURE VELVET LE LION DE CHANEL".
