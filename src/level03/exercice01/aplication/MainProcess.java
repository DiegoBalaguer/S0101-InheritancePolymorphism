package level03.exercice01.aplication;

import level03.exercice01.enums.MnuOptMain;
import level03.exercice01.model.Editor;
import level03.exercice01.test.Test;
import level03.exercice01.data.TablesPricesPoints;


import java.util.ArrayList;

public class MainProcess {

    private ArrayList<Editor> editors;
    private EditorManager editorManager;

    public void initialProcess() {

        TablesPricesPoints tablesPricesPoints = new TablesPricesPoints();

        editors = new ArrayList<>();
        editorManager = new EditorManager(editors);
        tablesPricesPoints.loadInitValues(editors);
        menu();
    }

    private void menu() {

        do {
            MnuOptMain.viewMenu();
            int answer = Utils.valueInt("");
            try {
                MnuOptMain idMenu = MnuOptMain.values()[answer - 1];
                switch (idMenu) {
                    case EXIT -> {
                        Utils.closeScanner();
                        return;
                    }
                    default -> menuOptionsWithoutEditors(idMenu);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: The value is wrong.");
            }
        } while (true);
    }

    private void menuOptionsWithoutEditors(MnuOptMain idMenu) {
        switch (idMenu) {
            case TESTING -> Test.loadDataTest(editors);
            case EDITOR_CRE -> editorManager.addEditor();
            default -> {
                if (editors.isEmpty()) {
                    System.out.println("No editors registered into the system.");
                } else menuOptionsWithEditors(idMenu);
            }
        }
    }

    private void menuOptionsWithEditors(MnuOptMain idMenu) {

        switch (idMenu) {
            case EDITOR_DEL -> editorManager.removeEditor();
            case EDITOR_LIST -> editorManager.listEditors();
            case NEWS_LIST -> editorManager.newsListAllEditors();
            case EDITOR_SAL -> editorManager.setSalaryEditor();
            case NEWS_MNGMT -> editorManager.newsEditorManager();
            default -> System.out.println("Error: The value is wrong.");
        }
    }
}
