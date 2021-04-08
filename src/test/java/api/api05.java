package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class api05 {
    @Test
    public void test(){
        /*
        When I send a GET request to REST API URL
	https://restful-booker.herokuapp.com/booking/1
    And Accept type is “application/JSON”
    Then
    HTTP Status Code should be 200
    And Response format should be "application/JSON"
    And firstname should be "Susan"
    And lastname should be "Brown"
    And checkin date should be "2015-02-16"
    And checkout date should be "2017-06-20"
       "firstname": "Sally",
    "lastname": "Jones",
    "totalprice": 445,
    "depositpaid": false,
    "bookingdates": {
        "checkin": "2020-07-27",
        "checkout": "2021-01-03"
         */
        Response response = given().accept(ContentType.JSON).when().get("https://restful-booker.herokuapp.com/booking");
        // respone.prettyPrint();
        response.then()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("firstname", Matchers.equalTo("Sally"))
                .body("lastname",Matchers.equalTo("Jones"))
                .body("bookingdates.checkin",Matchers.equalTo("2020-05-28"))
                .body("bookingdates.checkout",Matchers.equalTo("2020-11-29"));

        // {}icine gireceksen ismini yazip . yapip giriyoruz.
    }
}
