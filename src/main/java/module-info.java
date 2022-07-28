module es.casaroja.emilio {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires kotlin.stdlib;
    requires koin.core.jvm;

    opens es.casaroja.emilio;
    opens es.casaroja.emilio.login;
    opens es.casaroja.emilio.main;
    exports es.casaroja.emilio;
}
