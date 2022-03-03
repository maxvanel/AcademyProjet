$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchProduct.feature");
formatter.feature({
  "line": 2,
  "name": "Site Chanel - Panier Rouge Allure",
  "description": "ETQ utilisateur j achete le produit Rouge Allure",
  "id": "site-chanel---panier-rouge-allure",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@product-makup"
    }
  ]
});
formatter.before({
  "duration": 1995045500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Acheter Produit Rouge Allure",
  "description": "",
  "id": "site-chanel---panier-rouge-allure;acheter-produit-rouge-allure",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "je navigue sur le site chanel",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "je verifie si le site saffiche",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Accès à la catégorie Makeup",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "je choisie le categorie Lipstick",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "je Clique sur le produit ROUGE ALLURE",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "j Ajoute le produit au panier",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verifie si le Nom de produit \"ROUGE ALLURE\" est dans le panier",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verifie la quantité de produit  est egal \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "verifie le total panier est égal au prix du produit \"$45.00\"",
  "keyword": "And "
});
formatter.match({
  "location": "FirstTestStepsDefinitions.je_navigue_sur_le_site_chanel()"
});
formatter.result({
  "duration": 2359510700,
  "status": "passed"
});
formatter.match({
  "location": "FirstTestStepsDefinitions.je_verifie_si_le_site_saffiche()"
});
formatter.result({
  "duration": 10498100,
  "status": "passed"
});
formatter.match({
  "location": "SecondTestStepsDefinitions.accèsÀLaCatégorieMakeup()"
});
formatter.result({
  "duration": 110871000,
  "status": "passed"
});
formatter.match({
  "location": "SecondTestStepsDefinitions.jeChoisieLeCategorieLipstick()"
});
formatter.result({
  "duration": 3427187200,
  "status": "passed"
});
formatter.match({
  "location": "SecondTestStepsDefinitions.jeCliqueSurLeProduitROUGEALLURE()"
});
formatter.result({
  "duration": 1429534400,
  "status": "passed"
});
formatter.match({
  "location": "SecondTestStepsDefinitions.jAjouteLeProduitAuPanier()"
});
formatter.result({
  "duration": 4438400400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ROUGE ALLURE",
      "offset": 30
    }
  ],
  "location": "SecondTestStepsDefinitions.verifieSiLeNomDeProduitEstDansLePanier(String)"
});
formatter.result({
  "duration": 3051723100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 42
    }
  ],
  "location": "SecondTestStepsDefinitions.verifieLaQuantitéDeProduitEstEgal(String)"
});
formatter.result({
  "duration": 160116700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$45.00",
      "offset": 53
    }
  ],
  "location": "SecondTestStepsDefinitions.verifieLeTotalPanierEstÉgalAuPrixDuProduit(String)"
});
formatter.result({
  "duration": 36687900,
  "status": "passed"
});
formatter.after({
  "duration": 1325866900,
  "status": "passed"
});
});