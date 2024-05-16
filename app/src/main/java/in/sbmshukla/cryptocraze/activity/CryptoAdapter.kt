package `in`.sbmshukla.cryptocraze.activity

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import `in`.sbmshukla.cryptocraze.databinding.ViewholderItemBinding

public class CryptoAdapter():RecyclerView.Adapter<CryptoAdapter.CryptoViewHolder>() {
    private var cryptoList = ArrayList<CryptoWallet>()

    @SuppressLint("NotifyDataSetChanged")
    fun setCryptoList(cryptoList: ArrayList<CryptoWallet>) {
        this.cryptoList = cryptoList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoViewHolder {
        val binding =
            ViewholderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CryptoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CryptoViewHolder, position: Int) {
        val item = cryptoList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return cryptoList.size
    }

    class CryptoViewHolder(private val binding: ViewholderItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(cryptoWallet: CryptoWallet) {
            binding.cryptoWallet = cryptoWallet
            binding.executePendingBindings()
        }
    }
}