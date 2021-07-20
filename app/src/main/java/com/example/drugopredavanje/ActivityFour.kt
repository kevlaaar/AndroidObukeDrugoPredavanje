package com.example.drugopredavanje

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.drugopredavanje.adapters.ContactsAdapter

class ActivityFour: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
        val recyclerView = findViewById<RecyclerView>(R.id.contactsRecycler)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val contact1 = ContactModel("Ime Jedan", "069123355")
        val contact2 = ContactModel("Ime Dva", "069123355")
        val contact3 = ContactModel("Ime Tri", "069123355")
        val contact4 = ContactModel("Ime Cetiri", "069123355")
        val contact5 = ContactModel("Ime Pet", "069123355")
        val contact6 = ContactModel("Ime Jedan", "069123355")
        val contact7 = ContactModel("Ime Dva", "069123355")
        val contact8 = ContactModel("Ime Tri", "069123355")
        val contact9 = ContactModel("Ime Cetiri", "069123355")
        val contact10 = ContactModel("Ime Pet", "069123355")
        val contact11 = ContactModel("Ime Jedan", "069123355")
        val contact12 = ContactModel("Ime Dva", "069123355")
        val contact13 = ContactModel("Ime Tri", "069123355")
        val contact14 = ContactModel("Ime Cetiri", "069123355")
        val contact15 = ContactModel("Ime Pet", "069123355")
        val contact16 = ContactModel("Ime Jedan", "069123355")
        val contact17 = ContactModel("Ime Dva", "069123355")
        val contact18 = ContactModel("Ime Tri", "069123355")
        val contact19 = ContactModel("Ime Cetiri", "069123355")
        val contact20 = ContactModel("Ime Pet", "069123355")

        val contactList = listOf(contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9, contact10
        ,contact11, contact12, contact13, contact14, contact15, contact16, contact17, contact18, contact19, contact20)


        val contactAdapter = ContactsAdapter(contactList, this)

        recyclerView.adapter = contactAdapter
    }
}