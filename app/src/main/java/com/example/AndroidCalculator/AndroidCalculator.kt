package com.example.AndroidCalculator

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.AndroidCalculator.R
import android.widget.Toast
import java.math.BigDecimal
import java.util.*

class AndroidCalculator : AppCompatActivity(), View.OnClickListener {

    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        editText = findViewById(R.id.edit_text) as EditText
        val button1 = findViewById(R.id.button_1) as Button
        val button2 = findViewById(R.id.button_2) as Button
        val button3 = findViewById(R.id.button_3) as Button
        val button4 = findViewById(R.id.button_4) as Button
        val button5 = findViewById(R.id.button_5) as Button
        val button6 = findViewById(R.id.button_6) as Button
        val button7 = findViewById(R.id.button_7) as Button
        val button8 = findViewById(R.id.button_8) as Button
        val button9 = findViewById(R.id.button_9) as Button
        val button0 = findViewById(R.id.button_0) as Button
        val button_add = findViewById(R.id.button_add) as Button
        val button_sub = findViewById(R.id.button_sub) as Button
        val button_mul = findViewById(R.id.button_mul) as Button
        val button_div = findViewById(R.id.button_div) as Button
        val button_del = findViewById(R.id.button_del) as Button
        val button_neg = findViewById(R.id.button_neg) as Button
        val button_equ = findViewById(R.id.button_equ) as Button
        val button_pt = findViewById(R.id.button_pt) as Button
        val button_pc = findViewById(R.id.button_pc) as Button
        val button_fac = findViewById(R.id.button_fac) as Button
        val button_c = findViewById(R.id.button_c) as Button
        val button_root = findViewById(R.id.button_root) as Button
        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        button_add.setOnClickListener(this)
        button_sub.setOnClickListener(this)
        button_mul.setOnClickListener(this)
        button_div.setOnClickListener(this)
        button_del.setOnClickListener(this)
        button_neg.setOnClickListener(this)
        button_equ.setOnClickListener(this)
        button_pt.setOnClickListener(this)
        button_pc.setOnClickListener(this)
        button_fac.setOnClickListener(this)
        button_c.setOnClickListener(this)
        button_root.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {                                //添加菜单
        menuInflater.inflate(R.menu.main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {                            //事件处理
        when (item.itemId) {                                                                   //判断
            R.id.zhuye_item ->{                                                                //按zhuce按钮
                val intent = Intent(Intent.ACTION_VIEW)                                           //声明常量
                intent.data = Uri.parse("https://github.com/wenjiewu01?tab=projects&type=beta")                 //跳转网页
                startActivity(intent)                                                              //启动
            }
            R.id.tuichu_item -> finish()                                                        //按退出按钮，结束
        }

        return true
    }

    override fun onClick(v: View?) {
        var et = editText.getText().toString()
        when (v?.getId()) {
            R.id.button_0 -> {
                if (et == "0") et = "0" else et += "0"
                editText.setText(et)
            }
            R.id.button_1 -> {
                if (et == "0") et = "1" else et += "1"
                editText.setText(et)
            }
            R.id.button_2 -> {
                if (et == "0") et = "2" else et += "2"
                editText.setText(et)
            }
            R.id.button_3 -> {
                if (et == "0") et = "3" else et += "3"
                editText.setText(et)
            }
            R.id.button_4 -> {
                if (et == "0") et = "4" else et += "4"
                editText.setText(et)
            }
            R.id.button_5 -> {
                if (et == "0") et = "5" else et += "5"
                editText.setText(et)
            }
            R.id.button_6 -> {
                if (et == "0") et = "6" else et += "6"
                editText.setText(et)
            }
            R.id.button_7 -> {
                if (et == "0") et = "7" else et += "7"
                editText.setText(et)
            }
            R.id.button_8 -> {
                if (et == "0") et = "8" else et += "8"
                editText.setText(et)
            }
            R.id.button_9 -> {
                if (et == "0") et = "9" else et += "9"
                editText.setText(et)
            }
            R.id.button_pt -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.' ||
                (!et.contains("+") &&
                !et.contains("-") &&
                !et.contains("×") &&
                !et.contains("÷") &&
                et.contains("."))
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "."
                editText.setText(et)
            }
            R.id.button_add -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "+"
                editText.setText(et)
            }
            R.id.button_sub -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "-"
                editText.setText(et)
            }
            R.id.button_mul -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "×"
                editText.setText(et)
            }
            R.id.button_div -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Bad Input!",
                    Toast.LENGTH_SHORT).show()
                editText.setText(et)
            } else {
                et += "÷"
                editText.setText(et)
            }
            R.id.button_del -> {
                et = if (et.length > 1) {
                    if (et.length == 2 && et[0] == '-') {
                        "0"
                    } else et.substring(0, et.length - 1)
                } else {
                    "0"
                }
                editText.setText(et)
            }
            R.id.button_c -> {
                et = "0"
                editText.setText(et)
            }
            R.id.button_equ -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷') {
                Toast.makeText(
                    this@AndroidCalculator,
                    "Please complete the formula!",
                    Toast.LENGTH_SHORT
                ).show()
                editText.setText(et)
            } else {
                val res = getResult()
                if (res.contains("Infinity")) {
                    Toast.makeText(
                        this@AndroidCalculator,
                        "0 cannot be used as a divior!",
                        Toast.LENGTH_SHORT
                    ).show()
                    editText.setText("0")
                } else {
                    editText.setText(res)
                }
            }
            R.id.button_pc -> {
                var per = et.toDouble()
                per = per / 100
                var per1 = "" + per
                per1 = per1.replace("0+?$".toRegex(), "")
                per1 = per1.replace("[.]$".toRegex(), "")
                editText.setText(per1)
            }
            R.id.button_neg -> if (et[0] >= '0' && et[0] <= '9') {
                if (et == "0") {
                    editText.setText("0")
                } else {
                    editText.setText("-$et")
                }
            } else if (et[0] == '-') editText.setText(
                et.substring(1, et.length)
            ) else editText.setText(et)
            R.id.button_fac -> if (et.contains(".")) {
                Toast.makeText(this@AndroidCalculator,
                    "Not integer!",
                    Toast.LENGTH_SHORT).show()
            } else if (et[0] == '-') {
                Toast.makeText(this@AndroidCalculator,
                    "Not positive!",
                    Toast.LENGTH_SHORT).show()
            } else {
                if (et == "0") {
                    et = "1"
                    editText.setText(et)
                } else {
                    val num = et.toInt().toDouble()
                    var result = 1.0
                    var i = 1
                    while (i <= num) {
                        result = result * i
                        i++
                    }
                    et = result.toString()
                    editText.setText(et)
                }
            }
            R.id.button_root -> if (et[0] == '-') {
                Toast.makeText(
                    this@AndroidCalculator,
                    "Negative numbers cannot be squared!",
                    Toast.LENGTH_SHORT
                ).show()
                editText.setText("0")
            } else if (et.contains("+") ||
                et.contains("-") ||
                et.contains("×") ||
                et.contains("÷")
            ) {
                Toast.makeText(this@AndroidCalculator,
                    "Symbols cannot be squared!",
                    Toast.LENGTH_SHORT)
                    .show()
                editText.setText("0")
            } else {
                var x = et.toDouble()
                x = Math.sqrt(x)
                var x2 = formatResult(x)
                editText.setText(x2)
            }
            else -> {
                Toast.makeText(this@AndroidCalculator,
                    "Unexpected error!",
                    Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    fun formatResult(result: Double): String {
        var re = String.format("%.9f", result)
        re = re.replace("0+?$".toRegex(), "")
        re = re.replace("[.]$".toRegex(), "")
        return re
    }

    fun getResult(): String {
        val infix = editText.getText().toString()
        val postfix = toPostfix(infix)
        val result = toValue(postfix)
        var re = formatResult(result)
        return re
    }


    fun toPostfix(infix: String): StringBuffer {
        val stack = Stack<String>()
        val postfix = StringBuffer(infix.length * 2)
        var i = 0
        while (i < infix.length) {
            var ch = infix.get(i)
            when (ch) {
                '+' -> {
                    while (!stack.isEmpty() && stack.peek() != "(")
                        postfix.append(stack.pop())
                    stack.push(ch.toString() + "")
                    i++
                }
                '-' -> if (i == 0) {
                    postfix.append(0)
                    postfix.append(" ")
                    stack.push("(")
                    stack.push(ch.toString() + "")
                    i++
                } else {
                    while (!stack.isEmpty() && stack.peek() != "(")
                        postfix.append(stack.pop())
                    stack.push(ch.toString() + "")
                    i++
                }
                '×', '÷' -> {
                    while (!stack.isEmpty() &&
                        (stack.peek() == "×" || stack.peek() == "÷"))
                        postfix.append(stack.pop())
                    stack.push(ch.toString() + "")
                    i++
                }
                else -> if (i == 1 && infix.get(0) == '-') {
                    while (i < infix.length && ch >= '0' && ch <= '9' ||
                        i < infix.length && ch == '.') {
                        postfix.append(ch)
                        i++
                        if (i < infix.length) ch = infix.get(i)
                    }
                    postfix.append(" ")
                    postfix.append('-')
                    stack.pop()
                    stack.pop()
                } else {
                    while (i < infix.length && ch >= '0' && ch <= '9' ||
                        i < infix.length && ch == '.') {
                        postfix.append(ch)
                        i++
                        if (i < infix.length) ch = infix.get(i)
                    }
                    postfix.append(" ")
                }
            }
        }
        while (!stack.isEmpty())
            postfix.append(stack.pop())
        return postfix
    }

    fun toValue(postfix: StringBuffer): Double {
        val stack = Stack<Double>()
        var value = 0.0
        var j = 0
        var i = 0
        while (i < postfix.length) {
            j = i
            var ch = postfix.get(i)
            if (ch >= '0' && ch <= '9' || ch == '.') {
                value = 0.0
                while (ch != ' ') {
                    while (ch != ' ' && ch != '.') {
                        value = value * 10.0 + (ch - '0').toDouble()
                        j++
                        ch = postfix.get(++i)
                    }
                    if (ch != ' ' && ch == '.') ch = postfix.get(++i)
                    while (ch != ' ' && i >= j + 1) {
                        val valueBD = BigDecimal(value.toString())
                        val chBD = BigDecimal(ch - '0')
                        val nBD = BigDecimal(Math.pow(10.0, (i - j).toDouble()))
                        val temp = chBD.divide(nBD)
                        value = valueBD.add(temp).toDouble()
                        ch = postfix.get(++i)
                    }
                    stack.push(value)
                }
            } else {
                if (ch != ' ') {
                    var y: Double = stack.pop()
                    var x: Double = stack.pop()
                    value = when (ch) {
                        '+' -> x + y
                        '-' -> x - y
                        '×' -> x * y
                        '÷' -> x / y
                        else -> 0.0
                    }
                    stack.push(value)
                }
            }
            i++
        }
        return stack.pop()
    }

}