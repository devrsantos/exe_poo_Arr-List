import java.util.*;

public class Programa {
    public static void main(String[] args) {

//        String[] nomes = new String[5];
//
//        nomes[0] = "Fernando";
//        nomes[1] = "Mario";
//        nomes[2] = "Carlos";
//        nomes[3] = "Simone";
//        nomes[4] = "Talita";
//
//        for (int i = 0; i < nomes.length; i++) {
//            System.out.println("Indice[" + i + "]: " + nomes[i]);
//        }
//
//        int j = 0;
//        while (j < nomes.length) {
//            System.out.println("Indice[" + j + "]: " + nomes[j]);
//            j++;
//        }
//
//        for (String value : nomes) {
//            System.out.println("Nomes: " + value);
//        }
//
//        List nossaLista = new ArrayList();
//
//        nossaLista.add("Felipe");
//        nossaLista.add("Bruno");
//        nossaLista.add("Julia");
//        nossaLista.add("Jade");
//        nossaLista.add("Natashy");
//
//        int i = 0;
//        for (i = 0; i < nossaLista.size(); i++) {
//            System.out.println(nossaLista.get(i));
//        }
//
//        Iterator it = nossaLista.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        };
//
//        for (Object obj: nossaLista) {
//            System.out.println(obj);
//        }
//
//        List link = new LinkedList();
//
//        link.add("Felipe");
//        link.add("Bruno");
//        link.add("Julia");
//        link.add("Jade");
//        link.add("Natashy");
//
//        for (Object lk: link) {
//            System.out.println((String) lk);
//        }

//        Set hs = new HashSet();
//
//        hs.add("Felipe");
//        hs.add("Bruno");
//        hs.add("Julia");
//        hs.add("Jade");
//        hs.add("Natashy");
//        hs.add("Natashy");
//
//        for (Object hash: hs) {
//            System.out.println((String) hash);
//        }

//        Set hs2 = new LinkedHashSet();
//
//        hs2.add("Felipe");
//        hs2.add("Bruno");
//        hs2.add("Julia");
//        hs2.add("Jade");
//        hs2.add("Natashy");
//        hs2.add("Natashy");
//
//        for (Object hash: hs2) {
//            System.out.println((String) hash);
//        }

//        Set hs3 = new TreeSet();
//
//        hs3.add("Felipe");
//        hs3.add("Bruno");
//        hs3.add("Julia");
//        hs3.add("Jade");
//        hs3.add("Natashy");
//        hs3.add("Natashy");
//
//        for (Object hash: hs3) {
//            System.out.println((String) hash);
//        }

        Map hashMap = new HashMap();

        hashMap.put(123, "Felipe");
        hashMap.put(456, "Bruno");
        hashMap.put(789, "Julia");
        hashMap.put(987, "Jade");
        hashMap.put(654, "Natashy");
        hashMap.put(321, "Natashy");

        System.out.println(hashMap.get(123));
    }
}
