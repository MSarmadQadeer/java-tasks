public class SarmadiList {

    public static int[] append(int[] list, int value) {
        int[] newList = new int[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        newList[newList.length - 1] = value;
        return newList;
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) System.out.print(list[i] + "  ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] list = new int[0];
        printList(list);
        list = append(list, 1);
        printList(list);
        list = append(list, 2);
        printList(list);
        list = append(list, 3);
        printList(list);
    }
}