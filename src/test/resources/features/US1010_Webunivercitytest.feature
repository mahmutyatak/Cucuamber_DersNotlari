Feature: US1010 WebUnivercity Testi
  @hero
  Scenario: TC14 Webunivercity sayfasinda istenen gorevleri yapar.

    Given kullanici "webunivercityUrl" anasayfaya gider
    Then Login Portal gorununceye kadar asagi iner
    Then Login Portal butonuna tiklar
    Then acilan ikinci windowa gecer
    And Username kutusuna deger yazdirir
    And Password kutusuna deger yazdirir
    Then webunivercity login butonuna basar
    And Popup'ta cikan yazinin validation failed oldugunu test edin
    And Ok diyerek Popup'i kapatin
    Then Ilk sayfaya geri donun
    And Ilk sayfaya donuldugunu test edin
    And tum sayfalari kapatir.




