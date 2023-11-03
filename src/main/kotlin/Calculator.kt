
//Saya membuat kelas dengan nama Calculator dengan bahasa Kotlin
// Kelas ini akan berisi metode-metode dan properti-properti yang dapat digunakan untuk melakukan operasi perhitungan
class Calculator {
    // Disini saya membuat deklarasi fungsi/metode dalam kelas Calculator,bernama "Add" dan menerima dua parameter
    fun add(first: Int, second: Int): Int {
    //first, bertipe data Integer, sebagai bilangan pertama yang akan dilakukan operasi penjumlahan
    //second juga bertipe data Integer, sebagai bilangan kedua yang akan dilakukan operasi penjumlahan
    //method ini juga memberikan deklarasi bahwa akan mengembalikan nilai dalam bentuk Integer setelah dieksekusi
        return first + second
    // Disini, method ini mengambil dua parameter, yaitu first dan second, dan menjumlahkannya dengan operator penambahan +
    //Hasil penjumlahan ini kemudian dikembalikan sebagai nilai balik (return) dari metode "add"
    }
}