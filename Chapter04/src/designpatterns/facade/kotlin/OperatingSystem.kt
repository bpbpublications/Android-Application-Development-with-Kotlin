package designpatterns.facade.kotlin

class MusicPlayer {
    fun playMusic() {
        println("La la la la la....")
    }
}

class NetworkService {
    fun browseServer() {
        println("Loading data from https://bpbonline.com...")
    }
}

class DocMaker {
    fun makeDocuments() {
        println("Creating a document...")
    }
}

class UserInterface(
    private val musicPlayer: MusicPlayer = MusicPlayer(),
    private val networkService: NetworkService = NetworkService(),
    private val docMaker: DocMaker = DocMaker()
) {
    fun playMusic() {
        musicPlayer.playMusic()
    }

    fun browseInternet() {
        networkService.browseServer()
    }

    fun manageDocs() {
        docMaker.makeDocuments()
    }
}

fun main() {
    val userInterface = UserInterface()
    with(userInterface) {
        browseInternet()
        playMusic()
        manageDocs()
    }
}