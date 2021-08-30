package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<ContactModel> listContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContacts, this);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContactModel contactModel = listContacts.get(position);
                Toast.makeText(MainActivity.this, contactModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        ContactModel contact = new ContactModel("F Tran", "0346111111", R.drawable.img_1);
        listContacts.add(contact);
        contact = new ContactModel("U Tran", "0346222222", R.drawable.img_2);
        listContacts.add(contact);
        contact = new ContactModel("C Tran", "0346333333", R.drawable.img_3);
        listContacts.add(contact);
        contact = new ContactModel("K Tran", "0346444444", R.drawable.img_1);
        listContacts.add(contact);
        contact = new ContactModel("U Tran", "0346555555", R.drawable.img_2);
        listContacts.add(contact);
        contact = new ContactModel("B Tran", "0346666666", R.drawable.img_3);
        listContacts.add(contact);
        contact = new ContactModel("I Tran", "0346777777", R.drawable.img_1);
        listContacts.add(contact);
        contact = new ContactModel("T Tran", "0346888888", R.drawable.img_2);
        listContacts.add(contact);
        contact = new ContactModel("C Tran", "0346999999", R.drawable.img_3);
        listContacts.add(contact);
        contact = new ContactModel("H Tran", "0346000000", R.drawable.img);
        listContacts.add(contact);

    }
}