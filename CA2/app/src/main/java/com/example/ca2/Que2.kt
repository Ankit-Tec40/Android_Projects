package com.example.ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Que2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que2)

        val radioGroup=findViewById<RadioGroup>(R.id.radioGroup);
        var radioButton:RadioButton;
        var maths=findViewById<CheckBox>(R.id.checkBox);
        var physics=findViewById<CheckBox>(R.id.checkBox2);
        var chemistry=findViewById<CheckBox>(R.id.checkBox3);
        var biology=findViewById<CheckBox>(R.id.checkBox4);
        var computerScience=findViewById<CheckBox>(R.id.checkBox5);
        var english=findViewById<CheckBox>(R.id.checkBox6)
        var saveButton=findViewById<Button>(R.id.save_Button);


        radioGroup.setOnCheckedChangeListener { pr_RG, checkedId ->
            radioButton=findViewById(checkedId) ;
            Toast.makeText(this, "Gender Set to: "+radioButton.text, Toast.LENGTH_SHORT).show()
        }

        maths.setOnClickListener {
            var subject:String=maths.text.toString();
            if(maths.isChecked) {
                Toast.makeText(this, subject + " Selected", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, subject + " Unselected", Toast.LENGTH_SHORT).show()
            }
        }

        physics.setOnClickListener {
            var subject:String=physics.text.toString();
            if(physics.isChecked) {
                Toast.makeText(this, subject + " Selected", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, subject + " Unselected", Toast.LENGTH_SHORT).show()
            }
        }

        chemistry.setOnClickListener {
            var subject:String=chemistry.text.toString();
            if(chemistry.isChecked) {
                Toast.makeText(this, subject + " Selected", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, subject + " Unselected", Toast.LENGTH_SHORT).show()
            }
        }

        biology.setOnClickListener {
            var subject:String=biology.text.toString();
            if(biology.isChecked) {
                Toast.makeText(this, subject + " Selected", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, subject + " Unselected", Toast.LENGTH_SHORT).show()
            }
        }

        computerScience.setOnClickListener {
            var subject:String=computerScience.text.toString();
            if(computerScience.isChecked) {
                Toast.makeText(this, subject + " Selected", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, subject + " Unselected", Toast.LENGTH_SHORT).show()
            }
        }

        english.setOnClickListener {
            var subject:String=english.text.toString();
            if(english.isChecked) {
                Toast.makeText(this, subject + " Selected", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, subject + " Unselected", Toast.LENGTH_SHORT).show()
            }
        }

        saveButton.setOnClickListener {
            Toast.makeText(this, "Profile Saved", Toast.LENGTH_SHORT).show()
        }



    }

}