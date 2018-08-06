package br.com.timongo.ratingbar

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.rating_bar_layout.view.*

class RatingBar : LinearLayout {

    constructor(context: Context): super(context)

    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr)

    private var rating: Int = 0

    init {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.rating_bar_layout, this, true)

        view.star_1.setOnClickListener {
            handleClick(1)
        }

        view.star_2.setOnClickListener {
            handleClick(2)
        }

        view.star_3.setOnClickListener {
            handleClick(3)
        }

        view.star_4.setOnClickListener {
            handleClick(4)
        }

        view.star_5.setOnClickListener {
            handleClick(5)
        }
    }

    private fun handleClick(value: Int) {
        rating = value

        when(rating) {
            1 -> {
                star_1.setImageResource(R.drawable.ic_star_black_24dp)
                star_2.setImageResource(R.drawable.ic_star_border_black_24dp)
                star_3.setImageResource(R.drawable.ic_star_border_black_24dp)
                star_4.setImageResource(R.drawable.ic_star_border_black_24dp)
                star_5.setImageResource(R.drawable.ic_star_border_black_24dp)
            }
            2 -> {
                star_1.setImageResource(R.drawable.ic_star_black_24dp)
                star_2.setImageResource(R.drawable.ic_star_black_24dp)
                star_3.setImageResource(R.drawable.ic_star_border_black_24dp)
                star_4.setImageResource(R.drawable.ic_star_border_black_24dp)
                star_5.setImageResource(R.drawable.ic_star_border_black_24dp)
            }
            3 -> {
                star_1.setImageResource(R.drawable.ic_star_black_24dp)
                star_2.setImageResource(R.drawable.ic_star_black_24dp)
                star_3.setImageResource(R.drawable.ic_star_black_24dp)
                star_4.setImageResource(R.drawable.ic_star_border_black_24dp)
                star_5.setImageResource(R.drawable.ic_star_border_black_24dp)
            }
            4 -> {
                star_1.setImageResource(R.drawable.ic_star_black_24dp)
                star_2.setImageResource(R.drawable.ic_star_black_24dp)
                star_3.setImageResource(R.drawable.ic_star_black_24dp)
                star_4.setImageResource(R.drawable.ic_star_black_24dp)
                star_5.setImageResource(R.drawable.ic_star_border_black_24dp)
            }
            5 -> {
                star_1.setImageResource(R.drawable.ic_star_black_24dp)
                star_2.setImageResource(R.drawable.ic_star_black_24dp)
                star_3.setImageResource(R.drawable.ic_star_black_24dp)
                star_4.setImageResource(R.drawable.ic_star_black_24dp)
                star_5.setImageResource(R.drawable.ic_star_black_24dp)
            }
        }
    }
}