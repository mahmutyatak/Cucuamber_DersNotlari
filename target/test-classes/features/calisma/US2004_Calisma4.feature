Feature: US2004 calisma

  @a123
  Scenario Outline: TC1005 google

    Given kullanici "googleUrl" anasayfaya gider
    Then  Arama Kutusuna karsilastirma yapmak istedigi "<para birimlerini>" girer
    Then  Para birimlerinin karsilastirmasini alir
    Then  Verilen degerlerin 20 den kucuk oldugunu dogrular dogrular
    Examples:
      | para birimlerini |
      | dolar to tl      |
      |dolar to euro     |

