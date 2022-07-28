package es.casaroja.emilio.login

import es.casaroja.emilio.main.MainController
import es.casaroja.emilio.showView
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage
import org.koin.core.component.KoinComponent

class LoginController(private val stage: Stage) : KoinComponent {
    @FXML
    private lateinit var passwordTextField: AnchorPane

    @FXML
    private lateinit var emailTextField: TextField

    @FXML
    private lateinit var okButton: Button

    @FXML
    fun loginButtonAction(event: ActionEvent) {
        stage.showView("main.fxml", getKoin().get<MainController>())
    }
}
