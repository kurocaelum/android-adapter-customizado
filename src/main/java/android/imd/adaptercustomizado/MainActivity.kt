package android.imd.adaptercustomizado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private val veiculos = mutableListOf(
        Veiculo("Onix", 2018, 1, true, true),
        Veiculo("Uno", 2007, 2, true, false),
        Veiculo("Del Rey", 1998, 3, false, true),
        Veiculo("Gol", 2014, 0, true, true),

        Veiculo("Onix", 2018, 1, true, true),
        Veiculo("Uno", 2007, 2, true, false),
        Veiculo("Del Rey", 1998, 3, false, true),
        Veiculo("Gol", 2014, 0, true, true),

        Veiculo("Onix", 2018, 1, true, true),
        Veiculo("Uno", 2007, 2, true, false),
        Veiculo("Del Rey", 1998, 3, false, true),
        Veiculo("Gol", 2014, 0, true, true)
    )

//    lateinit: inicializa a var apenas quando for utilizar, para não precisar declarar com "?"
    private lateinit var adapter: VeiculoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        var listView = ListView(this)
        setContentView(listView)

        adapter = VeiculoAdapter(this, veiculos)
        listView.adapter = adapter
    }
}
