package cat.insvidreres.inf.mvvmfromzero.usersFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import cat.insvidreres.inf.mvvmfromzero.R
import cat.insvidreres.inf.mvvmfromzero.databinding.FragmentUsersBinding
import cat.insvidreres.inf.mvvmfromzero.loginFragment.LoginResult


class UsersFragment : Fragment() {

    private lateinit var binding: FragmentUsersBinding
    private val viewModel: UsersViewModel by viewModels()

    private var loginSuccessfull: Boolean = false;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUsersBinding.inflate(inflater)

        val loginName = LoginResult.user

        if (loginName != "placeholder" && loginName != "") {
            loginSuccessfull = true
        }

        binding.viewContainer.setOnClickListener {
            if (loginSuccessfull) {
                viewModel.loginUser(LoginResult.user)
                binding.userNameTV.text = viewModel.user
                binding.userAgeTV.text = viewModel.age.toString()
                binding.userEmailTV.text = viewModel.email

                loginSuccessfull = false
            } else {
                viewModel.randomUser()
                binding.userNameTV.text = viewModel.user
                binding.userAgeTV.text = viewModel.age.toString()
                binding.userEmailTV.text = viewModel.email
            }
        }

        return binding.root
    }
}