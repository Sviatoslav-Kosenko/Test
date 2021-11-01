package smoke;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class Test1 {
    @Test
    public void test(){
        given().
                baseUri("https://jsonplaceholder.typicode.com")
        .when()
                .get("/posts?userId=1&title=sunt aut facere repellat provident occaecati excepturi optio reprehenderit").
        then().
              statusCode(200);
    }
}
