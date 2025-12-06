public class CalcLogic {

    private Integer leftValue = 0;   // 1つ前の値
    private Integer rightValue = 0;  // = を押した時の値
    private String operator = "";   // ＋ − × ÷
    private boolean isNewInput = true; // 入力リセット判定

    private String display = "0";   // 表示文字列

    public String getDisplay() {
        return display;
    }

    // 数字ボタンが押された時
    public void inputNumber(String num) {

        System.out.println("---- inputNumber() ----");
        System.out.println("押された数字: " + num);
        System.out.println("入力前 display = " + display);

        if (isNewInput) {
            display = num;
            isNewInput = false;
        } else {
            if (display.equals("0")) {
                display = num;
            } else {
                display += num;
            }
        }

        System.out.println("入力後 display = " + display);
    }

    // 演算子が押された時
    public void setOperator(String op) {

        System.out.println("---- setOperator() ----");
        System.out.println("押された演算子: " + op);
        System.out.println("演算前 display = " + display);

        leftValue = Integer.parseInt(display);
        operator = op;
        isNewInput = true;

        System.out.println("leftValue = " + leftValue);
        System.out.println("operator = " + operator);
        System.out.println("isNewInput = " + isNewInput);
    }

    // イコールが押された時
    public void calculate() {

        System.out.println("---- calculate() ----");
        System.out.println("計算開始時 display = " + display);

        rightValue = Integer.parseInt(display);

        System.out.println("leftValue = " + leftValue);
        System.out.println("rightValue = " + rightValue);
        System.out.println("operator = " + operator);

        switch (operator) {
            case "+":
                display = String.valueOf(leftValue + rightValue);
                break;
            case "-":
                display = String.valueOf(leftValue - rightValue);
                break;
            case "×":
                display = String.valueOf(leftValue * rightValue);
                break;
            case "÷":
                if (rightValue != 0) {
                    display = String.valueOf(leftValue / rightValue);
                } else {
                    display = "0のため計算無Error";
                }
                break;
            default:
                System.out.println("演算子なし。処理終了。");
                return;
        }

        System.out.println("計算結果 display = " + display);

        operator = "";
        isNewInput = true;

        System.out.println("operator リセット = " + operator);
        System.out.println("isNewInput = " + isNewInput);
    }

    // AC
    public void clear() {

        System.out.println("---- clear() ----");
        System.out.println("クリア前 display = " + display);

        leftValue = 0;
        rightValue = 0;
        operator = "";
        display = "0";
        isNewInput = true;

        System.out.println("クリア後 display = " + display);
    }

    // 削除（1文字消す）
    public void deleteOne() {

        System.out.println("---- deleteOne() ----");
        System.out.println("削除前 display = " + display);

        if (display.length() > 1) {
            display = display.substring(0, display.length() - 1);
        } else {
            display = "0";
        }

        System.out.println("削除後 display = " + display);
    }

    // ±ボタン
    public void togglePlusMinus() {

        System.out.println("---- togglePlusMinus() ----");
        System.out.println("変更前 display = " + display);

        Integer value = Integer.parseInt(display);
        value *= -1;
        display = String.valueOf(value);

        System.out.println("変更後 display = " + display);
    }

    // 税込み（8%）
    public void calcTaxIncluded() {

        System.out.println("---- calcTaxIncluded() ----");
        System.out.println("処理前 display = " + display);

        double v = Double.parseDouble(display);
        v = v * 1.08; // 税込み

        display = String.valueOf((int) Math.floor(v));

        System.out.println("処理後 display = " + display);
    }

    // 税抜き
    public void priceWithoutTax() {

        System.out.println("---- priceWithoutTax() ----");
        System.out.println("処理前 display = " + display);

        double v = Double.parseDouble(display);
        v = v / 1.08;

        display = String.valueOf((int) Math.floor(v));

        System.out.println("処理後 display = " + display);
    }

    // √
    public void calcSqrt() {

        System.out.println("---- calcSqrt() ----");
        System.out.println("処理前 display = " + display);

        double v = Double.parseDouble(display);
        v = Math.sqrt(v);

        display = String.valueOf(v);

        System.out.println("処理後 display = " + display);
    }
}
