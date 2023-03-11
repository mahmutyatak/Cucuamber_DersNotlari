package runners;

import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ="stepdefinitions",
        tags = "@ali",

        dryRun = false
)
public class Runner {


}
/*
Runner classı testlerimizi tekli veya toplu calistirmmizi sağlar
Runner classı bos classdır
Asıl işi yapan ik tane notasyondur.

@cUCUMBER OPTİONS İCERİSİNE YAZACAĞIMIZ DEGERLER BU RUNNER CLASSININ
CALİSTİRACAGİ
-FEATURE DOSYALARI
-feature dosyalarina ait JAva methodalrinin nerede oldugunu
-ve bu feature dosyalari icerisinde olusturulan senaryo veya featurelerin
hangilerinin calistirilacagini belirler.

dryrun default degeri olan false oldugunda feature dosyasında run tusune bastımızı gibi calistirir
step definition i olusturulan adimlarş calistirir.
step definition i olmayan ilk adimda eksik adımlari bize raporlar.

Ancak bu tur calistirmada gereksiz calistirilan adimlar olur bunun yerine
    true degerini verirseniz
    testi calistirmayi denemez
    sadece adimlari kontrol eder ve eksik adim varsa kodlari olusturur.
    Eksik adim yoksa HİCBİR adimi calistirmadan test passed der
    buradaki test passed eksik adım yok anlamina gelmektedir

 */