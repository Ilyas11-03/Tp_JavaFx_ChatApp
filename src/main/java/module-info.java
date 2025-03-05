module ma.enset.tp_javafx_chatapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ma.enset.tp_javafx_chatapp to javafx.fxml;
    exports ma.enset.tp_javafx_chatapp;
}