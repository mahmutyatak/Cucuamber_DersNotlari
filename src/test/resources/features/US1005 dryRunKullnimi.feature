
Feature: US1005 Kullanici amazonda urun aratıp 2. urun detaylarini test edin

  Scenario: TC09 Kullanici arama sonuclarinda istedigi urunu test edebilmeli
    Given kullanici "amazonUrl" anasayfaya gider
    When amazonda "Nutella" icin arama yapar
    And 2. urune gider
  And 5 saniye bekler
    Then urun isminin "Nutella" icerdigini test eder.
