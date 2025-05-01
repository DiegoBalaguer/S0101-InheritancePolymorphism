package level03.exercise01.application;

import level03.exercise01.enums.OptionsMenuNews;
import level03.exercise01.model.Editor;
import level03.exercise01.utils.ConsoleUtils;

/**
 * PROGRAM: NewsMenuController
 * AUTHOR: Diego Balaguer
 * DATE: 03/04/2025
 */

public class NewsMenuController {

    private Editor editor;
    private NewsMenuWorkers newsMenuWorkers;

    public NewsMenuController(Editor editor) {
        this.editor = editor;
        newsMenuWorkers = new NewsMenuWorkers(editor);
        menu();
    }

    private void menu() {
        do {
            OptionsMenuNews.viewMenu(editor.getName());
            int resp = ConsoleUtils.readRequiredInt("");
            try {
                OptionsMenuNews option = OptionsMenuNews.values()[resp - 1];
                switch (option) {
                    case BACK_TO_MAIN_MENU -> {
                        return;
                    }
                    case NEWS_SOCCER_CREATE -> newsMenuWorkers.createNewsSoccer();
                    case NEWS_BASKETBALL_CREATE -> newsMenuWorkers.createNewsBasketball();
                    case NEWS_TENNIS_CREATE -> newsMenuWorkers.createNewsTennis();
                    case NEWS_F1_CREATE -> newsMenuWorkers.createNewsF1();
                    case NEWS_MOTORCYCLING_CREATE -> newsMenuWorkers.createNewsMotorcycling();
                    case NEWS_INSERT_TEXT_ARTICLE -> newsMenuWorkers.setTextNews();
                    case NEWS_REMOVE -> newsMenuWorkers.removeNewsById();
                    case NEWS_LIST -> newsMenuWorkers.showNewsList(editor.getNews());
                    case NEWS_CALCULATE_POINTS -> newsMenuWorkers.calculatePointsNews();
                    case NEWS_CALCULATE_PRICE -> newsMenuWorkers.calculatePriceNews();
                    default -> System.out.println("Error: The value is wrong.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: The value is wrong.");
            }
        } while (true);
    }
}
