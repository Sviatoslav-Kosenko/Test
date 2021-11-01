package smoke;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class Test2 {
    @Test
    public void test(){
        given().
                baseUri("https://jsonplaceholder.typicode.com")
        .when()
                .get("/posts?userId=1&title=sunt aut facere repellat provident occaecati excepturi optio reprehenderit")
        .then()
                .statusCode(200)
                .body("userId[0]", equalTo(1));


    }
}
