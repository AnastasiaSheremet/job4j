package ru.job4j.condition;

/**
 * @author Anastasia Sheremet
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Answers the questions.
     * @param question question from customer.
     * @return Answer.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
