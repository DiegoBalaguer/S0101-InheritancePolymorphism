package level03.exercise01.enums;

/**
 * PROGRAM: OptionsMenuMain
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public enum OptionsMenuMain {

    EDITOR_CREATE("Create editor"),
    EDITOR_DELETE("Delete editor"),
    EDITOR_LIST("List editors"),
    EDITOR_SET_SALARY("Type editors' salary"),
    NEWS_MENU_MANAGER("News utilities"),
    TESTING("Load data for testing."),
    EXIT("Exit");

    private final String DESCRIPTION;

    // Constructor del enum
    OptionsMenuMain(String description) {
        this.DESCRIPTION = description;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public static void viewMenu() {
        System.out.println(System.lineSeparator() + "EDITORS" + System.lineSeparator());
        for (OptionsMenuMain optionMenu : OptionsMenuMain.values()) {
            System.out.println(optionMenu.ordinal() + 1 + ". " + optionMenu.getDESCRIPTION());
        }
        System.out.println(System.lineSeparator() + "Choose an option: ");
    }
}
