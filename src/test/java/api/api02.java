package api;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class api02 {
    @Test
    public void test() {
        //postive test case miz
        Response response = given().when().get("https://restful-booker.herokuapp.com/booking/5");
        // response.prettyPrint();

        response.then().assertThat().statusCode(200).contentType(ContentType.JSON);


    }

    @Test
    public void test01() {
// negative
        Response response = given().when().get("https://restful-booker.herokuapp.com/booking/1001");
        response.then().assertThat().statusCode(404);
        Assert.assertTrue(response.asString().contains("Not Found"));
        Assert.assertFalse(response.asString().contains("Mali"));

    }
}