package model

class PlusBintang: Pola,PolaInterface {
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
        val size = 8
        for (i in 0 until size) {
            for (j in 0 until size) {
                if (i == size / 2 || j == size / 2) {
                    print("* ")
                } else {
                    print(" " + " ")
                }
            }
            println()
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
        println("Membuat Pola PlusBintang dengan karakter ${this.karakter} dengan jumlah ${this.jumlah}")
    }
}