package ss19_case_study.view;

import ss19_case_study.common.Regex;
import ss19_case_study.controller.FuramaController;
import ss19_case_study.model.facility.Room;

public class View {
    public static void main(String[] args) {
        System.out.println("Welcome to Đà Nẵng Furama resort");
        FuramaController.displayMainMenu();
    }
}
