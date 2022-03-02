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
  "duration": 6352289900,
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
  "duration": 13138428901,
  "status": "passed"
});
formatter.match({
  "location": "FirstTestStepsDefinitions.je_verifie_si_le_site_saffiche()"
});
formatter.result({
  "duration": 11977799,
  "status": "passed"
});
formatter.match({
  "location": "SecondTestStepsDefinitions.accèsÀLaCatégorieMakeup()"
});
formatter.result({
  "duration": 130518200,
  "status": "passed"
});
formatter.match({
  "location": "SecondTestStepsDefinitions.jeChoisieLeCategorieLipstick()"
});
formatter.result({
  "duration": 434277100,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not interactable\n  (Session info: chrome\u003d98.0.4758.102)\n  (Driver info: chromedriver\u003d98.0.4758.102 (273bf7ac8c909cde36982d27f66f3c70846a3718-refs/branch-heads/4758@{#1151}),platform\u003dWindows NT 10.0.19042 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 234 milliseconds\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027DESKTOP-0MVFVE5\u0027, ip: \u0027192.168.100.136\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.12\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:49730}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d98.0.4758.102 (273bf7ac8c909cde36982d27f66f3c70846a3718-refs/branch-heads/4758@{#1151}), userDataDir\u003dC:\\Users\\medya\\AppData\\Local\\Temp\\scoped_dir8052_274479290}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d98.0.4758.102, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 7df18336886e3992bc9a54930e500de2\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:273)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat com.ChanelProject.secondTest.pages.SecondTestPage.click_on_lipstick(SecondTestPage.java:69)\r\n\tat com.ChanelProject.secondTest.stepsDefinitions.SecondTestStepsDefinitions.jeChoisieLeCategorieLipstick(SecondTestStepsDefinitions.java:43)\r\n\tat ✽.And je choisie le categorie Lipstick(SearchProduct.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SecondTestStepsDefinitions.jeCliqueSurLeProduitROUGEALLURE()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SecondTestStepsDefinitions.jAjouteLeProduitAuPanier()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.write("Current page URL is https://www.chanel.com/us/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 22502510901,
  "status": "passed"
});
});