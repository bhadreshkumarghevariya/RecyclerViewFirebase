package com.ibhadresh.recyclerviewfirebase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private  val userList : ArrayList<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
        return UserViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return  userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val currentItem = userList[position]

        holder.firstName.text=currentItem.firstName
        holder.lastName.text=currentItem.lastName
        holder.age.text=currentItem.age

    }

    class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val firstName : TextView = itemView.findViewById(R.id.tvFirstName)
        val lastName : TextView = itemView.findViewById(R.id.tvLastName)
        val age : TextView = itemView.findViewById(R.id.tvAge)
    }
}