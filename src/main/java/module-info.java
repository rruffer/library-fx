module br.com.rruffer.library {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens br.com.rruffer.library to javafx.fxml;
    exports br.com.rruffer.library;

    opens br.com.rruffer.library.control to javafx.fxml;
    exports br.com.rruffer.library.control to com.jfoenix;

}