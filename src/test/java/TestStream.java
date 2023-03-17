import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.get;

public class TestStream{
    StreamTest StreamTest = new StreamTest();
    @Test
    public void checkResponse() throws IOException {
        Response response = get("https://reqres.in/api/users?page=2");
        //StreamTest responseBody = body.as(StreamTest.class);
        //Assert.assertEquals(2, responseBody.page);
        //Assert.assertEquals(2, responseBody.per_page);
    }
}