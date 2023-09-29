package com.amel.doadandzikirapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amel.doadandzikirapp.R
import com.amel.doadandzikirapp.model.DzikirDoa
import java.util.ArrayList

class DzikirDoaAdapter(private val ListDzikirDoa: ArrayList<DzikirDoa>) : RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {
    inner class MyViewHolder (view: View) : RecyclerView.ViewHolder(view){
        //initialization view dari layout row_item_dzikir.xml
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvLafadz: TextView = view.findViewById(R.id.tv_lafadz)
        val tvTerjemah: TextView = view.findViewById(R.id.tv_terjemah)
    }

    //menampilkan data sesuai dengan posisi layout yang ditentukan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    //menentukan jumlah data yang ditampilkan
    override fun getItemCount() = ListDzikirDoa.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //mengatur data dengan tampilan
        holder.tvDesc.text = ListDzikirDoa[position].desc
        holder.tvLafadz.text = ListDzikirDoa[position].lafadz
        holder.tvTerjemah.text = ListDzikirDoa[position].terjemah
    }

}