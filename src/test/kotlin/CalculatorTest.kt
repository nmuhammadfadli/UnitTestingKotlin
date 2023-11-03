//Disini saya mengimpor anotasi @Test dari paket "org.junit.jupiter.api.Test"
//Anotasi @test digunakan untuk memindai method yang akan kita uji
import org.junit.jupiter.api.Test

//Saya membuat kelas CalculatorTest yang akan digunakan sebagai pengujian kelas Calculator
//Penamaan "Test" dibelakang nama, sebenarnya opsional, hanya untuk mempermudah kita dalam mengingat suatu kelas yang akan diuji
class CalculatorTest {
//Baris ini berguna untuk mendeklarasikan dan menginisialisasi variabel calculator dengan sebuah instansi objek dari kelas Calculator
//Ini akan digunakan dalam metode pengujian untuk memanggil metode add dari kelas Calculator
    val calculator = Calculator()
//Baris ini mendefinisikan metode pengujian dengan nama testAddSuccess
    @Test //Anotasi @Test menandai metode ini sebagai metode pengujian
    fun testAddSuccess(){//Baris ini mendefinisikan metode pengujian dengan nama testAddSuccess
        val result = calculator.add(10,10)
    //Disini kita memanggil metode add dari objek calculator dengan parameter 10 dan 10, dan hasilnya disimpan dalam variabel result
    }
    //Disini saya membuat pengujian yang sama dengan yang sevelumnya, dengan nama "testAddSuccess2"
    @Test
    fun testAddSuccess2(){
        val result = calculator.add(10,10)
    }
}