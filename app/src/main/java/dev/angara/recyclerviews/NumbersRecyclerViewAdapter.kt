package dev.angara.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerViewAdapter(var numberslist: List<Int>) :
    RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.numbers_list, parent, false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumbers.text = numberslist.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numberslist.size
    }
}

class NumbersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
}