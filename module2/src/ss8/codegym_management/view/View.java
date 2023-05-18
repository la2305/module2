package ss8.codegym_management.view;

import ss8.codegym_management.controller.CodeGymController;
import ss8.codegym_management.respository.CodeGymRespository;

public class View {
    public static void main(String[] args) {
        CodeGymController controller = new CodeGymController();
        controller.showMenu();
    }
}
