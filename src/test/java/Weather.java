
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;


public class Weather {
    @Test
    public void restAssuredexample() {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httprequest = RestAssured.given();
        Response response = httprequest.request(Method.GET, "/Hyderabad");
        String responseBody = response.getBody().asString();
        System.out.println("Response body is" + responseBody);
    }
}
