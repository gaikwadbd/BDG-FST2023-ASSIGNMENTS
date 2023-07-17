package examples;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;

import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

public class ActionBase {
    //create your pointer from which move to up or down
    private static final PointerInput pointer= new PointerInput(PointerInput.Kind.TOUCH,"finger");

    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration){
        //create the sequence of action
        Sequence swipe =new Sequence(pointer,1);
        swipe.addAction(pointer.createPointerMove(Duration.ofSeconds(0), viewport(),start.getX(),start.getY()));
        swipe.addAction(pointer.createPointerDown(LEFT.asArg()));
        swipe.addAction(pointer.createPointerMove(Duration.ofSeconds(duration), viewport(),end.getX(),end.getY()));
        swipe.addAction(pointer.createPointerUp(LEFT.asArg()));

        driver.perform(Arrays.asList(swipe));

    }
}
