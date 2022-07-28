package es.casaroja.emilio.main

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.TableView
import javafx.scene.control.TreeView
import javafx.scene.web.WebView
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainController : KoinComponent {

    val mgr by inject<EmailService>()

    @FXML
    private lateinit var emailTableView: TableView<Any>

    @FXML
    private lateinit var emailWebView: WebView

    @FXML
    private lateinit var emailsTreeview: TreeView<Any>

    @FXML
    fun deleteAction(event: ActionEvent) {

    }

    @FXML
    fun openAction(event: ActionEvent) {

    }

    @FXML
    fun optionsAction(event: ActionEvent) {

    }

}
