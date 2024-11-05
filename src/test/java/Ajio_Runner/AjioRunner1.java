package Ajio_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Ajio_Scripts"},
glue = {"Step_Definition"},
plugin = {"html:target/cucumberReport2.html"})
public class AjioRunner1 {

}
