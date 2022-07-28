package es.casaroja.emilio

import es.casaroja.emilio.login.LoginController
import es.casaroja.emilio.login.LoginManager
import es.casaroja.emilio.main.EmailManager
import es.casaroja.emilio.main.MainController
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.module

class Launcher : Application() {

    @Throws(Exception::class)
    override fun start(stage: Stage) {
        val app = startKoin {
            printLogger()
            modules(module {
                single { LoginManager() }
                single { EmailManager() }
                single { stage }
                single { LoginController(get()) }
                single { MainController() }
            })
        }
        stage.showView("login.fxml", app.koin.get<LoginController>())
    }

    companion object {
        fun main(args: Array<String>) {
            launch(*args)
        }
    }
}

fun Stage.showView(viewName: String, controller: Any) {
    val fxmlLoader = FXMLLoader(Launcher.javaClass.getResource(viewName))
    fxmlLoader.setController(controller)
    title = "JavMail"
    scene = Scene(fxmlLoader.load())
    show()
}
