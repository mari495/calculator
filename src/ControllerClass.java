
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ControllerClass {
	@FXML
    private TextField displayField;//ディスプレイtest
	@FXML
    private TextField symbolField; // ディスプレイ上の小ウインドウ
	
    private Integer currentValue = 0;//ディスプレイの文字を数値化して保持
    private Integer temporaryValue = 0;
    private String operator = "";
    private boolean isNewCalculation = true; // 新しい計算式のフラグ
    
    
    @FXML
    private Button button_0;

    @FXML
    private Button button_00;

    @FXML
    private Button button_1;

    @FXML
    private Button button_2;

    @FXML
    private Button button_3;

    @FXML
    private Button button_4;

    @FXML
    private Button button_5;

    @FXML
    private Button button_6;

    @FXML
    private Button button_7;

    @FXML
    private Button button_8;

    @FXML
    private Button button_9;

    @FXML
    private Button button_hiku;

    @FXML
    private Button button_kakeru;

    @FXML
    private Button button_syousuuten;

    @FXML
    private Button button_tasu;

    @FXML
    private Button button_wa;

    @FXML
    private Button button_waru;
    @FXML
    private Button button_clear;
    @FXML
    private Button button_zeikomi;
    @FXML
    private Button button_zeinuki;
    @FXML
    private Button button_ruto;
    @FXML
    private Button button_delite;
    @FXML
    private Button button_puramai;
    @FXML
    private Button button_CE;
    
    // コントローラーの初期化処理
    @FXML
    private void initialize() {
        // 初期化処理をここに記述
    	 assert button_1 != null : "fx:id=\"button_1\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_2 != null : "fx:id=\"button_2\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_3 != null : "fx:id=\"button_3\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_4 != null : "fx:id=\"button_4\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_5 != null : "fx:id=\"button_5\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_6 != null : "fx:id=\"button_6\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_7 != null : "fx:id=\"button_7\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_8 != null : "fx:id=\"button_8\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_9 != null : "fx:id=\"button_9\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_CE != null : "fx:id=\"button_CE\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_clear != null : "fx:id=\"button_clear\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_delite != null : "fx:id=\"button_delite\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_hiku != null : "fx:id=\"button_hiku\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_kakeru != null : "fx:id=\"button_kakeru\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_puramai != null : "fx:id=\"button_puramai\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_ruto != null : "fx:id=\"button_ruto\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_tasu != null : "fx:id=\"button_tasu\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_wa != null : "fx:id=\"button_wa\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_waru != null : "fx:id=\"button_waru\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_zeikomi != null : "fx:id=\"button_zeikomi\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert button_zeinuki != null : "fx:id=\"button_zeinuki\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert displayField != null : "fx:id=\"displayField\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";
         assert symbolField != null : "fx:id=\"symbolField\" was not injected: check your FXML file 'dentaku_gamen.fxml'.";

    }

    // 数字のボタンが押されたときのイベントハンドラメソッド名の最後の数字がボタンの数字を示す
    
    @FXML
    private void handleOneButtonAction0() {
        String digit = "0";
        String currentValueText = displayField.getText();
        
        if (!currentValueText.equals("0")) {
            currentValue = Integer.parseInt(currentValueText + digit);
            displayField.setText(String.valueOf(currentValue));
        }
    }
    
        
     @FXML
      private void handleOneButtonAction00() {
    	 if (isNewCalculation == false) {
   		  displayField.setText("");
   		}
   	  String currentValue = displayField.getText();
     	displayField.setText(currentValue + "00");
     	if (currentValue.equals("0")) {
     		displayField.setText("00");
     		
     		}
     }
            	
     
     
      public void handleOneButtonAction1() {
    	  if (isNewCalculation == false) {
    		  displayField.setText("");
    		}
    	  String currentValue = displayField.getText();
      	displayField.setText(currentValue + "1");
      	if (currentValue.equals("0")) {
      		displayField.setText("1");
      		
      		}
      	
      }
    	

    @FXML
    private void handleOneButtonAction2() {
    	if (isNewCalculation == false) {
  		  displayField.setText("");
  		}
  	  String currentValue = displayField.getText();
    	displayField.setText(currentValue + "2");
    	if (currentValue.equals("0")) {
    		displayField.setText("2");
    		
    		}
    }
    
    @FXML
    private void handleOneButtonAction3() {
    	if (isNewCalculation == false) {
  		  displayField.setText("");
  		}
  	  String currentValue = displayField.getText();
    	displayField.setText(currentValue + "3");
    	if (currentValue.equals("0")) {
    		displayField.setText("3");
    		
    		}
    }
    
    @FXML
    private void handleOneButtonAction4() {
    	if (isNewCalculation == false) {
  		  displayField.setText("");
  		}
  	  String currentValue = displayField.getText();
    	displayField.setText(currentValue + "4");
    	if (currentValue.equals("0")) {
    		displayField.setText("4");
    		
    		}
    }
    
    @FXML
    private void handleOneButtonAction5() {
    	if (isNewCalculation == false) {
  		  displayField.setText("");
  		}
  	  String currentValue = displayField.getText();
    	displayField.setText(currentValue + "5");
    	if (currentValue.equals("0")) {
    		displayField.setText("5");
    		
    		}
    }
    
    
    
    @FXML
    private void handleOneButtonAction6() {
    	if (isNewCalculation == false) {
  		  displayField.setText("");
  		}
  	  String currentValue = displayField.getText();
    	displayField.setText(currentValue + "6");
    	if (currentValue.equals("0")) {
    		displayField.setText("6");
    		
    		}
    }
    
    @FXML
    private void handleOneButtonAction7() {
    	if (isNewCalculation == false) {
  		  displayField.setText("");
  		}
  	  String currentValue = displayField.getText();
    	displayField.setText(currentValue + "7");
    	if (currentValue.equals("0")) {
    		displayField.setText("7");
    		
    		}
    }

    @FXML
    private void handleOneButtonAction8() {
    	if (isNewCalculation == false) {
  		  displayField.setText("");
  		}
  	  String currentValue = displayField.getText();
    	displayField.setText(currentValue + "8");
    	if (currentValue.equals("0")) {
    		displayField.setText("8");
    		
    		}
    }
    @FXML
    private void handleOneButtonAction9() {
    	if (isNewCalculation == false) {
  		  displayField.setText("");
  		}
  	  String currentValue = displayField.getText();
    	displayField.setText(currentValue + "9");
    	if (currentValue.equals("0")) {
    		displayField.setText("9");
    		
    		}
    }
    
   //四則演算の計算
    
   @FXML
    private void handleOneButtonActiontasu() {
	   if(!(displayField.getText()).equals("")){
		   temporaryValue = Integer.parseInt(displayField.getText());
	   }
	   
       operator = "+";
       isNewCalculation = false;
       
       symbolField.setText("+"); // symbolフィールドに"+"を表示
       //シンボルフィールドが＝だったら＋に上書きする
       if (operator.equals("=")) 
       {
    	   operator = "+";
    	   symbolField.setText("+");
       }
       
       
       if (operator.equals("")) 
       {
    	   operator = "+";
    	   symbolField.setText("+");
       }
       
   }
    
    @FXML
    private void handleOneButtonActionhiku() {
    	if(!(displayField.getText()).equals("")){
 		   temporaryValue = Integer.parseInt(displayField.getText());
 	   }
 	   
        operator = "-";
        isNewCalculation = false;
        
        symbolField.setText("-"); // symbolフィールドに"-"を表示
        //シンボルフィールドが＝だったら-に上書きする
        if (operator.equals("=")) 
        {
     	   operator = "-";
     	   symbolField.setText("-");
        }
        
        
        if (operator.equals("")) 
        {
     	   operator = "-";
     	   symbolField.setText("-");
        }
    }
    
    @FXML
    private void handleOneButtonActionkakeru() {
    	if(!(displayField.getText()).equals("")){
 		   temporaryValue = Integer.parseInt(displayField.getText());
 	   }
 	   
        operator = "×";
        isNewCalculation = false;
        
        symbolField.setText("×"); // symbolフィールドに"×"を表示
        //シンボルフィールドが＝だったら×に上書きする
        if (operator.equals("=")) 
        {
     	   operator = "×";
     	   symbolField.setText("×");
        }
        
        
        if (operator.equals("")) 
        {
     	   operator = "×";
     	   symbolField.setText("×");
        }
    }
    
    @FXML
    private void handleOneButtonActionwaru() {
    	if(!(displayField.getText()).equals("")){
 		   temporaryValue = Integer.parseInt(displayField.getText());
 	   }
 	   
        operator = "÷";
        isNewCalculation = false;
        
        symbolField.setText("÷"); // symbolフィールドに"÷"を表示
        //シンボルフィールドが＝だったら÷に上書きする
        if (operator.equals("=")) 
        {
     	   operator = "÷";
     	   symbolField.setText("÷");
        }
        
        
        if (operator.equals("")) 
        {
     	   operator = "÷";
     	   symbolField.setText("÷");
        }
    }
    
    @FXML
    private void handleOneButtonActionwa() {
    	 int newValue = Integer.parseInt(displayField.getText());//displayFieldのテキストを整数値として取得し、newValueに代入

    	    if (operator.equals("+")) {//演算子が "+" の場合、temporaryValueとnewValueを足してcurrentValueに代入
    	        System.out.println("newValue : " + newValue);
    	        System.out.println("temporaryValue : " + temporaryValue);
    	    	currentValue = temporaryValue + newValue;
    	    } else if (operator.equals("-")) {//演算子が "-" の場合、temporaryValueからnewValueを引いてcurrentValueに代入
    	    	System.out.println("newValue : " + newValue);
    	        System.out.println("temporaryValue : " + temporaryValue);
    	        currentValue = temporaryValue - newValue;
    	    } else if (operator.equals("×")) {//演算子が "×" の場合、temporaryValueとnewValueを掛けてcurrentValueに代入
    	    	System.out.println("newValue : " + newValue);
    	        System.out.println("temporaryValue : " + temporaryValue);
    	        currentValue = temporaryValue * newValue;
    	    } else if (operator.equals("÷")) {//演算子が "÷" の場合、newValueが0でない場合に、temporaryValueをnewValueで割ってcurrentValueに代入
    	    	System.out.println("newValue : " + newValue);
    	        System.out.println("temporaryValue : " + temporaryValue);
    	        if (newValue != 0) {
    	            currentValue = temporaryValue / newValue;
    	        } else {
    	            // ゼロでの割り算はエラーとして扱う
    	            // エラーメッセージの表示など適切な処理を行う
    	        }
    	    }

    	    displayField.setText(String.valueOf(currentValue));//displayFieldのテキストをcurrentValueの文字列表現に更新
    	    operator = "";
    	    isNewCalculation = true;//isNewCalculationをtrueに設定
    	    symbolField.setText("="); // symbolフィールドに"+"を表示
    }

    //四則演算以外のボタンのオンアクション
    @FXML
    private void handleOneButtonActionpuramai() {
    	String currentValue = displayField.getText();
        int value = Integer.parseInt(currentValue);

        value = value * (-1);

        displayField.setText(String.valueOf(value));
    }
    
    @FXML
    private void handleOneButtonActionzeikomi() {
    	String currentValue = displayField.getText();
        if (currentValue.equals("0") || currentValue.isEmpty()) {
            return; // 画面が "0" または空の場合は何もせずに処理を終了する
        }
        
        int value = Integer.parseInt(currentValue);
        
        // 税率を設定
        double tax = 0.08; // 8%の税率を仮定

        // 税込み計算
        double totalPrice = value + (value * tax);

        int totalPriceInt = (int) Math.floor(totalPrice); // 結果を整数に変換

        displayField.setText(String.valueOf(totalPriceInt));
    }
    
    @FXML
    private void handleOneButtonActionzeinuki() {
    	String currentValue = displayField.getText();
        if (currentValue.equals("0") || currentValue.isEmpty()) {
            return; // 画面が "0" または空の場合は何もせずに処理を終了する
        }

        int value = Integer.parseInt(currentValue);

        // 税率を設定
        double tax = 0.08; // 8%の税率を仮定

        // 税抜き計算
        double totalPrice = value / (1 + tax);

        int totalPriceInt = (int) Math.floor(totalPrice); // 結果を整数に変換

        displayField.setText(String.valueOf(totalPriceInt));
    }
    @FXML
    private void handleOneButtonActiondelite() {
    	String currentValue = displayField.getText();
        if (!currentValue.isEmpty()) {
            String updatedValue = currentValue.substring(0, currentValue.length() - 1);
            displayField.setText(updatedValue);
        }
    }
    
    @FXML
    private void handleOneButtonActionruto() {
    	String currentValue = displayField.getText();
        if (!currentValue.isEmpty()) {
            double value = Double.parseDouble(currentValue);
            double result = Math.sqrt(value);
            int resultInt = (int) result; // 結果を整数に変換
            displayField.setText(String.valueOf(resultInt));
        }
    }
    
    @FXML
    private void handleOneButtonActionCE() {
    	displayField.setText("");
    }
    
 
    
    
    
    @FXML
    private void handleOneButtonActionsyousuuten() {
    	String currentValue = displayField.getText();
    	displayField.setText(currentValue + ".");
    }
    
    @FXML
    private void handleOneButtonActionclear() {
    	currentValue = 0;
       temporaryValue = 0;
        operator = "";
       isNewCalculation = true;
       displayField.setText("0");
       symbolField.setText(""); 
    }
    
   


   
}