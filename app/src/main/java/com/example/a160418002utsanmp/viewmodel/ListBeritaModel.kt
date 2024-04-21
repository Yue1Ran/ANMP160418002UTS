package com.example.a160418002utsanmp.viewmodel

import android.app.Application
import android.util.Log
import android.view.Menu
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.a160418002utsanmp.model.Berita
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ListBeritaModel(app: Application, ) : AndroidViewModel(app) {
    val beritas = MutableLiveData<List<Berita>>()

    fun refresh() {
        var gson = Gson()
        val json1 = "{\n" +
                "      \"id\": 1,\n" +
                "      \"username\": \"Iqbal\",\n" +
                "      \"image\": \"https://pbs.twimg.com/media/GIZlHn7XUAAIS8J?format=png&name=small\",\n" +
                "      \"judul\": \"Agent Valoran Terbaru Yang Akan Muncul\",\n" +
                "      \"des\": \"Agent valoran baru yang menarik dengan role controller dnegan abiliyt yang mengesankan\",\n" +
                "      \"paragraf\": \"Valoran akan merilis agent terbarunya yang akan mengisi role controller dengan ability yang dapat membuat agent baru ini bermain secara aggressive di karenakan skillnya yang dapat menghidupkan dirinya kembali setelah gugur dari pertempuran sepeti agent yang bernama phoenix agent ini bernama clove yang di kabarkan akan rilis pada bulan april 2024 berbarengan dengan VCT\",\n" +
                "      \"time\": \"23-08-2023\"\n" +
                "    }"
        val json2 = "{\n" +
                "      \"id\": 2,\n" +
                "      \"username\": \"Dwi\",\n" +
                "      \"image\": \"https://asset.kompas.com/crops/pz-nXCvOAqYviUknkMt-ysTYRxo=/76x0:606x353/750x500/data/photo/2023/09/29/6516568be708c.jpg\",\n" +
                "      \"judul\": \"Game Counter-Strike 2 Kedatangan Update Besar, Ada Mode Mirip Call of Duty\",\n" +
                "      \"des\": \"Mode terbaru dari game legend yaitu CS2 dengan nama Arms Race atau biasa di sebut team deathmatch\",\n" +
                "      \"paragraf\": \"Valve memperkenalkan mode baru Arms Race di Counter-Strike 2. Mode ini sebelumnya sudah hadir di prekuel CS2, yakni Counter-Strike: Global Offensive (CS:GO). Akan tetapi, CS2 pada peluncurannya tidak dilengkapi dengan mode Arms Race. Arms Race merupakan mode team deathmatch (TDM) yang membagi pemain dalam dua tim. Setiap pemain dalam tim ini bakal menggunakan senjata yang sama untuk saling mengalahkan. Baca juga: Dioprek, Game Counter Strike 2 Tembus 1.000 FPS Setiap mendapatkan dua kill, pemain akan mendapatkan senjata yang berbeda. Pemain harus berulang kali mendapatkan kill sampai akhirnya mendapatkan senjata pisau.\",\n" +
                "      \"time\": \"22-09-2023\"\n" +
                "    }"

        var berita1 = gson.fromJson(json1, Berita::class.java)
        var berita2 = gson.fromJson(json2, Berita::class.java)

        beritas.value = arrayListOf(berita1, berita2)
    }
}
