package designpatterns.facade.java;

public class OperatingSystem {
    public static void main(String[] args) {
        UserInterfaceFacade userInterface = new UserInterfaceFacade();
        userInterface.browseInternet();
        userInterface.playMusic();
        userInterface.manageDocs();
    }
}
