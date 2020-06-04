package br.com.rruffer.library.control;

import java.io.IOException;

import br.com.rruffer.library.App;
import br.com.rruffer.library.util.ConstantesUtil;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot(ConstantesUtil.PRIMARY_VIEW);
    }
}