package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources", // Özellik dosyalarınızın yolu
		glue = "stepDefinitions", // Adım tanımları ve hooks class'inin oldugu paketiniz
		tags = "@test", // Çalıştırılacak testlerin etiketleri
		plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
		monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {
	// Burada herhangi bir özel kod bulunmasına gerek yok
}


