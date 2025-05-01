package level03.exercise01.application;

import level03.exercise01.enums.OptionsMenuMain;
import level03.exercise01.model.Editor;
import level03.exercise01.data.DataTest;
import level03.exercise01.data.TablesPricesPoints;
import level03.exercise01.utils.ConsoleUtils;

import java.util.ArrayList;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class ApplicationController {

    private ArrayList<Editor> editors;
    private ApplicationWorkers applicationManager;

    public void run() {
        editors = new ArrayList<>();
        applicationManager = new ApplicationWorkers(editors);
        Editor.setSalary(TablesPricesPoints.loadInitialEditorSalary());
        menu();
        ConsoleUtils.closeScanner();
    }

    private void menu() {
        do {
            OptionsMenuMain.viewMenu();
            int answer = ConsoleUtils.readRequiredInt("");
            try {
                OptionsMenuMain idMenu = OptionsMenuMain.values()[answer - 1];
                if (idMenu == OptionsMenuMain.EXIT) {
                        return;
                    }
                    else menuOptionsWithoutEditors(idMenu);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: The value is wrong.");
            }
        } while (true);
    }

    private void menuOptionsWithoutEditors(OptionsMenuMain idMenu) {
        switch (idMenu) {
            case TESTING -> DataTest.loadDataTest(editors);
            case EDITOR_CREATE -> applicationManager.createEditor();
            default -> {
                if (editors.isEmpty()) {
                    System.out.println("No editors registered into the system.");
                } else menuOptionsWithEditors(idMenu);
            }
        }
    }

    private void menuOptionsWithEditors(OptionsMenuMain idMenu) {
        switch (idMenu) {
            case EDITOR_DELETE -> applicationManager.removeEditorByName();
            case EDITOR_LIST -> applicationManager.showListEditors();
            case EDITOR_SET_SALARY -> applicationManager.modifySalaryEditors();
            case NEWS_MENU_MANAGER -> applicationManager.newsEditorManagerByEditorId();
            default -> System.out.println("Error: The value is wrong.");
        }
    }
}
