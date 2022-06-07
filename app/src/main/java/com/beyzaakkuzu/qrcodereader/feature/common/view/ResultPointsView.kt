package com.beyzaakkuzu.qrcodereader.feature.common.view


import android.content.Context
import android.content.res.Resources
import android.graphics.*
import android.util.AttributeSet
import android.util.TypedValue
import android.view.View
import androidx.core.content.ContextCompat
import com.beyzaakkuzu.qrcodereader.R

class ResultPointsView : View {

    private val pointsPaint = Paint().apply {
        style = Paint.Style.STROKE
        color = Color.BLUE
        strokeWidth = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8f, Resources.getSystem().displayMetrics)
        strokeCap = Paint.Cap.ROUND
    }

    private var resultPoints = floatArrayOf()


    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : this(context, attrs, defStyleAttr, 0)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        context?.obtainStyledAttributes(attrs, R.styleable.ResultPointsView)?.apply {
            pointsPaint.color = getColor(
                R.styleable.ResultPointsView_resultPointColor,
                ContextCompat.getColor(context, R.color.blue)
            )

            pointsPaint.strokeWidth = getDimension(
                R.styleable.ResultPointsView_resultPointSize,
                pointsPaint.strokeWidth
            )

            recycle()
        }
    }


    override fun onDraw(canvas: Canvas) {
        canvas.drawPoints(resultPoints, pointsPaint)

//        if (BuildConfig.DEBUG) {
//            canvas.drawRect(rect, pointsPaint)
//        }
    }

}