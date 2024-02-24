import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // mambuat arraylist atk dan bag
        ArrayList<ATK> atkItem = new ArrayList<>();
        ArrayList<Bag> bagItem = new ArrayList<>();
        
        // menambahkan barang
        atkItem.add(new ATK("A001", "Pensil", "Pensil Aja", 50));
        atkItem.add(new ATK("A002", "Pena", "Pena Ajaib", 33));
        atkItem.add(new ATK("A003", "Spidol", "Spidol whiteboard best seller", 33));
        atkItem.add(new ATK("B001", "Buku", "Buku belajar yang menyenangkan", 54));
        atkItem.add(new ATK("B002", "Kertas", "Kertas kosong melompong", 47));
        
        // mengurangi barang
        atkItem.remove(new ATK("A002", "Pena", "Pena Ajaib", 33));

        // display semua barang atk
        for(ATK listBarang : atkItem) {
            System.out.println(listBarang.toString());
        }
        
        // menambahkan barang
        bagItem.add(new Bag("C001", "Kotak Pensil", "Kotak pensil istimewa", 44));
        bagItem.add(new Bag("C002", "Tas", "Tas kualistas super", 44));
        
        // display semua barang bag
        for(Bag listBarang : bagItem) {
            System.out.println(listBarang.toString());
        }

        // Saya tidak menggunakan class generic untuk operasi add, remove, edit
        // karena saya lupa cara membuatnya, hehe:)

    }
}
