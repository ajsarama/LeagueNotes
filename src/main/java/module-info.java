module com.ajsarama.lolnotes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ajsarama.lolnotes to javafx.fxml;
    exports com.ajsarama.lolnotes;
}