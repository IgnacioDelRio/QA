package runner;

import configuration.Config;
import factoryRequest.FactoryRequest;
import factoryRequest.RequestInformation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import jsonCompare.JsonCompare;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class MyStepdefsParcial3 {
    Response response;
    RequestInformation request = new RequestInformation();
    Map<String, String> data = new HashMap<>();

    @Given("i got access to todoly")
    public void iGotAccessToTodoly() {
    }

    @When("i send the GET request to url {}")
    public void iSendTheGETRequestToUrlHttpTodoLyApiAuthenticationTokenJson(String url) {
        request.setAuthType(Config.AUTH_BASIC);
        request.setAuthValue(Config.AUTH_BASIC_VALUE1);
        request.setUrl(replaceAllData(url));
        response = FactoryRequest.make("GET").send(request);
    }

    @When("i send the DELETE request to url {}")
    public void iSendTheDELETERequestToUrlHttpTodoLyApiAuthenticationTokenJson(String url) {
        request.setAuthType(Config.TOKEN);
        request.setAuthValue(replaceAllData("TokenValue"));
        request.setUrl(replaceAllData(url));
        response = FactoryRequest.make("DELETE").send(request);
    }

    @Then("i expect a response body")
    public void iGetAResponseBody(String body){
        Assert.assertTrue("Mal", JsonCompare.areEqualJson(replaceAllData(body), response.getBody().asString()));
    }

    @And("i get a property {} and save it in {}")
    public void iGetAPropertyTokenStringAndSaveItInTokenValue(String property, String varName) {
        data.put(varName, response.then().extract().path(property) + "");
    }

    private String replaceAllData(String value) {
        for (String key : data.keySet()) {
            value = value.replace(key, data.get(key));
        }
        return value;
    }
}
