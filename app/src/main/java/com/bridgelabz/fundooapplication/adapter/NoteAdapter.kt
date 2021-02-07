package com.bridgelabz.fundooapplication.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bridgelabz.fundooapplication.R
import com.bridgelabz.fundooapplication.model.Note


class NoteAdapter(var notes: List<Note>) : RecyclerView.Adapter<NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val displayView = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_item_fragment, parent, false)
        Log.i("ON_Create_ViewHolder", "calling ->{$displayView}")
        return NoteViewHolder(displayView)
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = notes[position]
        holder.bind(note)
        Log.i("ON_BIND_VIEW_HOLDER", "Calling {$position}")

    }
}