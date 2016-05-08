package com.example.nishikawadaiki.splitthecost;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // ボタンを設定
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                // オブジェクトを取得
                EditText etxtNum     = (EditText)findViewById(R.id.people);
                EditText etxtMoney   = (EditText)findViewById(R.id.money);
                TextView txtResult   = (TextView)findViewById(R.id.textView6);
                TextView txtOneMoney = (TextView)findViewById(R.id.textView5);
                TextView txtYen      = (TextView)findViewById(R.id.textView7);
                // 入力内容を取得
                String strNum   = etxtNum.getText().toString();
                String strMoney = etxtMoney.getText().toString();

                // 数値に変換
                int num   = Integer.parseInt(strNum);
                int money = Integer.parseInt(strMoney);

                // 割り勘計算
                int result = money / num;

                // 結果表示用テキストに設定
                txtResult.setText(Integer.toString(result));

                // 結果表示用テキストを表示
                txtOneMoney.setVisibility(View.VISIBLE);
                txtResult.setVisibility(View.VISIBLE);
                txtYen.setVisibility(View.VISIBLE);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
