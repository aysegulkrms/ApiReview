package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class api01 {

    @Test
    public void test(){
        Response response= given().when().get("https://restful-booker.herokuapp.com/booking");

        //
        response.prettyPrint();

// response.then().assertThat().statusCode(200).contentType(ContentType.JSON);
        response.then().assertThat().statusCode(200).contentType(ContentType.JSON);
        // cay istediginiz gibi mi kontrol edeyorsunuz,
        //"application/JSON da yazabiliriz.

        //System.out.println(response.statusCode());
        //
    }
}
