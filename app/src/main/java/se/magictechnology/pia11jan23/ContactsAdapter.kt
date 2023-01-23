package se.magictechnology.pia11jan23

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        /*
        val personName : TextView

        init {
            personName = view.findViewById(R.id.personNameTV)
        }
         */
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        Log.i("pia11debug", "SKAPA RAD")

        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i("pia11debug", "RITA RAD " + position.toString())

        //holder.personName.text = "Bartil " + position.toString()
    }

    override fun getItemCount(): Int {
        return 500
    }

}