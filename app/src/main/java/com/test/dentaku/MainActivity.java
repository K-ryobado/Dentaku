package com.test.dentaku;

import android.app.Activity;
import android.app.Application;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.regex.Pattern;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static java.lang.String.valueOf;

public class MainActivity extends Activity {
    private AdView mAdView;
    private AdView mAdView2;

    private InterstitialAd mInterstitialAd;//インタースティシャル

    TextView tv1;
    TextView eT1;
    Button button;
    Button button_puma;
    Button button_dot;
    int n;
    int count_AdView;
    int count_history;
    int oncreate;
    char str;
    char str2;
    String string;
    boolean bool;

    final String add = "+";
    final String subtract = "－";
    final String multiply = "×";
    final String divide = "÷";

    int layout_id;
    RelativeLayout relative;
    ConstraintLayout history;
    ImageButton button_close;
    ImageButton button_history;
    ImageButton backspace;
    Button history_clear;

    TextView tv_history_tv1_0;
    TextView tv_history_tv1_1;
    TextView tv_history_tv1_2;
    TextView tv_history_tv1_3;
    TextView tv_history_tv1_4;
    TextView tv_history_tv1_5;
    TextView tv_history_tv1_6;
    TextView tv_history_tv1_7;
    TextView tv_history_tv1_8;
    TextView tv_history_tv1_9;
    TextView tv_history_tv1_10;
    TextView tv_history_tv1_11;
    TextView tv_history_tv1_12;
    TextView tv_history_tv1_13;
    TextView tv_history_tv1_14;
    TextView tv_history_tv1_15;
    TextView tv_history_tv1_16;
    TextView tv_history_tv1_17;
    TextView tv_history_tv1_18;
    TextView tv_history_tv1_19;

    TextView tv_history_eT1_0;
    TextView tv_history_eT1_1;
    TextView tv_history_eT1_2;
    TextView tv_history_eT1_3;
    TextView tv_history_eT1_4;
    TextView tv_history_eT1_5;
    TextView tv_history_eT1_6;
    TextView tv_history_eT1_7;
    TextView tv_history_eT1_8;
    TextView tv_history_eT1_9;
    TextView tv_history_eT1_10;
    TextView tv_history_eT1_11;
    TextView tv_history_eT1_12;
    TextView tv_history_eT1_13;
    TextView tv_history_eT1_14;
    TextView tv_history_eT1_15;
    TextView tv_history_eT1_16;
    TextView tv_history_eT1_17;
    TextView tv_history_eT1_18;
    TextView tv_history_eT1_19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //広告の表示
        // AdMob app ID: ca-app-pub-3891518799622736~8952869943 Sample AdMob app ID:ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-3891518799622736~8952869943");

        //インタースティシャル
        //sample ID:ca-app-pub-3940256099942544/1033173712  Real ID:ca-app-pub-3891518799622736/2675857664
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3891518799622736/2675857664");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

        mAdView = findViewById(R.id.adView);
        mAdView2 = findViewById(R.id.adView2);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest);

        /*縦画面固定*/
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        relative = findViewById(R.id.relative);
        history = findViewById(R.id.history);//履歴表示のレイアウト
        tv_history_tv1_0 = findViewById(R.id.tv_history_tv1_0);//履歴表示のテキストビュー
        tv_history_tv1_1 = findViewById(R.id.tv_history_tv1_1);//履歴表示のテキストビュー
        tv_history_tv1_2 = findViewById(R.id.tv_history_tv1_2);//履歴表示のテキストビュー
        tv_history_tv1_3 = findViewById(R.id.tv_history_tv1_3);//履歴表示のテキストビュー
        tv_history_tv1_4 = findViewById(R.id.tv_history_tv1_4);//履歴表示のテキストビュー
        tv_history_tv1_5 = findViewById(R.id.tv_history_tv1_5);//履歴表示のテキストビュー
        tv_history_tv1_6 = findViewById(R.id.tv_history_tv1_6);//履歴表示のテキストビュー
        tv_history_tv1_7 = findViewById(R.id.tv_history_tv1_7);//履歴表示のテキストビュー
        tv_history_tv1_8 = findViewById(R.id.tv_history_tv1_8);//履歴表示のテキストビュー
        tv_history_tv1_9 = findViewById(R.id.tv_history_tv1_9);//履歴表示のテキストビュー
        tv_history_tv1_10 = findViewById(R.id.tv_history_tv1_10);//履歴表示のテキストビュー
        tv_history_tv1_11 = findViewById(R.id.tv_history_tv1_11);//履歴表示のテキストビュー
        tv_history_tv1_12 = findViewById(R.id.tv_history_tv1_12);//履歴表示のテキストビュー
        tv_history_tv1_13 = findViewById(R.id.tv_history_tv1_13);//履歴表示のテキストビュー
        tv_history_tv1_14 = findViewById(R.id.tv_history_tv1_14);//履歴表示のテキストビュー
        tv_history_tv1_15 = findViewById(R.id.tv_history_tv1_15);//履歴表示のテキストビュー
        tv_history_tv1_16 = findViewById(R.id.tv_history_tv1_16);//履歴表示のテキストビュー
        tv_history_tv1_17 = findViewById(R.id.tv_history_tv1_17);//履歴表示のテキストビュー
        tv_history_tv1_18 = findViewById(R.id.tv_history_tv1_18);//履歴表示のテキストビュー
        tv_history_tv1_19 = findViewById(R.id.tv_history_tv1_19);//履歴表示のテキストビュー

        tv_history_eT1_0 = findViewById(R.id.tv_history_eT1_0);//履歴表示のテキストビュー
        tv_history_eT1_1 = findViewById(R.id.tv_history_eT1_1);//履歴表示のテキストビュー
        tv_history_eT1_2 = findViewById(R.id.tv_history_eT1_2);//履歴表示のテキストビュー
        tv_history_eT1_3 = findViewById(R.id.tv_history_eT1_3);//履歴表示のテキストビュー
        tv_history_eT1_4 = findViewById(R.id.tv_history_eT1_4);//履歴表示のテキストビュー
        tv_history_eT1_5 = findViewById(R.id.tv_history_eT1_5);//履歴表示のテキストビュー
        tv_history_eT1_6 = findViewById(R.id.tv_history_eT1_6);//履歴表示のテキストビュー
        tv_history_eT1_7 = findViewById(R.id.tv_history_eT1_7);//履歴表示のテキストビュー
        tv_history_eT1_8 = findViewById(R.id.tv_history_eT1_8);//履歴表示のテキストビュー
        tv_history_eT1_9 = findViewById(R.id.tv_history_eT1_9);//履歴表示のテキストビュー
        tv_history_eT1_10 = findViewById(R.id.tv_history_eT1_10);//履歴表示のテキストビュー
        tv_history_eT1_11 = findViewById(R.id.tv_history_eT1_11);//履歴表示のテキストビュー
        tv_history_eT1_12 = findViewById(R.id.tv_history_eT1_12);//履歴表示のテキストビュー
        tv_history_eT1_13 = findViewById(R.id.tv_history_eT1_13);//履歴表示のテキストビュー
        tv_history_eT1_14 = findViewById(R.id.tv_history_eT1_14);//履歴表示のテキストビュー
        tv_history_eT1_15 = findViewById(R.id.tv_history_eT1_15);//履歴表示のテキストビュー
        tv_history_eT1_16 = findViewById(R.id.tv_history_eT1_16);//履歴表示のテキストビュー
        tv_history_eT1_17 = findViewById(R.id.tv_history_eT1_17);//履歴表示のテキストビュー
        tv_history_eT1_18 = findViewById(R.id.tv_history_eT1_18);//履歴表示のテキストビュー
        tv_history_eT1_19 = findViewById(R.id.tv_history_eT1_19);//履歴表示のテキストビュー

        tv1 = findViewById(R.id.tv1);
        eT1 = findViewById(R.id.eT1);
        button = findViewById(R.id.button_AC);
        button_puma = findViewById(R.id.button_puma);
        button_dot = findViewById(R.id.button_dot);

        button_close = findViewById(R.id.button_close);
        button_history = findViewById(R.id.button_history);
        backspace = findViewById(R.id.backspace);
        history_clear = findViewById(R.id.history_clear);

        findViewById(R.id.button_1).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_2).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_3).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_4).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_5).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_6).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_7).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_8).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_9).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_0).setOnClickListener(buttonNumberListener);
        findViewById(R.id.button_00).setOnClickListener(buttonNumberListener);


        findViewById(R.id.button_add).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.button_subtract).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.button_multiply).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.button_divide).setOnClickListener(buttonOperatorListener);
        findViewById(R.id.button_equal).setOnClickListener(buttonOperatorListener);

        history.setVisibility(View.INVISIBLE);//非表示

        //closeボタンのクリック回数
        count_AdView = 0;

        oncreate = 1;
    }

    /* onWindowFocusChanged() はフォーカスが変わった時に呼ばれるので
        onResume() の後に呼ばれることになります */
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        if (oncreate == 1) {
            layout_id = relative.getId();
            setTextSizeByInch(layout_id);
            oncreate = 2;
        }
    }

    boolean recentOperator; // 最近押されたキーが"="ならtrue
    int nowOperator; // 今押された計算キー
    boolean isOperatorKeyPushed;    // 最近押されたキーが計算キーならtrue

    double value;// 計算用数値1
    double value2;// 計算用数値2

    int index, index2, index3, index4;

    View.OnClickListener buttonNumberListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            /*******************************例外処理*****************************************/
            try {
                Button button = (Button) view;
                nowOperator = button.getId();

                if (isOperatorKeyPushed == true) {//最近押されたキーが数字じゃなかったら

                    eT1.setText(button.getText());
                } else {
                    //tv1が20桁以内なら
                    if (tv1.getText().toString().length() < 20) {

                        //eT1の後ろに文字を追加
                        eT1.append(button.getText());
                        n = (eT1.getText().toString()).length();

                        //eT1の最初の0を削除
                        if (n == 2) {
                            //eT1の1文字目をchar型で取り出す
                            str = (eT1.getText().toString()).charAt(0);
                            str2 = (eT1.getText().toString()).charAt(1);

                            if (str == '0' && str2 != '.') {
                                eT1.setText(valueOf(str2));
                            }
                        }

                        //"-"の後の"0"を消す
                        if (eT1.getText().toString().contains("-")) {
                            int n = eT1.getText().toString().length();
                            if (n == 3) {
                                //eT1の1文字目をchar型で取り出す
                                str = (eT1.getText().toString()).charAt(1);
                                str2 = (eT1.getText().toString()).charAt(2);

                                if (str == '0' && str2 != '.') {
                                    eT1.setText("-" + valueOf(str2));
                                }
                            }
                        }
                    }
                }

                //tv1の計算過程表示
                if (recentOperator == true) {//最近押されたキーが"="だったら
                    tv1.setText(eT1.getText().toString());
                }

                String string_base = tv1.getText().toString();

                //tv1に計算キーが含まれていたら
                if (string_base.contains(add) ||
                        string_base.contains(subtract) ||
                        string_base.contains(multiply) ||
                        string_base.contains(divide)) {
                    StringBuilder sb = new StringBuilder(string_base);
                    int[] arr = new int[]{sb.lastIndexOf(add), sb.lastIndexOf(subtract), sb.lastIndexOf(multiply), sb.lastIndexOf(divide)};
                    int max = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        int v = arr[i];
                        if (v > max) {
                            max = v;
                        }
                    }
                    sb.delete(max + 1, sb.length());
                    tv1.setText(sb.insert(max + 1, eT1.getText().toString()));
                } else {//tv1に計算キーが含まれていなかったら
                    tv1.setText(eT1.getText().toString());
                }

                isOperatorKeyPushed = false;//最近押されたキーが記号であることを示す
                recentOperator = false;//最近されたキーが"="ではないことを示す

            } catch (Exception e) { //全ての例外に対応
                // TextView に error と表示する
                eT1.setText("error");

                button_invisible();  //ボタンをクリック不可
            }
            /******************************例外処理******************************/
        }

    };

    View.OnClickListener buttonOperatorListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            /*******************************例外処理************************************************************/
            try {
                Button operatorButton = (Button) view;
                nowOperator = operatorButton.getId();

                /*****************************計算記号の入力処理********************************************/
                if (recentOperator == true) {//最近押されたキーが"="だったら
                    if (nowOperator != R.id.button_equal) {
                        tv1.setText(eT1.getText().toString());
                    }
                }

                String str5 = tv1.getText().toString();//tv1の取り出し
                char chr = str5.charAt(str5.length() - 1);//str5の末尾の取り出し
                str5 = String.valueOf(chr);//str5をstring変換
                if (Pattern.matches("[0-9]", str5) || str5.equals(".")) {//str5が数字or"."だったら
                    if (str5.equals(".")) {//str5が"."だったら
                        tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));//末尾の削除
                    }
                    tv1.append(operatorButton.getText());

                } else {
                    str5 = tv1.getText().toString();//tv1の取り出し
                    chr = str5.charAt(str5.length() - 1);//str5の末尾の取り出し
                    if (chr != '.') {
                        int recentOperator2 = operatorButton.getId();
                        switch (recentOperator2) {
                            case R.id.button_add:
                                str5 = str5.substring(0, str5.length() - 1);//末尾の削除
                                tv1.setText(str5 + add);
                                break;
                            case R.id.button_subtract:
                                str5 = str5.substring(0, str5.length() - 1);//末尾の削除
                                tv1.setText(str5 + subtract);
                                break;
                            case R.id.button_multiply:
                                str5 = str5.substring(0, str5.length() - 1);//末尾の削除
                                tv1.setText(str5 + multiply);
                                break;
                            case R.id.button_divide:
                                str5 = str5.substring(0, str5.length() - 1);//末尾の削除
                                tv1.setText(str5 + divide);
                                break;
                            case R.id.button_equal:
                                str5 = str5.substring(0, str5.length() - 1);//末尾の削除
                                tv1.setText(str5 + "=");

                                break;
                        }
                    }
                }
                /*****************************計算記号の入力処理********************************/


                /****************************計算処理*****************************************************/

                if (nowOperator == R.id.button_equal) {//

                    String string_base = tv1.getText().toString();
                    if (string_base.charAt(string_base.length() - 1) == '=') {
                        string_base = string_base.substring(0, string_base.length() - 1);//末尾の削除
                    }

                    if (string_base.contains(add) ||
                            string_base.contains(subtract) ||
                            string_base.contains(multiply) ||
                            string_base.contains(divide)) {

                        StringBuilder sb = new StringBuilder(string_base);

                        char ch = string_base.charAt(string_base.length() - 1);//str5の末尾の取り出し
                        String str6 = String.valueOf(ch);//str6をstring変換
                        if (!(Pattern.matches("^-?[0-9]+$", str6))) {//str6が数字じゃなかったら
                            string_base = string_base.substring(0, string_base.length() - 1);//末尾の削除
                            tv1.setText(string_base);
                        }

                        /********             ×、÷の処理               *********/
                        while (sb.toString().contains(multiply) || sb.toString().contains(divide)) {//✕or÷が含まれている限り繰り返す
                            String[] string_array = {multiply, divide};

                            for (int iii = 0; iii < string_array.length; iii++) {
                                if (sb.indexOf(string_array[iii]) != -1) {//"✕"or"÷"の位置を取得
                                    index = sb.indexOf(string_array[iii]);
                                    if (index < index2 || index2 == 0) {//"✕"or"÷"の早いほうの位置を取得
                                        index2 = index;
                                    }
                                }
                            }
                            for (int iii = index2; iii > 0; ) {
                                iii--;
                                if (sb.charAt(iii) == (multiply).charAt(0)
                                        || sb.charAt(iii) == (divide).charAt(0)
                                        || sb.charAt(iii) == (add).charAt(0)
                                        || sb.charAt(iii) == (subtract).charAt(0)) {
                                    index3 = iii + 1;
                                    value = Double.valueOf(sb.substring(index3, index2));
                                    break;
                                } else if (iii == 0) {
                                    index3 = 0;
                                    value = Double.valueOf(sb.substring(index3, index2));
                                }
                            }

                            for (int iii = index2; iii < sb.length() - 1; ) {
                                iii++;
                                if (sb.charAt(iii) == (multiply).charAt(0)
                                        || sb.charAt(iii) == (divide).charAt(0)
                                        || sb.charAt(iii) == (add).charAt(0)
                                        || sb.charAt(iii) == (subtract).charAt(0)) {
                                    index4 = iii;
                                    value2 = Double.valueOf(sb.substring(index2 + 1, index4));
                                    break;
                                } else if (iii == sb.toString().length() - 1) {
                                    index4 = sb.length();
                                    value2 = Double.valueOf(sb.substring(index2 + 1, index4));
                                }
                            }
                            value2 = Double.valueOf(sb.substring(index2 + 1, index4));

                            switch (sb.charAt(index2)) {
                                case '×':
                                    sb.delete(index3, index4);
                                    sb.insert(index3, period_delete(String.valueOf(value * value2)));
                                    break;
                                case '÷':
                                    sb.delete(index3, index4);
                                    sb.insert(index3, period_delete(String.valueOf(value / value2)));
                                    break;
                            }
                            index = 0;
                            index2 = 0;
                            index3 = 0;
                            index4 = 0;
                            value = 0;
                            value2 = 0;
                        }
                        /********             ×、÷の処理               *********/

                        index = 0;
                        index2 = 0;
                        index3 = 0;
                        index4 = 0;
                        value = 0;
                        value2 = 0;


                        /********             +、-の処理               *********/

                        while (sb.toString().contains(add) || sb.toString().contains(subtract)) {//＋or―が含まれている限り繰り返す
                            String[] string_array = {add, subtract};

                            for (int iii = 0; iii < string_array.length; iii++) {
                                if (sb.indexOf(string_array[iii]) != -1) {//"＋"or"―"の位置を取得
                                    index = sb.indexOf(string_array[iii]);
                                    if (index < index2 || index2 == 0) {//"＋"or"―"の左側の位置を取得
                                        index2 = index;
                                    }
                                }
                            }
                            for (int iii = index2; iii > 0; ) {
                                iii--;
                                if (sb.charAt(iii) == (multiply).charAt(0)
                                        || sb.charAt(iii) == (divide).charAt(0)
                                        || sb.charAt(iii) == (add).charAt(0)
                                        || sb.charAt(iii) == (subtract).charAt(0)) {
                                    index3 = iii + 1;
                                    value = Double.valueOf(sb.substring(index3, index2));
                                    break;
                                } else if (iii == 0) {
                                    index3 = 0;
                                    value = Double.valueOf(sb.substring(0, index2));
                                }
                            }


                            for (int iii = index2; iii < sb.length() - 1; ) {
                                iii++;
                                if (sb.charAt(iii) == (multiply).charAt(0)
                                        || sb.charAt(iii) == (divide).charAt(0)
                                        || sb.charAt(iii) == (add).charAt(0)
                                        || sb.charAt(iii) == (subtract).charAt(0)) {
                                    index4 = iii;
                                    value2 = Double.valueOf(sb.substring(index2 + 1, index4));
                                    break;
                                } else if (iii == sb.toString().length() - 1) {
                                    index4 = sb.length();
                                    value2 = Double.valueOf(sb.substring(index2 + 1, index4));
                                }
                            }

                            switch (sb.charAt(index2)) {
                                case '+':
                                    sb.delete(index3, index4);
                                    sb.insert(index3, period_delete(String.valueOf(value + value2)));
                                    break;
                                case '－':
                                    sb.delete(index3, index4);
                                    sb.insert(index3, period_delete(String.valueOf(value - value2)));
                                    break;
                            }

                            index = 0;
                            index2 = 0;
                            index3 = 0;
                            index4 = 0;
                            value = 0;
                            value2 = 0;
                        }
                        /********             +、-の処理               *********/

                        eT1.setText(sb.toString());
                    }
                    index = 0;
                    index2 = 0;
                    index3 = 0;
                    index4 = 0;
                    value = 0;
                    value2 = 0;
                    /****************************計算処理*****************************************************/

                    /****************************計算履歴の表示***************************************/
                    if (recentOperator == false) {//最近されたキーが"="ではないことを示す
                        StringBuilder sb_tv1 = new StringBuilder(tv1.getText().toString());
                        StringBuilder sb_et1 = new StringBuilder(eT1.getText().toString());

                        if (!(sb_tv1.toString().contains("="))) {
                            sb_tv1.append("=");
                        }

                        /****************************カンマ表示***************/
                        NumberFormat nfNum = NumberFormat.getNumberInstance();
                        String priceStr = nfNum.format(Double.parseDouble(sb_et1.toString()));
                        sb_et1.delete(0, sb_et1.length());
                        sb_et1.append(priceStr);

                        /****************************カンマ表示*****************/

                        switch (count_history) {
                            case 0:
                                tv_history_tv1_0.setText(sb_tv1);
                                tv_history_eT1_0.setText(sb_et1);
                                break;
                            case 1:
                                tv_history_tv1_1.setText(sb_tv1);
                                tv_history_eT1_1.setText(sb_et1);
                                break;
                            case 2:
                                tv_history_tv1_2.setText(sb_tv1);
                                tv_history_eT1_2.setText(sb_et1);
                                break;
                            case 3:
                                tv_history_tv1_3.setText(sb_tv1);
                                tv_history_eT1_3.setText(sb_et1);
                                break;
                            case 4:
                                tv_history_tv1_4.setText(sb_tv1);
                                tv_history_eT1_4.setText(sb_et1);
                                break;
                            case 5:
                                tv_history_tv1_5.setText(sb_tv1);
                                tv_history_eT1_5.setText(sb_et1);
                                break;
                            case 6:
                                tv_history_tv1_6.setText(sb_tv1);
                                tv_history_eT1_6.setText(sb_et1);
                                break;
                            case 7:
                                tv_history_tv1_7.setText(sb_tv1);
                                tv_history_eT1_7.setText(sb_et1);
                                break;
                            case 8:
                                tv_history_tv1_8.setText(sb_tv1);
                                tv_history_eT1_8.setText(sb_et1);
                                break;
                            case 9:
                                tv_history_tv1_9.setText(sb_tv1);
                                tv_history_eT1_9.setText(sb_et1);
                                break;
                            case 10:
                                tv_history_tv1_10.setText(sb_tv1);
                                tv_history_eT1_10.setText(sb_et1);
                                break;
                            case 11:
                                tv_history_tv1_11.setText(sb_tv1);
                                tv_history_eT1_11.setText(sb_et1);
                                break;
                            case 12:
                                tv_history_tv1_12.setText(sb_tv1);
                                tv_history_eT1_12.setText(sb_et1);
                                break;
                            case 13:
                                tv_history_tv1_13.setText(sb_tv1);
                                tv_history_eT1_13.setText(sb_et1);
                                break;
                            case 14:
                                tv_history_tv1_14.setText(sb_tv1);
                                tv_history_eT1_14.setText(sb_et1);
                                break;
                            case 15:
                                tv_history_tv1_15.setText(sb_tv1);
                                tv_history_eT1_15.setText(sb_et1);
                                break;
                            case 16:
                                tv_history_tv1_16.setText(sb_tv1);
                                tv_history_eT1_16.setText(sb_et1);
                                break;
                            case 17:
                                tv_history_tv1_17.setText(sb_tv1);
                                tv_history_eT1_17.setText(sb_et1);
                                break;
                            case 18:
                                tv_history_tv1_18.setText(sb_tv1);
                                tv_history_eT1_18.setText(sb_et1);
                                break;
                            case 19:
                                tv_history_tv1_19.setText(sb_tv1);
                                tv_history_eT1_19.setText(sb_et1);
                                break;
                        }
                        if (count_history < 19) {
                            count_history++;
                        }
                    } else {
                        recentOperator = false;     //最近入力されたキーが"="ではないことを示す
                    }

                    /************************計算履歴の表示*************************************/

                    recentOperator = true;//最近押されたキーが"="であることを記憶
                }
                isOperatorKeyPushed = true;//最近押されたキーがk計算キーであることを記憶
            } catch (Exception e) { //全ての例外に対応
                // TextView に error と表示する
                eT1.setText("error");

                button_invisible();  //ボタンをクリック不可
            }
            /******************************例外処理*************************************************************/
        }
    };

    /****************".0"を削除するメソッド**************************************/
    public String period_delete(String string_base) {
        if (string_base.contains(".")) { //"."を含むかどうか
            n = (string_base.indexOf("."));//"."の位置を知る
            string = string_base.substring(n + 1);//"."から右の最終まで切り出す
            n = string.length();//"."から右の桁数を取得
            for (int a = 0; a < n; a++) {//"."から右の文字を一文字ずつ"0"かどうか確認
                str = string.charAt(a);
                if (str == '0') {
                    bool = true;
                } else {
                    bool = false;
                    break;
                }
            }
            if (bool == true) {
                n = string_base.indexOf(".");//"."の位置を知る
                string_base = string_base.substring(0, n);//"."から左に最終まで取得
            }
        }
        return string_base;
    }

    /****************".0"を削除するメソッド**************************************/

    public void clear(View view) {
        recentOperator = false;//最近押されたキーが"="ではないことを示す
        isOperatorKeyPushed = false;//最近押されたキーが計算キーではないことを示す

        tv1.setText("0");
        eT1.setText("0");

    }

    public void onclick_history_clear(View v) {
        tv_history_tv1_0.setText("");
        tv_history_tv1_1.setText("");
        tv_history_tv1_2.setText("");
        tv_history_tv1_3.setText("");
        tv_history_tv1_4.setText("");
        tv_history_tv1_5.setText("");
        tv_history_tv1_6.setText("");
        tv_history_tv1_7.setText("");
        tv_history_tv1_8.setText("");
        tv_history_tv1_9.setText("");
        tv_history_tv1_10.setText("");
        tv_history_tv1_11.setText("");
        tv_history_tv1_12.setText("");
        tv_history_tv1_13.setText("");
        tv_history_tv1_14.setText("");
        tv_history_tv1_15.setText("");
        tv_history_tv1_16.setText("");
        tv_history_tv1_17.setText("");
        tv_history_tv1_18.setText("");
        tv_history_tv1_19.setText("");

        tv_history_eT1_0.setText("");
        tv_history_eT1_1.setText("");
        tv_history_eT1_2.setText("");
        tv_history_eT1_3.setText("");
        tv_history_eT1_4.setText("");
        tv_history_eT1_5.setText("");
        tv_history_eT1_6.setText("");
        tv_history_eT1_7.setText("");
        tv_history_eT1_8.setText("");
        tv_history_eT1_9.setText("");
        tv_history_eT1_10.setText("");
        tv_history_eT1_11.setText("");
        tv_history_eT1_12.setText("");
        tv_history_eT1_13.setText("");
        tv_history_eT1_14.setText("");
        tv_history_eT1_15.setText("");
        tv_history_eT1_16.setText("");
        tv_history_eT1_17.setText("");
        tv_history_eT1_18.setText("");
        tv_history_eT1_19.setText("");

        count_history = 0;

        button_visible();  //ボタンをクリック可
    }

    public void dot(View v) {
        /******************************例外処理******************************/
        try {
            //eT1が数字なら実行
            if (Pattern.matches("^-?[0-9]*.?[0-9]+$", (eT1.getText().toString()))) {
                if (recentOperator == true) {//最近入力されたキーが"="だったら
                    tv1.setText("0");
                    eT1.setText("0");
                }
                if (isOperatorKeyPushed == true && recentOperator == false) {//最近入力されたキーが"="以外の計算キーだったら
                    tv1.append("0");
                    eT1.setText("0");
                }

                //eT1の後ろに文字を追加
                if (((eT1.getText().toString()).contains(".")) == false) {//eT1が"."を含まなければ
                    eT1.append(".");
                    tv1.append(".");
                }
                recentOperator = false;//最近されたキーが"="ではないことを示す
                isOperatorKeyPushed = false;//最近押されたキーが記号であることを示す
            }
        } catch (Exception e) { //全ての例外に対応
            // TextView に error と表示する
            eT1.setText("error");

            button_invisible();  //ボタンをクリック不可
        }
        /******************************例外処理******************************/
    }


    public void puma(View v) {  /*****完成*****/
        /******************************例外処理******************************/
        try {
            if (recentOperator == true) {//最近押されたキーが"="だったら
                tv1.setText(eT1.getText().toString());
            }
            //tv1末尾が計算キーなら実行
            if (isOperatorKeyPushed == true && recentOperator == false) {//最近入力されたキーが"="以外の計算キーだったら
                tv1.append("0");
                eT1.setText("0");
            }

            //eT1の処理
            String value = eT1.getText().toString();
            //±の切り替え
            if (value.length() > 3) {
                if (value.substring(0, value.length() - 2).contains("-")) {
                    eT1.setText(value.replaceFirst("-", ""));
                } else {
                    //eT1が数字じゃない時の処理
                    eT1.setText("-" + value);
                }
            } else {
                if (value.contains("-")) {
                    eT1.setText(value.replaceFirst("-", ""));
                } else {
                    //eT1が数字じゃない時の処理
                    eT1.setText("-" + value);
                }
            }

            //tv1に計算キーが含まれていたら
            String string_base = tv1.getText().toString();

            if (string_base.contains(add) ||
                    string_base.contains(subtract) ||
                    string_base.contains(multiply) ||
                    string_base.contains(divide)) {
                StringBuilder sb = new StringBuilder(string_base);
                int[] arr = new int[]{sb.lastIndexOf(add), sb.lastIndexOf(subtract), sb.lastIndexOf(multiply), sb.lastIndexOf(divide)};
                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    int t = arr[i];
                    if (t > max) {
                        max = t;
                    }
                }
                sb.delete(max + 1, sb.length());
                tv1.setText(sb.insert(max + 1, eT1.getText().toString()));
            } else {//tv1に計算キーが含まれていなかったら
                tv1.setText(eT1.getText().toString());
            }

            recentOperator = false;//最近されたキーが"="ではないことを示す
            isOperatorKeyPushed = false;//最近押されたキーが記号であることを示す

        } catch (Exception e) { //全ての例外に対応
            // TextView に error と表示する
            eT1.setText("error");

            button_invisible();  //ボタンをクリック不可
        }
        /******************************例外処理******************************/

    }


    public void pa_sent(View v) {
        /******************************例外処理******************************/
        try {
            /* 計算処理*************************************************/
            //最近押されたキーが"="だったら
            if (recentOperator == true) {
                tv1.setText(eT1.getText().toString());
            }
            //tv1末尾が計算キーなら実行
            if (isOperatorKeyPushed == true && recentOperator == false) {//最近入力されたキーが"="以外の計算キーだったら
                tv1.append("0");
                eT1.setText("0");
            }

            //eT1の処理
            double value = Double.parseDouble(eT1.getText().toString());
            double ans = value / 100;
            eT1.setText(valueOf(ans));

            //".0"を削除
            string = (eT1.getText().toString()).substring((eT1.getText().toString()).length() - 2);
            if (string.equals(".0")) {
                eT1.setText((eT1.getText().toString()).replace(".0", ""));
            }

            //tv1に計算キーが含まれていたら
            String string_base = tv1.getText().toString();

            if (string_base.contains(add) ||
                    string_base.contains(subtract) ||
                    string_base.contains(multiply) ||
                    string_base.contains(divide)) {
                StringBuilder sb = new StringBuilder(string_base);
                int[] arr = new int[]{sb.lastIndexOf(add), sb.lastIndexOf(subtract), sb.lastIndexOf(multiply), sb.lastIndexOf(divide)};
                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    int t = arr[i];
                    if (t > max) {
                        max = t;
                    }
                }
                sb.delete(max + 1, sb.length());
                tv1.setText(sb.insert(max + 1, eT1.getText().toString()));
            } else {//tv1に計算キーが含まれていなかったら
                tv1.setText(eT1.getText().toString());
            }

            recentOperator = false;//最近されたキーが"="ではないことを示す
            isOperatorKeyPushed = false;//最近押されたキーが記号であることを示す
            /* 計算処理*************************************************/

        } catch (Exception e) { //全ての例外に対応
            // TextView に error と表示する
            eT1.setText("error");

            button_invisible();  //ボタンをクリック不可
        }
        /******************************例外処理******************************/
    }

    public void onclick_history(View v) {
        history.setVisibility(View.VISIBLE);//表示
        button_invisible();  //ボタンをクリック不可
    }

    public void onclick_close(View view) {
        history.setVisibility(View.INVISIBLE);//非表示

        //インタースティシャル広告の表示
        count_AdView++;

        if (count_AdView % 5 == 0) {    //5回に1回表示
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
        button_visible();
    }

    public void onclick_backspace(View v) {
        StringBuilder stringBuilder = new StringBuilder(tv1.getText().toString());
        StringBuilder sb = new StringBuilder(eT1.getText().toString());
        if (!(stringBuilder.toString().equals("0"))) {
            if (((stringBuilder.charAt(stringBuilder.length() - 1) != '+') &&
                    (stringBuilder.charAt(stringBuilder.length() - 1) != '－') &&
                    (stringBuilder.charAt(stringBuilder.length() - 1) != '÷') &&
                    (stringBuilder.charAt(stringBuilder.length() - 1) != '×') &&
                    (stringBuilder.charAt(stringBuilder.length() - 1) != '='))) {

                //eT1の処理
                if ((sb.length() == 1) ||
                        (sb.length() == 2) && (sb.toString().contains("-"))) {
                    eT1.setText("0");
                } else {
                    eT1.setText(sb.substring(0, sb.length() - 1));
                }

                //tv1の処理
                if ((stringBuilder.length() == 1) ||
                        (stringBuilder.length() == 2) && (stringBuilder.toString().contains("-"))) {
                    tv1.setText("0");
                } else {
                    if ((sb.length() == 2) && (sb.toString().contains("-"))) {
                        tv1.setText(stringBuilder.substring(0, stringBuilder.length() - 2));
                    } else {
                        tv1.setText(stringBuilder.substring(0, stringBuilder.length() - 1));
                    }
                }
            }
        }
    }

    public void button_invisible() {       // その他のボタンを押せないようにする
        findViewById(R.id.button_1).setEnabled(false);
        findViewById(R.id.button_2).setEnabled(false);
        findViewById(R.id.button_3).setEnabled(false);
        findViewById(R.id.button_4).setEnabled(false);
        findViewById(R.id.button_5).setEnabled(false);
        findViewById(R.id.button_6).setEnabled(false);
        findViewById(R.id.button_7).setEnabled(false);
        findViewById(R.id.button_8).setEnabled(false);
        findViewById(R.id.button_9).setEnabled(false);
        findViewById(R.id.button_0).setEnabled(false);

        findViewById(R.id.button_add).setEnabled(false);
        findViewById(R.id.button_subtract).setEnabled(false);
        findViewById(R.id.button_multiply).setEnabled(false);
        findViewById(R.id.button_divide).setEnabled(false);
        findViewById(R.id.button_equal).setEnabled(false);

        findViewById(R.id.button_dot).setEnabled(false);
        findViewById(R.id.button_pa_sent).setEnabled(false);
        findViewById(R.id.button_puma).setEnabled(false);
    }

    public void button_visible() {       // その他のボタンを押せないようにする
        findViewById(R.id.button_1).setEnabled(true);
        findViewById(R.id.button_2).setEnabled(true);
        findViewById(R.id.button_3).setEnabled(true);
        findViewById(R.id.button_4).setEnabled(true);
        findViewById(R.id.button_5).setEnabled(true);
        findViewById(R.id.button_6).setEnabled(true);
        findViewById(R.id.button_7).setEnabled(true);
        findViewById(R.id.button_8).setEnabled(true);
        findViewById(R.id.button_9).setEnabled(true);
        findViewById(R.id.button_0).setEnabled(true);

        findViewById(R.id.button_add).setEnabled(true);
        findViewById(R.id.button_subtract).setEnabled(true);
        findViewById(R.id.button_multiply).setEnabled(true);
        findViewById(R.id.button_divide).setEnabled(true);
        findViewById(R.id.button_equal).setEnabled(true);

        findViewById(R.id.button_dot).setEnabled(true);
        findViewById(R.id.button_pa_sent).setEnabled(true);
        findViewById(R.id.button_puma).setEnabled(true);
    }

    /**
     * 文字サイズをレイアウトサイズに応じて変更します。
     *
     * @param layoutid 大元のレイアウトのID（ViewGroupであること）
     */
    private void setTextSizeByInch(int layoutid) {
        // ディスプレイ情報を取得する
        final DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        // ピクセル数（width, height）を取得する
        final int widthPx = metrics.widthPixels;
        final int heightPx = metrics.heightPixels;
        // dpi (xdpi, ydpi) を取得する
        final float xdpi = metrics.xdpi;
        final float ydpi = metrics.ydpi;
        // インチ（width, height) を計算する
        final float widthIn = widthPx / xdpi;
        final float heightIn = heightPx / ydpi;
        // 画面サイズ（インチ）を計算する
        final double in = Math.sqrt(widthIn * widthIn + heightIn * heightIn);
        // 4インチ以上は比率に応じて文字を拡大

        if (in > 4) {
            // 親のレイアウトを取得
            ViewGroup parent = (ViewGroup) findViewById(layoutid);
            setTextSizes(parent, in / 4);
        }
    }

    /**
     * 親のレイアウトに設定されている子Viewの文字を画面サイズに応じて倍加します。
     */
    private void setTextSizes(ViewGroup parent, double multiple) {
        for (int i = 0; i < parent.getChildCount(); i++) {
            View view = parent.getChildAt(i);
            if (view instanceof ViewGroup) {
                setTextSizes((ViewGroup) view, multiple);

            } else if (view instanceof TextView) {
                TextView targetView = (TextView) view;
                targetView.setTextSize(TypedValue.COMPLEX_UNIT_PX, (int) (targetView.getTextSize() * multiple));

            } else if (view instanceof ImageButton) {
                //Imageボタンのサイズ変更
                ImageButton target_button = (ImageButton) view;
                ViewGroup.LayoutParams lp = target_button.getLayoutParams();

                lp.width = (int) (target_button.getWidth() * multiple);
                lp.height = (int) (target_button.getHeight() * multiple);
                target_button.setLayoutParams(lp);

            }
        }
    }
}