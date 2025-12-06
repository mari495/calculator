
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.AudioClip;
import javafx.util.Duration;

public class ControllerClass {

    @FXML
    private TextField displayField;

    @FXML
    private TextField symbolField;

    // ロジッククラス（モデル）
    private CalcLogic calc = new CalcLogic();
    
    private AudioClip clickSound;


    // ============================
    // 数字ボタン（0〜9、00、.）
    // ============================
    @FXML
    private void handleNumber(ActionEvent e) {
    	playSound(); 
        Button btn = (Button) e.getSource();
        animateButton(btn);
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
    	playSound(); 
        Button btn = (Button) e.getSource();
        animateButton(btn);
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
    	playSound(); 
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
    	playSound(); 
        calc.togglePlusMinus();
        displayField.setText(calc.getDisplay());
    }


    // ============================
    // 1文字削除（del）
    // ============================
    @FXML
    private void handleDelete() {
    	playSound(); 
        calc.deleteOne();
        displayField.setText(calc.getDisplay());
    }


    // ============================
    // AC（オールクリア）
    // ============================
    @FXML
    private void handleClear() {
    	playSound(); 
        calc.clear();
        displayField.setText(calc.getDisplay());
        symbolField.setText("");
    }
    // ============================
    // CE（クリア）
    // ============================
    @FXML
    private void handleCE() {
    	playSound(); 
        displayField.setText("");
    }


    // ============================
    // 税込み（8%）
    // ============================
    @FXML
    private void handleZeikomi() {
    	playSound(); 
        calc.calcTaxIncluded();
        displayField.setText(calc.getDisplay());
    }


    // ============================
    // 税抜き（8%）
    // ============================
    @FXML
    private void handleZeinuki() {
    	playSound(); 
        calc.priceWithoutTax();
        displayField.setText(calc.getDisplay());
    }


    // ============================
    // √（ルート）
    // ============================
    @FXML
    private void handleRoot() {
    	playSound(); 
        calc.calcSqrt();
        displayField.setText(calc.getDisplay());
    }
    
    // ============================
    //ボタンを押したときのアニメーション追加
    // ============================
    private void animateButton(Button btn) {
    	playSound(); 
        ScaleTransition st = new ScaleTransition(Duration.millis(90.0), btn);
        st.setFromX(1.0);
        st.setFromY(1.0);
        st.setToX(0.88);
        st.setToY(0.88);
        st.setAutoReverse(true);
        st.setCycleCount(2);
        st.play();
    }
    
    @FXML
    public void initialize() {
        clickSound = new AudioClip(getClass().getResource("/sounds/click.mp3").toString());
    }
    
    private void playSound() {
        if (clickSound != null) {
            clickSound.play();
        }
    }
    


}
