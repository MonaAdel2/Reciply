package com.reciply

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.reciply.R
import com.reciply.authentication.AuthActivity


class GuestFragment : Fragment() {

    lateinit var tvNoAccessGuest: TextView
    lateinit var tvBackToLogin: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guest, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvNoAccessGuest = view.findViewById(R.id.tv_no_access_for_guest)
        tvBackToLogin = view.findViewById(R.id.tv_back_to_login)

        tvBackToLogin.setOnClickListener {
            val intent = Intent(requireActivity(), AuthActivity::class.java)
            activity?.startActivity(intent)
            activity?.finish()
        }

    }


}