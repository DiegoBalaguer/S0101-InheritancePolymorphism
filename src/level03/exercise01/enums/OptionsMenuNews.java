package level03.exercise01.enums;

/**
 * PROGRAM: OptionsMenuNews
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public enum OptionsMenuNews {

    NEWS_SOCCER_CREATE("Create a soccer article"),
    NEWS_BASKETBALL_CREATE("Create a basketball article"),
    NEWS_TENNIS_CREATE("Create a tennis article"),
    NEWS_F1_CREATE("Create an F1 article"),
    NEWS_MOTORCYCLING_CREATE("Create a motorcycling article"),
    NEWS_INSERT_TEXT_ARTICLE("Type article's text"),
    NEWS_REMOVE("Remove article"),
    NEWS_LIST("List news"), NEWS_CALCULATE_POINTS("Calculate points news"),
    NEWS_CALCULATE_PRICE("Calculate price news"), BACK_TO_MAIN_MENU("Back to menu");

    private final String DESCRIPTION;

    // Constructor del enum
    OptionsMenuNews(String description) {
        this.DESCRIPTION = description;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public static void viewMenu(String editor) {
        System.out.println(System.lineSeparator() + "NEWS by editor: " + editor + System.lineSeparator());
        for (OptionsMenuNews optionMenu : OptionsMenuNews.values()) {
            System.out.println(optionMenu.ordinal() + 1 + ". " + optionMenu.getDESCRIPTION());
        }
        System.out.println(System.lineSeparator() + "Choose an option: ");
    }
}
