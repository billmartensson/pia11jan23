package se.magictechnology.pia11jan23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ContactDetailFragment : Fragment() {

    lateinit var currentcontact : Contactperson

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.detailNameTV).text = currentcontact.contactname
        view.findViewById<TextView>(R.id.detailPhoneTV).text = currentcontact.contactphone
    }
}