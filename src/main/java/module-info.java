module org.example.javafxlearning {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;

    opens org.example.javafxlearning to javafx.fxml;
    opens org.example.javafxlearning.model to javafx.fxml, javafx.base; // ✅ add javafx.base here

    exports org.example.javafxlearning;
    exports org.example.javafxlearning.model; // Optional but clean
}
