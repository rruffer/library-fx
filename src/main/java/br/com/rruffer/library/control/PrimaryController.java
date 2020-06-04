package br.com.rruffer.library.control;

import java.io.IOException;

import br.com.rruffer.library.App;
import br.com.rruffer.library.util.ConstantesUtil;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot(ConstantesUtil.ADD_BOOK);
//        App.setRoot(ConstantesUtil.SECUNDARY_VIEW);
    }
}
