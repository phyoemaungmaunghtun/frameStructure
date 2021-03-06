package mm.com.phyoeMaung.frameStructure.factory

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import mm.com.phyoeMaung.frameStructure.ui.login.LoginFragment
import javax.inject.Inject


class MainFragmentFactory
@Inject
constructor(
    private val someString: String
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {

            LoginFragment::class.java.name -> {
                val fragment = LoginFragment(someString)
                fragment
            }

            else -> super.instantiate(classLoader, className)
        }
    }
}