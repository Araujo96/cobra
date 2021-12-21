package com.example.snake

class Cobra {
    var x = 8
    var y = 11
    var linha = 4
    var coluna = 4
    var type: Int = 0

    constructor(type: Int){
        this.type = type
        pCobra(type)
    }
    var cobra = Array(linha){
        Array(coluna){0}
    }


    fun pCobra(type: Int){
        when(type){
            //Peça I
            1 ->{
                this.cobra[1][0] = 1
                this.cobra[1][1] = 1
                this.cobra[1][2] = 1
                this.cobra[1][3] = 1
            }
        }
    }


    fun moveRight(){
        this.y++
    }

    fun moveLeft(){
        this.y--
    }


    fun moveDown(){
        this.x++
    }
    fun moveUp(){
        this.x--
    }




}