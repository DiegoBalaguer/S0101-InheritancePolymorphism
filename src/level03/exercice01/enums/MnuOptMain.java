package level03.exercice01.enums;

/**
 * PROGRAM: level03.MnuOptMain
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public enum MnuOptMain {

    EDITOR_CRE("Create editor"),
    EDITOR_DEL("Delete editor"),
    EDITOR_LIST("List editors"),
    NEWS_LIST("List news"),
    EDITOR_SAL("Type editors' salary"),
    NEWS_MNGMT("News utilities"),
    TESTING("Load data for testing."),
    EXIT("Exit");

    private final String description;

    // Constructor del enum
    MnuOptMain(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void viewMenu() {
        System.out.println(System.lineSeparator() + "EDITORS" + System.lineSeparator());
        for (MnuOptMain optionMenu : MnuOptMain.values()) {
            System.out.println(optionMenu.ordinal() + 1 + ". " + optionMenu.getDescription());
        }
        System.out.println(System.lineSeparator() + "Choose an option: ");
    }
}
