package com.assignment.fibonacci_assignment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FibonacciAdapter(private val fibonacciNumbers: List<Int>) : RecyclerView.Adapter<FibonacciViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.numbers_list, parent, false)
        return FibonacciViewHolder(view)
    }

    override fun onBindViewHolder(holder: FibonacciViewHolder, position: Int) {
        holder.bind(fibonacciNumbers[position])
    }

    override fun getItemCount(): Int {
        return fibonacciNumbers.size
    }
}

class FibonacciViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(number: Int) {
        itemView.fibonacci.int = number.toString()
    }
}