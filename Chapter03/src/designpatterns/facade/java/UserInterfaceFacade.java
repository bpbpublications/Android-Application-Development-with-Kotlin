package designpatterns.facade.java;

class UserInterfaceFacade {
    private MusicPlayer musicPlayer;
    private NetworkService networkService;
    private DocMaker docMaker;

    UserInterfaceFacade() {
        musicPlayer = new MusicPlayer();
        networkService = new NetworkService();
        docMaker = new DocMaker();
    }

    void playMusic() {
        musicPlayer.playMusic();
    }

    void browseInternet() {
        networkService.browseServer();
    }

    void manageDocs() {
        docMaker.makeDocuments();
    }
}
