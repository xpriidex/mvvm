package com.mvvm.demo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        nextButton.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToFirstFragment("Cabre")
            findNavController().navigate(action)
        }

        //nextButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_firstFragment))
    }
}
