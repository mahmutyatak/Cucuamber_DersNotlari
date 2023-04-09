Feature: 2003 Alert calisma
  @abc1
  Scenario: TC102 Calisma
    Given kullanici "demoqaUrl" anasayfaya gider
    Then Alerts sekmesine tiklar
    And ustten ikinci click me butonuna basar
    And Allert in gorunur olmasini bekler
    Then Allert uzerindeki yazinin "This alert appeared after 5 seconds" oldugunu test eder
    And Ok diyerek alerti kapatir
