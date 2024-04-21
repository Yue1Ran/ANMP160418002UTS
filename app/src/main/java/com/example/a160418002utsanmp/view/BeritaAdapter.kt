package com.example.a160418002utsanmp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.a160418002utsanmp.R
import com.example.a160418002utsanmp.model.Berita
import com.squareup.picasso.Picasso

class BeritaAdapter (
    private val beritas: MutableList<Berita> = mutableListOf(),
    ): RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    //private val beritaAdapter = BeritaAdapter()
    class ViewHolder(
        view: View,
    ) : RecyclerView.ViewHolder(view) {
        val imageview : ImageView
        val textjudul: TextView
        val textUsername: TextView
        val textDes: TextView

        init {
            imageview = view.findViewById(R.id.imageBgD)
            textjudul = view.findViewById(R.id.txtJudulD)
            textUsername = view.findViewById(R.id.txtUsernameD)
            textDes = view.findViewById(R.id.txtPragrafD)

        }
    }
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        val buttonRead =  view.findViewById<Button>(R.id.btnDetail)
//
//        view.findViewById<RecyclerView>(R.id.recyclerViewBerita).apply {
//            adapter = beritaAdapter
//            layoutManager = LinearLayoutManager(context)
//            setHasFixedSize(true)
//        }
//        buttonRead.setOnClickListener {
//            val action = HomeFragmentDirections.actionHomeFragmentToDetailBeritaFragment()
//            Navigation.findNavController(it).navigate(action)
//        }
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.fragment_berita, parent, false)
        //val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_berita, parent, false)
        val buttonRead =  view.findViewById<Button>(R.id.btnNext)

        buttonRead.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToDetailBeritaFragment()
            Navigation.findNavController(it).navigate(action)
        }
//        val onButtonOpenDetailClick: (Int) -> Unit = { studentIndex ->
//             val action = HomeFragmentDirections.actionHomeFragmentToDetailBeritaFragment()
//            Navigation.findNavController(it).navigate(action)
        //}
        return ViewHolder(view)
        //return ViewHolder(view, onButtonOpenDetailClick)
    }

    override fun getItemCount() = beritas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            val berita = beritas[position]
            Picasso.get().load(berita.image).into(imageview)
            textjudul.text =
               berita.judul
            textUsername.text =
                berita.username
            textDes.text =
                berita.des
        }

    }


    fun updateData(data: List<Berita>) {
        beritas.clear()
        beritas.addAll(data)
        notifyDataSetChanged()
    }
}