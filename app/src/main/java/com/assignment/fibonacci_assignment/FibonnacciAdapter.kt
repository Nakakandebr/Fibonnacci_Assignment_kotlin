import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.assignment.fibonacci_assignment.R

class FibonacciAdapter(private val data: List<Int>) : RecyclerView.Adapter<FibonacciAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacciAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.numbers_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FibonacciAdapter.ViewHolder, position: Int) {
        holder.tvNumber.text = data[position].toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNumber: TextView = itemView.findViewById(R.id.tv_number)
    }
}