package dev.angara.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.angara.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castNumbers()
    }

    fun castNumbers(){
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = NumbersRecyclerViewAdapter(numberGenerator(100))
    }
    fun numberGenerator (n:Int):List<Int>{
        var list_numbers = ArrayList<Int>()
        var num1 = 0
        var num2 = 1

        for (x in 1..n){
            var sum = num1 + num2
            num1 = num2
            num2 = sum
            list_numbers.add(sum)
        }
        return list_numbers
    }
}