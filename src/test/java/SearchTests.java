import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchTests {
    @Test
    void successfulSearchTest() {

        Configuration.browserSize = "640x480";
        Configuration.holdBrowserOpen = true;
        open("https://demoqa.com/automation-practice-form");


        $("#firstName").setValue("Test");
        $("#lastName").setValue("First");
        $("#userEmail").setValue("testfirst@gmail.com");
        $("#userEmail").scrollIntoView(true);//for small res-n
        $(byText("Female")).click();
        $("#userNumber").setValue(("1234567890"));
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOptionContainingText("1990");
        $(".react-datepicker__month-select").selectOptionContainingText("September");
        $(byText("13")).click();
        $("#subjectsInput").setValue("m");
        $(byText("Maths")).click();
        $(byText("Maths")).scrollIntoView(true);//for small res-n

        $(byText("Sports")).click();

        //Upload img
        //$(byText("Select picture")).click();///
        $("#uploadPicture").uploadFromClasspath("testPicture.jpg");

        $("#currentAddress").setValue("my current address");
        $("#currentAddress").scrollIntoView(true);//for small res-n

       $(byText("Select State")).click();
       $(byText("NCR")).click();

       $(byText("Select City")).click();
       $(byText("Delhi")).click();

       $("#submit").click();
    }
}
