package model

class PiramidaTerbalik: Pola, PolaInterface {
    constructor(karakter: String, jumlah: Int) : super(karakter, jumlah){
        super.karakter = karakter
        super.jumlah = jumlah
    }

    constructor(jumlah: Int): super(jumlah){
        super.karakter = "*"
        super.jumlah = jumlah
    }   

    override fun membuatPola() {
        var tampung = 0
        for (i in super.jumlah downTo 1){
            for (j in 1..super.jumlah - i){
                super.resultPola += " "
            }
            while (tampung != 2 * i - 1){
                super.resultPola += karakter
                tampung++
            }
            super.resultPola += "\n"
            tampung = 0
        }
    }

    override fun getPola(): String {
        if (super.resultPola.isBlank()){
            return super.resultPola
        }

        super.resultPola = ""
        membuatPola()
        return super.resultPola
    }

    init {
        println("Membuat Pola Piramida Terbalik dengan karakter ${this.karakter} dengan jumlah ${this.jumlah}")
    }
}