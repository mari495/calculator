import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerClass {

    @FXML
    private TextField displayField;

    @FXML
    private TextField symbolField;

    // ロジッククラス（モデル）
    private CalcLogic calc = new CalcLogic();


    // ============================
    // 数字ボタン（0〜9、00、.）
    // ============================
    @FXML
    private void handleNumber(ActionEvent e) {
        Button btn = (Button) e.getSource();
        String num = btn.getText();   // "0" "1" "2" … "00" "."
        System.out.println("押された数字 = " + num);
  
        
        calc.inputNumber(num);       // CalcLogic に渡す
        displayField.setText(calc.getDisplay());
        
    }


    // ============================
    // 演算子ボタン（＋−×÷）
    // ============================
    @FXML
    private void handleOperator(ActionEvent e) {
        Button btn = (Button) e.getSource();
        String op = btn.getText(); // "+", "-", "×", "÷"

        calc.setOperator(op);
        symbolField.setText(op);
        System.out.println("押された演算子 = " + op);
    }


    // ============================
    // イコールボタン (=)
    // ============================
    @FXML
    private void handleEqual() {
        calc.calculate();
        displayField.setText(calc.getDisplay());
        symbolField.setText("=");
    }

    // ============================
    // 小数点（.）
    // ============================
    @FXML
    private void handleDot(ActionEvent e) {
        String current = displayField.getText();

        // すでに . があるなら何もしない
        if (current.contains(".")) {
            return;
        }

        // 空または0なら「0.」から始める
        if (current.isEmpty() || current.equals("0")) {
            displayField.setText("0.");
        } else {
            displayField.setText(current + ".");
        }
    }

    // ============================
    // ± ボタン
    // ============================
    @FXML
    private void handlePlusMinus() {
        calc.togglePlusMinus();
        displayField.setText(calc.getDisplay());
    }


    // ============================
    // 1文字削除（del）
    // ============================
    @FXML
    private void handleDelete() {
        calc.deleteOne();
        displayField.setText(calc.getDisplay());
    }


    // ============================
    // AC（オールクリア）
    // ============================
    @FXML
    private void handleClear() {
        calc.clear();
        displayField.setText(calc.getDisplay());
        symbolField.setText("");
    }
    // ============================
    // CE（クリア）
    // ============================
    @FXML
    private void handleCE() {
        displayField.setText("");
    }


    // ============================
    // 税込み（8%）
    // ============================
    @FXML
    private void handleZeikomi() {
        calc.calcTaxIncluded();
        displayField.setText(calc.getDisplay());
    }


    // ============================
    // 税抜き（8%）
    // ============================
    @FXML
    private void handleZeinuki() {
        calc.priceWithoutTax();
        displayField.setText(calc.getDisplay());
    }


    // ============================
    // √（ルート）
    // ============================
    @FXML
    private void handleRoot() {
        calc.calcSqrt();
        displayField.setText(calc.getDisplay());
    }

}
