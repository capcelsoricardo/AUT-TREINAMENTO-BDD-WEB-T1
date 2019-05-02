package curso.broadleaf.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/features"},
		glue = {"curso.broadleaf.steps", "curso.broadleaf.setup"},
		snippets = SnippetType.CAMELCASE,
		tags = {"@Sprint3"})

public class RunnerTest {

}
