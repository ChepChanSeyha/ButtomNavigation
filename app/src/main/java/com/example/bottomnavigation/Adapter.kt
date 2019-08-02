package com.example.bottomnavigation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigation.activities.Detail
import com.example.bottomnavigation.activities.Details

class Adapter(private val userList: ArrayList<Model>, val context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.valId.text = userList[position].val_id.toString()
        holder.valFrom.text = userList[position].val_from
        holder.valTo.text = userList[position].val_to
        holder.valTotal.text = userList[position].val_total

        holder.itemView.setOnClickListener{
//            var intent = Intent(context, Detail::class.java)
//            context.startActivity(intent)
            var varID = userList[position].val_id
            val bundle = Bundle()
            bundle.putInt("key", varID)

            val fragment = Details()
            fragment.arguments = bundle
            (context as FragmentActivity).supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val valId: TextView = itemView.findViewById(R.id.val_id)
        val valFrom: TextView = itemView.findViewById(R.id.val_from)
        val valTo: TextView = itemView.findViewById(R.id.val_to)
        val valTotal: TextView = itemView.findViewById(R.id.val_total)

    }
}