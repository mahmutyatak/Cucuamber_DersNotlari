Feature: US1006 Kullanici scenerio outline ile birden fazla kelime aratir.
  @veli
  Scenario Outline: TC10 Amazon coklu run testi
    Given kullanici "amazonUrl" anasayfaya gider
    Then amazonda "<kelimeler>" icin arama yapar
    And sonuclarin "<kelimeler>" icerdigini test eder
    And sayfayi kapatir.
    Examples:
      |kelimeler  |
      |Nutella    |
      |Java       |
      |Samsung    |
      |Apple      |
      |Furkan     |

