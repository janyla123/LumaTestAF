package ui.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DropDownHelper {

    public static void selectUsingVisibleText(WebElement element, String txt){
        Select select= new Select(element);
        select.selectByVisibleText(txt);
    }

    public static void selectUsingValue(WebElement element, String txt){
        Select select= new Select(element);
        select.selectByValue(txt);
    }

    public static List<String> getAllDropDownValue(WebElement locator){
        Select select= new Select(locator);
        List<WebElement> elementList= select.getOptions();
        List<String> valueList= new LinkedList<>();
        for(WebElement element : elementList){
            valueList.add(element.getText());
        }
        return valueList;
    }


    public static void selectRandomColor(WebElement element){
        Random random=new Random();
        List<String> colors=List.of("Red", "Blue" , "Green", "Yellow" , "Purple", "White", "Black", "Voilet", "Indigo", "Magenta", "Aqua" );

        int index= random.nextInt(colors.size());
        String color=colors.get(index);
        selectUsingVisibleText(element,color);

    }

    public static void selectUsingIndex(WebElement element, int index){
        Select select= new Select(element);
        select.selectByIndex(index);
    }
}
