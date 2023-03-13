Feature: US1007 Scenerio Outline ile coklu negatif login test
  @negatif
  Scenario Outline: TC11 kullanici verilen listedeki kullanici isimleri ile giris yapamamli
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna "<username>" yazar
    And password kutusuna "<password>" yazar
    And cokkie kabul eder
    And 2 saniye bekler
    And login butonuna basar
    Then giris yapilamadigini test eder
    And sayfayi kapatir.

    Examples:
    |username||password|
    |Hasan   ||12345   |
    |Said    ||65475   |
    |ali     ||kdkf    |