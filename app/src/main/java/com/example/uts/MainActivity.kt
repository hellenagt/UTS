package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacAdapter(data, { onItem: FacData ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: FacData) {
        val showDetailActivityIntent = Intent(this, FacDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<FacData> {
        val rvList = ArrayList<FacData>()
        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "FAKULTAS ILMU KOMPUTER",
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Teknik Informatika\n" +
                        "2. Sistem Informasi"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "FAKULTAS TEKNIK",
                "Fakultas Teknik merupakan salah satu dari 7 Fakultas UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "FAKULTAS EKONOMI DAN BISNIS",
                "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Ekonomi Pembangunan\n" +
                        "2. Akuntansi\n" +
                        "3. Manajemen"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logoupnbaru,
                "FAKULTAS PERTANIAN",
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas UPN 'Veteran' Jawa Timur. Yang terdiri dari program studi: ",
                "1. Agroteknologi\n" +
                        "2. Agribisnis"
            )
        )
        rvList.add(
            FacData(
                R.drawable.woy,
                "DATA DIRI",
                "Nama : Hellen Agustina\n"+
                        "TTL : Tulungagung, 10 Agustus 1999\n" +
                        "Alamat : Tulungagung, Jawa Timur\n" +
                        "No. Hp : 08979632889\n" +
                        "Email : hellenagustina10@gmail.com\n" +
                        "Github : https://github.com/hellenagt\n" +
                        "Penghargaan : -\n",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. SDN Pagerwojo \n" +
                        "\t\t 2. SMPN 1 Kauman \n" +
                        "\t\t 3. SMAN 1 Kauman \n\n"

            )
        )
        return rvList
    }
}
