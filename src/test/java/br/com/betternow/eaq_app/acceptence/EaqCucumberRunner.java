package br.com.betternow.eaq_app.acceptence;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\resources\\features\\",
        plugin = "pretty",
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "br.com.betternow.eaq_app.test"
)
public class EaqCucumberRunner {



}

