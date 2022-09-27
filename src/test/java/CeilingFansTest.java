import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.model.CeilingFan;

import static org.junit.jupiter.api.Assertions.*;


public class CeilingFansTest {
    CeilingFan ceilingFan = new CeilingFan();

    //Scenario 1 Ceiling fan turning On
    @Given("Ceiling Fan is Off")
    public void ceiling_fan_is_off() {
        ceilingFan.setSpeed(0);
    }
    @When("I Pull Speed Cord")
    public void i_pull_speed_cord() {
        ceilingFan.pullSpeedCord();
    }
    @Then("Ceiling Fan should be on")
    public void ceiling_fan_should_be_on() {
        assertTrue(ceilingFan.getSpeed() > 0, "The fan is on");
    }

    //Scenario 2: Ceiling fan go on reverse direction
    @Given("Ceiling Fan should be going forward")
    public void ceiling_fan_should_be_going_forward() {
        assertFalse(ceilingFan.isReverse(), "Fan is going forward");
    }
    @When("I pull Reverse Cord")
    public void i_pull_reverse_cord() {
        ceilingFan.pullReverseCord();
    }
    @Then("Ceiling Fan should be going reverse")
    public void ceiling_fan_should_be_going_reverse() {
        assertTrue(ceilingFan.isReverse(), "Fan is going in reverse");
    }
}
