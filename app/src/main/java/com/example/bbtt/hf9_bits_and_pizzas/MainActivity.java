package com.example.bbtt.hf9_bits_and_pizzas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        //Заполнение меню; элементы (если они есть) добавляются на панель действий.
        getMenuInflater().inflate(R.menu.menu_main, menu); //Объект меню, представляющий панель действий. Берет елементы действий из файла menu_main.xml и добавляет их в объект Menu напели действий.
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {                                //Проверить какой элемент
            case R.id.action_create_order:                         //был выбран пользователем
                //Код, выполняемый при выборе элемента Create Order
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
                return true;                                       //Возвращаемое true сообщает о том, что щелчок на элементе отработан
            case R.id.actions_settings:
                //Код, выполняемый при выборе элемента Settings
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
