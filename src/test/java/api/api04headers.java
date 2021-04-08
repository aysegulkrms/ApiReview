package api;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class api04headers {

    @Test
    public void test(){
        Response response = given().when().get("https://restful-booker.herokuapp.com/booking");

        //all headers
        System.out.println(response.headers());

        // specific header
        System.out.println(response.header("Server"));
    }
}
