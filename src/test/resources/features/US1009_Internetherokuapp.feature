
Feature:US1009 Herokuapp implictly wait
  @pr2
  Scenario: TC13 implicitly wait gorevleri yapabilmeli
    Given kullanici "herokuUrl" anasayfaya gider
    Then Add Element butonuna basar
    And Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test eder

