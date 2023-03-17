import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class APITests {
    @Test
    public static void test1() {
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getBody().asString());
        int statusCode = response.getStatusCode();
        assertEquals(statusCode, 200,"success");
    }

    @Test
    public static void test2() {
        given().get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200);
    }
}
