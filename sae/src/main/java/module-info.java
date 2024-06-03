module com.example.sae {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.sae to javafx.fxml;
    exports com.example.sae;
}