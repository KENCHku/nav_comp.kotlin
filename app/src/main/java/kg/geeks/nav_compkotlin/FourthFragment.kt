package kg.geeks.nav_compkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.geeks.nav_compkotlin.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {

    private lateinit var binding: FragmentFourthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourthBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        val bundle = arguments
        if (bundle != null){

            binding.tvName.text = bundle.getString(Keys.KEY_NAME)
            binding.tvSurname.text = bundle.getString(Keys.KEY_SURNAME)
            binding.tvAge.text = bundle.getString(Keys.KEY_AGE)
            binding.tvGender.text = bundle.getString(Keys.KEY_GENDER)
            binding.tvSchool.text = bundle.getString(Keys.KEY_SCHOOL)
            binding.tvWork.text = bundle.getString(Keys.KEY_WORK)
        }
    }
}
