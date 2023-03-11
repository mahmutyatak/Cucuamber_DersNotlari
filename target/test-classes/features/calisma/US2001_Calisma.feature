@yusuf
Feature: US2001 Kullanici Configuration Dosyasindaki Bilgilerle Login olabilmeli
  Scenario: TC101 Gecerli kullanici adi ve sifre ile pozitif login testi
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    And cokkie kabul eder
    And 3 saniye bekler
    Then login butonuna basar
    And basarili giris yapildigini test eder
    And 3 saniye bekler
    Then sayfayi kapatir.