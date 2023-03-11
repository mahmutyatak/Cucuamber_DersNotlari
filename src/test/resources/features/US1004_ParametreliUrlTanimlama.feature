Feature: US1004 Kullanici parametre olarak girdigi url e gider

@ilk
  Scenario: TC08 Kullanici url'i parametre olarak girebilmeli

    Given kullanici "youtubeUrl" anasayfaya gider
    And 3 saniye bekler
    Then  "youtubeUrl" sayfsina gittigini test eder
    And sayfayi kapatir.