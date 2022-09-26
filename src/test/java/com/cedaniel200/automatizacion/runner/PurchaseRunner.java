package com.cedaniel200.automatizacion.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/purchase.feature",
        glue = "com.cedaniel200.automatizacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PurchaseRunner {
}
