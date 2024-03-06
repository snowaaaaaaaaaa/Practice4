package com.mycompany.ex02;

public class MainTest {
    public void testCalc() {
        ViewTable viewTable = new TableView();
        viewTable.viewInit();
        viewTable.viewShow();
    }

    public void testRestore() {
        // Реалізація для перевірки коректності відновлення даних при серіалізації
    }

    public static void main(String[] args) {
        MainTest test = new MainTest();
        test.testCalc();
        test.testRestore();
    }
}
