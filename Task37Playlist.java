import java.util.LinkedList;
import java.util.Queue;

public class Task37Playlist {
    // private static Node head, tail;

    public static void main(String[] args) {
        Queue<Song> q1= new LinkedList<Song>();
        q1.add(new Song("Taylor Swift", "Shake It Off", "Pop", 2014, 1, "00:03:39"));
        q1.add(new Song("Taylor Swift", "Love Story", "Pop", 2008, 1, "00:03:55"));
        q1.add(new Song("Maroon 5", "Memories", "Pop/Rock", 2019, "00:03:09"));
        q1.remove();
        q1.add(new Song("Imagine Dragons", "Believer", "Pop/Rock", 2018, "00:03:24"));

        for(Song q2: q1)
        System.out.println("Playlist songs are: "+q2);
    }

//     public static Node createNode(Song song) {
//         Node node = new Node(song);
//         node.next = null;
//         return node;
//     }

//     public static void add(Song song) {
//         Node node = new Node(song);
//         if (tail != null) {
//             tail.next = node;
//         }
//         tail = node;
//         if(head == null){
//             head = node;
//         }
//     }

//     public static void show(Node head) {
//         Node temp = head;
//         while (temp.next != null) {
//             System.out.println(temp.song);
//             temp = temp.next;
//         }
//         System.out.println(temp.song);
//     }

// }

// class Node {
//     Song song;
//     Node next;

//     Node(Song song) {
//         this.song = song;
//     }
}
