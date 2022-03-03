Feature: Site Chanel - Panier Rouge Allure
  ETQ utilisateur j achete le produit Rouge Allure
  
   @product-makup @CHA-1
  Scenario: Acheter Produit Rouge Allure
    Given je navigue sur le site chanel
    Then je verifie si le site saffiche
    When Accès à la catégorie Makeup
    And je choisie le categorie Lipstick
    And je Clique sur le produit ROUGE ALLURE
    And j Ajoute le produit au panier
    Then verifie si le Nom de produit "ROUGE ALLURE" est dans le panier
    And verifie la quantité de produit  est egal "1" 
    And verifie le total panier est égal au prix du produit "$45.00"
    
