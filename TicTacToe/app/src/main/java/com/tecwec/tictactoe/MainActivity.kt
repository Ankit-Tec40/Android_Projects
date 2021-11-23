package com.tecwec.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.Toast
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun btnClick(view:View){
        val btnSelected:Button=view as Button
        var cellId=0
        when (btnSelected.id){
            R.id.button1 -> cellId=1
            R.id.button2 -> cellId=2
            R.id.button3 -> cellId=3
            R.id.button4 -> cellId=4
            R.id.button5 -> cellId=5
            R.id.button6 -> cellId=6
            R.id.button7 -> cellId=7
            R.id.button8 -> cellId=8
            R.id.button9 -> cellId=9
        }
        playGame(cellId,btnSelected)

    }

    var activePlayer=1
    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()

    fun playGame(cellId:Int,btnSelected:Button){
        if(activePlayer==1){
            btnSelected.text="X"
            btnSelected.setBackgroundResource(R.color.green_light)
            player1.add(cellId)
            activePlayer=2
//            autoPlay()
        }else{
            btnSelected.text="O"
            btnSelected.setBackgroundResource(R.color.teal_light)
            player2.add(cellId)
            activePlayer=1
        }
        btnSelected.isEnabled=false
        checkWinner()
    }

    fun checkWinner(){
        var winer = -1


        // row 1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winer = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winer = 2
        }


        // row 2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winer = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winer = 2
        }

        // row 3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winer = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winer = 2
        }


        // col 1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winer = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winer = 2
        }


        // col 2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winer = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winer = 2
        }


        // col 3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winer = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winer = 2
        }

        // Left Diagonal
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winer = 1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winer = 2
        }

        // Right Diagonal
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winer = 1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winer = 2
        }


        if (winer == 1) {
            Toast.makeText(this, "Player 1 win the game", Toast.LENGTH_LONG).show()
            player1WinsCounts+=1
            restartGame()
        } else if (winer == 2) {
            Toast.makeText(this, "Player 2 win the game", Toast.LENGTH_LONG).show()
            player2WinsCounts+=1
            restartGame()
        }
        else if(player1.size+player2.size==9){
            Toast.makeText(this, "Draw", Toast.LENGTH_LONG).show()
            restartGame()
        }

    }

    fun autoPlay(){
        var emptyCells=ArrayList<Int>()
        for (cellId in 1..9){
            if( !(player1.contains(cellId) || player2.contains(cellId))) {
                emptyCells.add(cellId)
            }
        }

        if(emptyCells.size==0){
            restartGame()
        }
        val r = Random()
        val randIndex = r.nextInt(emptyCells.size )
        val cellId = emptyCells[randIndex]
        var btnSelected:Button?
        btnSelected =  when(cellId){
            1-> findViewById(R.id.button1)
            2-> findViewById(R.id.button2)
            3-> findViewById(R.id.button3)
            4-> findViewById(R.id.button4)
            5-> findViewById(R.id.button5)
            6-> findViewById(R.id.button6)
            7-> findViewById(R.id.button7)
            8-> findViewById(R.id.button8)
            9-> findViewById(R.id.button9)
            else ->{findViewById(R.id.button1)}

        }

        playGame(cellId, btnSelected)

    }



    var player1WinsCounts = 0
    var player2WinsCounts = 0

    fun restartGame(){

        activePlayer = 1
        player1.clear()
        player2.clear()

        for(cellId in 1..9){

            var btnSelected: Button? = when(cellId){
                1-> findViewById(R.id.button1)
                2-> findViewById(R.id.button2)
                3-> findViewById(R.id.button3)
                4-> findViewById(R.id.button4)
                5-> findViewById(R.id.button5)
                6-> findViewById(R.id.button6)
                7-> findViewById(R.id.button7)
                8-> findViewById(R.id.button8)
                9-> findViewById(R.id.button9)
                else ->{findViewById(R.id.button1)}

            }
            btnSelected!!.text = ""
            btnSelected.setBackgroundResource(R.color.cell_back)
            btnSelected.isEnabled = true
        }

        Toast.makeText(this,"Player1: $player1WinsCounts, Player2: $player2WinsCounts", Toast.LENGTH_LONG).show()


    }




}