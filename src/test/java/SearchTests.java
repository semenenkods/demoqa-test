import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Test");
        $("#lastName").setValue("First");
        $("#userEmail").setValue("testfirst@gmail.com");
        $(byText("Female")).click();
        $("#userNumber").setValue(("1234567890"));
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();//add date selection
        $(".react-datepicker__year-select").selectOptionContainingText("1990");
        $(".react-datepicker__month-select").selectOptionContainingText("September");
        $(byText("13")).click();
        $("#subjectsInput").setValue("test");
        $(byText("Sports")).click();
        //$(".form-control-file").click();









    }
}
