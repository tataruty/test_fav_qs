package api;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static constants.Constant.FavQs.APP_TOKEN;
import static constants.Constant.FavQs.BASE_URL;
import static io.restassured.RestAssured.given;

public class ListQuotesTest {
  @Test
  public void checkAmountPerPage() {
    List<Quote> quotes =
        given()
            .when()
            .headers("Authorization", "Bearer " + APP_TOKEN)
            .contentType(ContentType.JSON)
            .get(BASE_URL + "quotes")
            .then()
            .log()
            .all()
            .extract()
            .body()
            .jsonPath()
            .getList("quotes", Quote.class);
    Assert.assertEquals(quotes.size(), 25);
  }
}
