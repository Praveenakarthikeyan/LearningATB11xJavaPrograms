package ex_21_Enum;

public class Lab100_ENUM_Key_Value {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("------------------------------");
        System.out.println(Colours.RED.getHexCode());
        System.out.println(Colours.GREEN.getHexCode());


        System.out.println("------------------------------");
        System.out.println(APIURLs.google.getUrl());
        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.katalon.getUrl());
    }
}
