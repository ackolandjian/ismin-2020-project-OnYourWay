package com.ismin.projectapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LineAdapter(private val lines:ArrayList<Line>): RecyclerView.Adapter<LineViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineViewHolder {
        val row = LayoutInflater.from(parent.context).inflate(R.layout.row_line, parent, false)
        return LineViewHolder(row)
    }

    override fun onBindViewHolder(holder: LineViewHolder, position: Int) {
        val(name_line, shortname_groupoflines, status) = this.lines[position]

        holder.txvNameLine.text = name_line
        holder.txvShortNameGroupOfLine.text = shortname_groupoflines
        holder.txvStatus.text = status
    }

    override fun getItemCount(): Int {
        return this.lines.size
    }
}