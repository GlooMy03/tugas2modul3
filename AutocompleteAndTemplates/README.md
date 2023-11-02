Nama : Nanda Adela Larasati Kuncoro
NIM : 202210370311080
1. Code yang saya ketikkan ini merupakan code untuk menghitung jumlah atom yang pada code saya merupakan code untuk menghitung jumlah atom untuk senyawa H2O.
2. Didalam public static void main, saya hanya memanggil method yang ada dan mengeluarkannya dengan system out println. 
3. Kemudia pada method hitungjumlahatom terdapat rumus untuk menghitung jumlah atom. 
4. Pada Map<String, Integer> atomCount = new HashMap<>(); merupakan cara untuk membuat objek `HashMap` dengan kunci bertipe `String` (elemen kimia) dan nilai bertipe `Integer` (jumlah atom).
5. Kemudian pada Pattern pattern = Pattern.compile("([A-Z][a-z]*)(\\d*)"); membuat pola regex untuk mencocokkan elemen kimia dan jumlah atomnya. Pola ini mencocokkan huruf besar (elemen) diikuti oleh huruf kecil (jika ada) dan kemudian angka (jika ada). Dan Matcher matcher = pattern.matcher(rumusKimia); mencocokkan pola regex dengan `rumusKimia` menggunakan objek `Matcher`.
6. Selanjutnya pada while dilakukan pencarian pola regex dalam rumusKimia. Jika cocok maka akan dilanjutkan akan diakumulasi dan dihitung. Kemudian mengembalikan total atom ke method di psvm
