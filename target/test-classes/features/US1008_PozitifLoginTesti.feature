
Feature: US1008 gecerli kullanici adi ve sifre ile sisteme giris
  @pr2
  Scenario: TC12 Gecerli username ve password ile basarili giris yapilabilmeli
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna config reader dan "qdGecerliUsername" yazar
    And password kutusuna config reader dan "qdGecerliPassword" yazar
    And cokkie kabul eder
    And 3 saniye bekler
    And login butonuna basar
    Then basarili giris yapildigini test eder
