package smoke;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.equalTo;


public class Test3 {
    @Test
    public void test(){
        given().
                baseUri("https://jsonplaceholder.typicode.com")
        .when()
                .get("/posts?userId=1&title=qui est esse")
        .then()
                .statusCode(200)
                .body("userId[0]", equalTo(1), "title",hasItem("qui est esse"));


    }
}
