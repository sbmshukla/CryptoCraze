package `in`.sbmshukla.cryptocraze.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.Alignment
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import `in`.sbmshukla.cryptocraze.R
import `in`.sbmshukla.cryptocraze.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var cryptoAdapter: CryptoAdapter
    private var cryptoWalletList: ArrayList<CryptoWallet>?= ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        cryptoAdapter=CryptoAdapter()
        setUpCryptoWalletAdapter()

        cryptoWalletList?.add(
            CryptoWallet(
                cryptoSymbol = "BTC",
                picUrl = "",
                changePercent = 88.8,
                propertyAmount = 8.0,
                cryptoBalance = 82.0
            )
        )
        cryptoWalletList?.add(
            CryptoWallet(
                cryptoSymbol = "ETH",
                picUrl = "",
                changePercent = 42.5,
                propertyAmount = 56.0,
                cryptoBalance = 30.0
            )
        );

        cryptoWalletList?.add(
            CryptoWallet(
                cryptoSymbol = "XRP",
                picUrl = "",
                changePercent = -15.2,
                propertyAmount = 72.0,
                cryptoBalance = 50.0
            )
        );

        cryptoWalletList?.add(
            CryptoWallet(
                cryptoSymbol = "DOGE",
                picUrl = "",
                changePercent = 25.0,
                propertyAmount = 20.0,
                cryptoBalance = 15.0
            )
        );

        println(cryptoWalletList)
        cryptoWalletList?.let { cryptoAdapter.setCryptoList(cryptoList = it) }
    }

    private fun setUpCryptoWalletAdapter() {
        val layoutManager =
            GridLayoutManager(this@MainActivity,2,GridLayoutManager.VERTICAL,false)
        binding.rvCryptoWallet.apply {
            this.layoutManager = layoutManager
            adapter = cryptoAdapter
        }
    }
}