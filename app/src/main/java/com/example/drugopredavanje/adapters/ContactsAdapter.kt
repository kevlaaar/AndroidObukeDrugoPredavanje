package com.example.drugopredavanje.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.drugopredavanje.ContactModel
import com.example.drugopredavanje.R

class ContactsAdapter (
    private val contactList: List<ContactModel>,
    private val context: Context
): RecyclerView.Adapter<ContactsAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        System.out.println("BINDING AN ELEMENT ON POSITION $position")
        val contact = contactList[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    inner class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private var nameTextView = itemView.findViewById<TextView>(R.id.contactNameTextView)
        private var numberTextView = itemView.findViewById<TextView>(R.id.contactNumberTextView)

        fun bind(contactModel: ContactModel) {
            nameTextView.text = contactModel.name
            numberTextView.text = contactModel.number
        }
    }

}