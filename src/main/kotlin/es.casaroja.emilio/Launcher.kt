package es.casaroja.emilio

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class Launcher : Application() {
    @Throws(Exception::class)
    override fun start(stage: Stage) {
        val button = Button("Click!")
        button.onAction = EventHandler { e: ActionEvent? -> println("Button clicked!") }
        val stackPane = StackPane()
        stackPane.children.add(button)
        val scene = Scene(stackPane, 300.0, 250.0)
        stage.scene = scene
        stage.show()
    }

    companion object {
//        @JvmStatic
        fun main(args: Array<String>) {
            launch(*args)
        }
    }
}
