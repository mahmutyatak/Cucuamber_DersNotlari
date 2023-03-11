@ali
Feature: Kullanici yanlis bilgilrle giris yapamaz
  Background:
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar

  Scenario: TC102 Gecerli kullanici adi ve gecersiz sifre ile negatif login testi

    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kutusuna "username" yazar
    Then cokkie kabul eder
    And 3 saniye bekler
    And login butonuna basar
    And giris yapilamadigini test eder
    And sayfayi kapatir.
@ali
  Scenario: TC103 Gecersiz kullanici adi ve gecerli sifre ile negatif login testi

    And kullanici kutusuna "qdGecersizUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    Then cokkie kabul eder
    And 3 saniye bekler
    And login butonuna basar
    And giris yapilamadigini test eder
    And sayfayi kapatir.