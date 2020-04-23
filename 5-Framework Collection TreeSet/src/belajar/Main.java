package belajar;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	TreeSet<Integer> data = new TreeSet<>();
	data.add(1);
	data.add(2);
	data.addAll(Arrays.asList(3,4,5));

    data.floor(8); // akan menampilkan data yang sama yang diisi dalam parameter atau yang terdekat dibawahnya
    data.ceiling(8); // akan menampilkan data yang sama yang diisi dalam parameter atau yang terdekat diatasnya
    data.higher(3); // akan menampilkan data yang lebih besar daripada parameter nya = 3
    data.lower(3); // dibawahnya
    data.last(); // data yg terakhir
    data.first(); // data yg pertama
    data.headSet(3); // akan menampilkan semua data yg berada di bawahnya);
    data.headSet(3,true); // akan menampilkan semua data yg berada di bawahnya dan juga nilai parameter nya karena diberikan boolean
    data.subSet(1,5); // rentang nilai antara paramater 1 dan kedua
    data.subSet(1,5); // rentang nilai antara paramater 1 dan kedua , akan menampilkan nilai lebih sama dengan 1 dan kurang sama denga 5
    data.descendingSet(); // mengurutkan dari yg terbesar sampai terkecil

    Iterator d = data.iterator();
    while(d.hasNext()) {
        System.out.println(d.next());
        }
    }
}
