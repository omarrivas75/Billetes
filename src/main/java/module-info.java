module com.mycompany.denominacionesbilletes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.denominacionesbilletes to javafx.fxml;
    exports com.mycompany.denominacionesbilletes;
}
